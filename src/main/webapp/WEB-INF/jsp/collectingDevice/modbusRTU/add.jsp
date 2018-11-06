<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加-采集设备配置-ModbusRTU采集-后台管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="../../static/css/font.css">
    <link rel="stylesheet" href="../../static/css/weadmin.css">
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="weadmin-body">
    <form class="layui-form" action="goAdd" method="post">
        <div class="layui-form-item">
            <label for="L_name" class="layui-form-label">
                <span class="we-red">*</span>设备名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_name" name="name" lay-verify="required|nikename"
                       autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_weight" class="layui-form-label">
                <span class="we-red">*</span>权重
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_weight" name="weight" lay-verify="required|number" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_port" class="layui-form-label">
                <span class="we-red">*</span>端口号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_port" name="port" lay-verify="required|number" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_acquisitionCycle" class="layui-form-label">
                采集周期
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_acquisitionCycle" name="clctInterval" lay-verify="number"
                       autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_clct_timeout" class="layui-form-label">
                采集超时
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_clct_timeout" name="clctTimeout" lay-verify="number"
                       autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_cmd_timeout" class="layui-form-label">
                命令超时
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_cmd_timeout" name="cmdTimeout" lay-verify="number" autocomplete="off"
                       class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                提示信息
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_fault_count" class="layui-form-label">
                允许失败次数
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_fault_count" name="faultCount" lay-verify="number" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_package_len" class="layui-form-label">
                包长度
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_package_len" name="packageLen" lay-verify="number" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_allow_empty_addr" class="layui-form-label">
                采集空地址
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_allow_empty_addr" name="allowEmptyAddr" lay-verify="number" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_byte_order16" class="layui-form-label">
                16位
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_byte_order16" name="byteOrder16" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_byte_order32" class="layui-form-label">
                32位
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_byte_order32" name="byteOrder32" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_byte_order64" class="layui-form-label">
                64位
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_byte_order64" name="byteOrder64" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_cmd_cache_size" class="layui-form-label">
                命令队列大小
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_cmd_cache_size" name="cmdCacheSize" lay-verify="number" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_active" class="layui-form-label">
                激活
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_active" name="active" autocomplete="off" lay-verify="number"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
            </label>
            <button class="layui-btn" id="L_repass" lay-filter="add" lay-submit="">确定</button>
            <!--<input type="text" name="dataId" id="dataId" value=""/>-->
        </div>
    </form>
</div>
<script src="../../lib/layui/layui.js" charset="utf-8"></script>
<script>
    layui.extend({
        admin: '{/}../../static/js/admin'
    });

    layui.use(['form', 'jquery', 'admin', 'layer'], function () {
        var form = layui.form,
            $ = layui.jquery,
            admin = layui.admin,
            layer = layui.layer;

        //自定义验证规则
        form.verify({
            nikename: function (value) {
                if (value.length < 1) {
                    return '不能为空';
                }
            },
            back_ip: function (value) {
                var reg = /^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/;
                if (value.length > 0) {
                    if (!reg.test(value)) {
                        return "请检查IP地址";
                    }
                }
            },
            ip: [
                /^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/
                , '请检查IP地址是否输入正确？'
            ],
            number: [/^[0-9]*$/, '必须输入数字']
        });


        form.on('submit(add)', function (data) {
            var index = top.layer.msg('数据提交中，请稍候', {icon: 16, time: false, shade: 0.8});
            $.ajax({
                url: data.form.action,
                type: data.form.method,
                data: $(data.form).serialize(),
                dataType: "json",
                success: function (info) {
                    console.log(info);
                    console.log(info.code);
                    if (info.code === 301) {
                        setTimeout(function () {
                            top.layer.close(index);
                            top.layer.msg(info.msg);
                            layer.closeAll("iframe");
                            //刷新父页面
                            parent.location.reload();
                        }, 1000);
                    } else {
                        top.layer.close(index);
                        top.layer.msg(info.msg);
                    }
                },
                error: function (info) {
                    if (info.code === 300) {
                        setTimeout(function () {
                            top.layer.close(index);
                            top.layer.msg(info.msg);
                            layer.closeAll("iframe");
                            //刷新父页面
                            parent.location.reload();
                        }, 1000);
                    }
                }
            });
            return false;
        });
    });


</script>
</body>
</html>