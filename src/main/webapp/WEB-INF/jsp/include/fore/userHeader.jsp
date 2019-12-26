<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/8
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>">
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/bootstrap/3.3.6/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/fore/style.css"/>
    <link rel="stylesheet" href="css/bootstrap-datepicker/1.8.0/bootstrap-datepicker.min.css" />
    <script src="js/bootstrap-datepicker/1.8.0/bootstrap-datepicker.min.js"></script>
    <script src="js/bootstrap-datepicker/1.8.0/bootstrap-datepicker.zh-CN.min.js" charset="UTF-8" ></script>
    <link rel="Shortcut Icon" href="img/favicon.ico"/>

    <%--<script>--%>
        <%--$('#myHome').click(function () {--%>
            <%--this.parent().attr("class", "active");--%>
            <%--$('#myBookshelf').parent().removeAttr("class");--%>
        <%--})--%>
        <%--$('#myBookshelf').click(function () {--%>
            <%--this.parent().attr("class", "active");--%>
            <%--$('#myHome').parent().removeAttr("class");--%>
        <%--})--%>
    <%--</script>--%>
</head>
<body>
<div class="userHeadTop">
    <div class="userLogo">
        <img src="img/zongyueBg/logo.jpg">
        <a href="user/home">个人中心</a>
    </div>
    <ul>
        <li id="myHome">
            <a href="user/home" >我的首页</a>
        </li>
        <li id="myBookshelf">
            <a href="user/bookshelf" >我的书架</a>
        </li>
    </ul>
    <div class="pos">
        <a href="">返回首页</a>
        <a href="user/home">${user.user_nickname}</a>
    </div>

</div>

