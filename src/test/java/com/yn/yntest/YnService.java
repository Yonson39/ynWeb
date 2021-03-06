package com.yn.yntest;

import Ice.StringHolder;
import YNRPC.DeviceInfo;
import YNRPC.KeyValue;
import YNRPC.Rvqt;
import com.yn.common.Constant;
import com.yn.common.Result;
import com.yn.entity.Points;
import com.yn.entity.PointsExample;
import com.yn.mapper.PointsMapper;
import com.yn.util.CSVUtils;
import com.yn.util.DateUtil;
import com.yn.util.ynService.DataMonitorUtil;
import com.yn.util.ynService.SystemControllerUtil;
import com.yn.util.ynService.systemInformationUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.*;

public class YnService {
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-sqlite.xml");
    }

    @Test
    public void DataMonitor() {
        com.yn.common.Result result = new com.yn.common.Result();
        DeviceInfo[] deviceInfos = DataMonitorUtil.getDevicesState();
        List<HashMap<String, Object>> mMenuData = new ArrayList<>();

        for (int i = 0; i < deviceInfos.length; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("devName", deviceInfos[i].devName);
            map.put("devState", deviceInfos[i].devState);
            mMenuData.add(map);
        }

        result.addCode(Constant.CODE_QUERY_SUCCESS);
        result.addMsg(Constant.MSG_QUERY_SUCCESS);
        result.addCount(deviceInfos.length);
        result.addData(mMenuData);
        System.out.println(result);
    }


    @Test
    public void systemInformationUtil() {
        com.yn.common.Result result = new com.yn.common.Result();
        KeyValue[] keyValues = systemInformationUtil.getSystemResourcesState();

        List<HashMap<String, Object>> mMenuData = new ArrayList<>();

        for (int i = 0; i < keyValues.length; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("name", keyValues[i].name);
            map.put("val", keyValues[i].val);
            mMenuData.add(map);
        }

        result.addCode(Constant.CODE_QUERY_SUCCESS);
        result.addMsg(Constant.MSG_QUERY_SUCCESS);
        result.addCount(keyValues.length);
        result.addData(mMenuData);
        System.out.println(result);

    }

    @Test
    public void getAppRunState() {
        com.yn.common.Result result = new com.yn.common.Result();
        KeyValue[] keyValues = systemInformationUtil.getAppRunState();

        List<HashMap<String, Object>> mMenuData = new ArrayList<>();

        for (int i = 0; i < keyValues.length; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("name", keyValues[i].name);
            map.put("val", keyValues[i].val);
            mMenuData.add(map);
        }

        result.addCode(Constant.CODE_QUERY_SUCCESS);
        result.addMsg(Constant.MSG_QUERY_SUCCESS);
        result.addCount(keyValues.length);
        result.addData(mMenuData);
        System.out.println(result);

    }

    @Test
    public void getNetportsState() {
        com.yn.common.Result result = new com.yn.common.Result();
        DeviceInfo[] deviceInfos = systemInformationUtil.getNetportsState();
        List<HashMap<String, Object>> mMenuData = new ArrayList<>();

        for (int i = 0; i < deviceInfos.length; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("devName", deviceInfos[i].devName);
            map.put("devState", deviceInfos[i].devState);
            mMenuData.add(map);
        }

        result.addCode(Constant.CODE_QUERY_SUCCESS);
        result.addMsg(Constant.MSG_QUERY_SUCCESS);
        result.addCount(deviceInfos.length);
        result.addData(mMenuData);
        System.out.println(result);
    }

    @Test
    public void queryRealData() {
        PointsMapper mapper = (PointsMapper) applicationContext.getBean("pointsMapper");
        Points points = new Points();

//        points.setName("RTU_RTU1_AO16_1");
//        points.setcDev("CRTU_com9");
        points.setcDev("CRTU_com1");
//        points.setfDev("FRTU_com1");
        String[] strings = mapper.selectPoints(points);

        System.out.println("ad" + strings.length);
        for (String s : strings) {
//            System.out.println(s);
        }

        int[] ints = DataMonitorUtil.queryPointIds(strings);

        com.yn.common.Result result = new com.yn.common.Result();
        List<HashMap<String, Object>> maps = new ArrayList<>();
        try {

            Rvqt[] rvqts = DataMonitorUtil.queryRealData(ints);
            for (int i = 0; i < rvqts.length; i++) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("name", strings[i]);
                map.put("id", ints[i]);
                map.put("q", rvqts[i].q);
                map.put("r", rvqts[i].r);
                map.put("t", rvqts[i].t);
                map.put("v", rvqts[i].v);
                maps.add(map);
            }

            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(Constant.MSG_QUERY_SUCCESS);
            result.addCount(rvqts.length);
            result.addData(maps);
            System.out.println(result);
        } catch (Exception e) {
//            log.error("query", e);
            result.addMsg(e.getMessage());
        }
    }

    @Test
    public void expotRealData() {
        PointsMapper mapper = (PointsMapper) applicationContext.getBean("pointsMapper");
        Points points = new Points();

        String[] strings = mapper.selectPoints(points);

        System.out.println("ad" + strings.length);
        for (String s : strings) {
//            System.out.println(s);
        }

        int[] ints = DataMonitorUtil.queryPointIds(strings);

        com.yn.common.Result result = new com.yn.common.Result();
        List<HashMap<String, Object>> maps = new ArrayList<>();
        try {

            Rvqt[] rvqts = DataMonitorUtil.queryRealData(ints);
            List exportData = new ArrayList<Map>();
            for (int i = 0; i < rvqts.length; i++) {
                HashMap<String, Object> map = new HashMap<>();
                Map row1 = new LinkedHashMap<String, String>();

                row1.put("name", strings[i]);
                row1.put("id", ints[i]);
                row1.put("q", rvqts[i].q);
                row1.put("r", rvqts[i].r);
                row1.put("t", rvqts[i].t);
                row1.put("v", rvqts[i].v);


                exportData.add(row1);
            }
            LinkedHashMap lie = new LinkedHashMap();
            lie.put("name", "name");
            lie.put("id", "id");
            lie.put("q", "q");
            lie.put("r", "r");
            lie.put("t", "t");
            lie.put("v", "v");

            String path = "c:/export/";
            System.out.println("asdsa");
            String time = DateUtil.getSdfTimes();

            String fileName = time;
            System.out.println(time + "asd");
            File file = CSVUtils.createCSVFile(exportData, lie, path, time);
            String fileName2 = file.getName();
            System.out.println("文件名称：" + fileName2 + path);
            System.out.println(fileName);
        } catch (Exception e) {
//            log.error("query", e);
            result.addMsg(e.getMessage());
        }
    }


    @Test
    public void exportProject() {
        StringHolder stringHolder = SystemControllerUtil.exportProject();
        System.out.println(stringHolder.value);
    }

    @Test
    public void queryRealData2() {
        PointsMapper mapper = (PointsMapper) applicationContext.getBean("pointsMapper");

        Points points = new Points();
        points.setLastCount(1);
        points.setPageSize(5);
        String[] strings = mapper.selectPoints(points);
        System.out.println(strings.toString());
        int[] ints = DataMonitorUtil.queryPointIds(strings);
        System.out.println(ints.length + "length");
    }


    @Test
    public void newProject() {
        YNRPC.Result ynResult = SystemControllerUtil.newProject();
        Result result = new Result();
//        List<HashMap<String, Object>> maps = new ArrayList<>();

        result.addCode(Constant.CODE_QUERY_SUCCESS);
        result.addMsg(ynResult.toString());
//            result.addCount(rvqts.length);
//            result.addData(maps);
        System.out.println(result);

    }


}