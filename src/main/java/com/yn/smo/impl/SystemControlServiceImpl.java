package com.yn.smo.impl;

import Ice.StringHolder;
import com.yn.common.Constant;
import com.yn.common.Result;
import com.yn.smo.ISystemControlService;
import com.yn.util.ynService.SystemControllerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SystemControlServiceImpl implements ISystemControlService {
    private static final Logger log = LoggerFactory.getLogger(DataMonitorServiceImpl.class);

    @Override
    public Result newProject() {
        YNRPC.Result ynResult = SystemControllerUtil.newProject();
        Result result = new Result();
        try {

            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(ynResult.toString());
            System.out.println(result);
        } catch (Exception e) {
            log.error("newProject", e);
            result.addMsg(e.getMessage());
        }
        return result;
    }

    @Override
    public Result saveProject() {
        YNRPC.Result ynResult = SystemControllerUtil.saveProject();
        Result result = new Result();
        try {

            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(ynResult.toString());
            System.out.println(result);
        } catch (Exception e) {
            log.error("saveProject", e);
            result.addMsg(e.getMessage());
        }
        return result;
    }

    @Override
    public Result exportProject() {
        StringHolder stringHolder = SystemControllerUtil.exportProject();
        Result result = new Result();
        try {
            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(stringHolder.value);
            System.out.println(result);
        } catch (Exception e) {
            log.error("exportProject", e);
            result.addMsg(e.getMessage());
        }
        return result;
    }

    @Override
    public Result importProject(String fileName) {
        YNRPC.Result ynResult = SystemControllerUtil.importProject(fileName);
        Result result = new Result();
        try {
            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(ynResult.toString());
            System.out.println(result);
        } catch (Exception e) {
            log.error("importProject", e);
            result.addMsg(e.getMessage());
        }
        return result;
    }

    @Override
    public Result checkProject() {
        YNRPC.Result ynResult = SystemControllerUtil.checkProject();
        Result result = new Result();
        try {
            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(ynResult.toString());
            System.out.println(result);
        } catch (Exception e) {
            log.error("checkProject", e);
            result.addMsg(e.getMessage());
        }
        return result;
    }

    @Override
    public Result startProject() {
        YNRPC.Result ynResult = SystemControllerUtil.startProject();
        Result result = new Result();
        try {
            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(ynResult.toString());
            System.out.println(result);
        } catch (Exception e) {
            log.error("startProject", e);
            result.addMsg(e.getMessage());
        }
        return result;
    }

    @Override
    public Result stopProject() {
        YNRPC.Result ynResult = SystemControllerUtil.stopProject();
        Result result = new Result();
        try {
            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(ynResult.toString());
            System.out.println(result);
        } catch (Exception e) {
            log.error("stopProject", e);
            result.addMsg(e.getMessage());
        }
        return result;
    }

    @Override
    public Result rebootBox() {
        YNRPC.Result ynResult = SystemControllerUtil.rebootBox();
        Result result = new Result();
        try {
            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(ynResult.toString());
            System.out.println(result);
        } catch (Exception e) {
            log.error("rebootBox", e);
            result.addMsg(e.getMessage());
        }
        return result;
    }

    @Override
    public Result startDevice(String deviceName) {
        YNRPC.Result ynResult = SystemControllerUtil.startDevice(deviceName);
        Result result = new Result();
        try {
            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(ynResult.toString());
            System.out.println(result);
        } catch (Exception e) {
            log.error("startDevice", e);
            result.addMsg(e.getMessage());
        }
        return result;
    }

    @Override
    public Result stopDevice(String deviceName) {
        YNRPC.Result ynResult = SystemControllerUtil.stopDevice(deviceName);
        Result result = new Result();
        try {
            result.addCode(Constant.CODE_QUERY_SUCCESS);
            result.addMsg(ynResult.toString());
            System.out.println(result);
        } catch (Exception e) {
            log.error("stopDevice", e);
            result.addMsg(e.getMessage());
        }
        return result;
    }
}
