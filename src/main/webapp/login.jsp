<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>管理员登录-后台管理系统</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="shortcut icon" href="./favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="./static/css/font.css">
    <link rel="stylesheet" href="./static/css/weadmin.css">
    <script src="./lib/layui/layui.js" charset="utf-8"></script>

</head>
<body class="login-bg">

<div class="login">
    <div class="message">后台管理系统</div>
    <div id="darkbannerwrap"></div>
    <form action="<%=basePath %>/login" method="post" class="layui-form">
        <input name="username" placeholder="用户名" type="text" lay-verify="required" class="layui-input">
        <hr class="hr15">
        <input name="password" lay-verify="required" placeholder="密码" type="password" class="layui-input">
        <hr class="hr15">
        <input class="loginin" value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
        <hr class="hr20">
        <div>
            前端静态展示，请随意输入，即可登录。
        </div>
    </form>
</div>

<script type="text/javascript">

    layui.extend({
        admin: '{/}./static/js/admin'
    });
    layui.use(['form', 'admin'], function () {
        var form = layui.form
            , admin = layui.admin;
        // layer.msg('玩命卖萌中', function(){
        //   //关闭后的操作
        //   });
        //监听提交
        // form.on('submit(login)', function(data){
        //
        //     //加载层-风格3
        //     layer.load(2);
        //       //此处演示关闭
        //     setTimeout(function(){
        //         layer.closeAll('loading');
        //     }, 2000);
        //
        //   layer.msg(JSON.stringify(data.field),function(){
        //       location.href='./index'
        //   });
        //   return false;
        // });


        form.on('submit(login)', function (data) {
            // var index = top.layer.msg('数据提交中，请稍候', {icon: 16, time: false, shade: 0.8});
            //加载层-风格3
            var index = layer.msg('登录中', {
                icon: 16
                ,shade: 0.01
            });
            // layer.load(2);
            // //此处演示关闭
            setTimeout(function(){
                layer.close(index);
            }, 2000);
            // $.ajax({
            //     url: data.form.action,
            //     type: data.form.method,
            //     data: $(data.form).serialize(),
            //     dataType: "json",
            //     success: function (info) {
            //         console.log(info);
            //         console.log(info.code);
            //         if (info.code === 201) {
            //             setTimeout(function () {
            //                 top.layer.close(index);
            //                 top.layer.msg(info.msg);
            //                 layer.closeAll("iframe");
            //                 //刷新父页面
            //                 parent.location.reload();
            //             }, 1000);
            //         }
            //     },
            //     error: function (info) {
            //         if (info.code === 200) {
            //             setTimeout(function () {
            //                 top.layer.close(index);
            //                 top.layer.msg(info.msg);
            //                 layer.closeAll("iframe");
            //                 //刷新父页面
            //                 parent.location.reload();
            //             }, 1000);
            //         }
            //         setTimeout(function () {
            //             top.layer.close(index);
            //             top.layer.msg(info.msg);
            //         }, 1000);
            //
            //     }
            // });
            return false;
        });

    });
</script>
<!-- 底部结束 -->
</body>
</html>