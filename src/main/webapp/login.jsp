<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="assets/css/layui.css">
    <link rel="stylesheet" href="assets/css/login.css">
    <link rel="icon" href="/favicon.ico">
    <title>管理后台</title>
</head>
<body class="login-wrap">
<div class="login-container">
    <form class="login-form" action="<%=basePath %>/login" method="post">
        <div class="input-group">
            <input type="text" id="username" name="username" class="input-field">
            <label for="username" class="input-label">
                <span class="label-title">用户名</span>
            </label>
        </div>
        <div class="input-group">
            <input type="password" id="password" name="password" class="input-field">
            <label for="password" class="input-label">
                <span class="label-title">密码</span>
            </label>
        </div>
        <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
        <button type="submit" class="login-button" onclick="severCheck();">登录<i class="ai ai-enter"></i></button>
    </form>
</div>
</body>
<script src="assets/layui.js"></script>
<%--<script type="text/javascript">--%>
<%--function severCheck() {--%>
<%--window.location.href = "index.html";--%>
<%--}--%>
<%--</script>--%>
<script>
    layui.define(['element'], function (exports) {

        var $ = layui.$;
        $('.input-field').on('change', function () {
            var $this = $(this),
                value = $.trim($this.val()),
                $parent = $this.parent();

            if (value !== '' && !$parent.hasClass('field-focus')) {
                $parent.addClass('field-focus');
            } else {
                $parent.removeClass('field-focus');
            }
        })
        exports('login');
    });
</script>
</html>