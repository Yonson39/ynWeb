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
    <title>串口配置-后台管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="../static/css/font.css">
    <link rel="stylesheet" href="../static/css/weadmin.css">
    <link rel="stylesheet" href="../static/css/view.css"/>
    <link rel="stylesheet" href="../static/css/layui.css">
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="layui-view-body">
<div class="layui-content">
    <div class="layui-row layui-col-space20">
        <div class="layui-col-sm12 layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-body chart-card">
                    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 10px;">
                        <legend>串口配置</legend>
                    </fieldset>
                    <div class="layui-card-body">
                        <div class="form-box">
                            <!--<a class="layui-btn layui-btn-blue" id="addUser"><i class="layui-icon">&#xe654;</i>新增</a>-->
                            <table id="comConfig"></table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="../lib/layui/layui.js" charset="utf-8"></script>
<script>
    layui.extend({
        admin: '{/}../static/js/admin'
    });

    layui.use(['table', 'jquery', 'form', 'admin'], function () {
        var table = layui.table,
            $ = layui.jquery,
            form = layui.form,
            admin = layui.admin;


        //展示com配置数据
        table.render({
            elem: '#comConfig',
            cellMinWidth: 80,
            cols: [[ //标题栏
                {field: 'port_number', title: '串口号'}
                , {field: 'send_delay', title: '发送间隔'}
                , {field: 'recv_timeout', title: '接收超时'}
                , {field: 'baud_rate', title: '波特率'}
                , {field: 'parity', title: '奇偶校验位'}
                , {field: 'data_bits', title: '数据位'}
                , {field: 'stop_bits', title: '停止位'}
            ]],
            data: [{
                "port_number": "ETH1"
                , "send_delay": "200"
                , "recv_timeout": "1000"
                , "baud_rate": "14400"
                , "parity": "NONE"
                , "data_bits": "7"
                , "stop_bits": "1"
            }, {
                "port_number": "ETH1"
                , "send_delay": "200"
                , "recv_timeout": "1000"
                , "baud_rate": "14400"
                , "parity": "NONE"
                , "data_bits": "7"
                , "stop_bits": "1"
            }, {
                "port_number": "ETH1"
                , "send_delay": "200"
                , "recv_timeout": "1000"
                , "baud_rate": "14400"
                , "parity": "NONE"
                , "data_bits": "7"
                , "stop_bits": "1"
            },{
                "port_number": "ETH1"
                , "send_delay": "200"
                , "recv_timeout": "1000"
                , "baud_rate": "14400"
                , "parity": "NONE"
                , "data_bits": "7"
                , "stop_bits": "1"
            },{
                "port_number": "ETH1"
                , "send_delay": "200"
                , "recv_timeout": "1000"
                , "baud_rate": "14400"
                , "parity": "NONE"
                , "data_bits": "7"
                , "stop_bits": "1"
            },{
                "port_number": "ETH1"
                , "send_delay": "200"
                , "recv_timeout": "1000"
                , "baud_rate": "14400"
                , "parity": "NONE"
                , "data_bits": "7"
                , "stop_bits": "1"
            }]
            , skin: 'line' //表格风格
            , even: true
            , page: true //是否显示分页
            , limits: [5, 7, 10]
            , limit: 5 //每页默认显示的数量
        });

        /*
         *数据表格中form表单元素是动态插入,所以需要更新渲染下
         * http://www.layui.com/doc/modules/form.html#render
         * */
        $(function () {
            form.render();
        });
    });


</script>
</html>