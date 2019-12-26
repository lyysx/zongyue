<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/3
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>">
    <script src="js/jquery/2.0.0/jquery.min.js" ></script>
    <script src="js/bootstrap/3.3.6/bootstrap.min.js" ></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet" />
    <link href="css/admin/style.css" rel="stylesheet">
    <link rel="Shortcut Icon" href="img/favicon.ico"/>
</head>
<body>

