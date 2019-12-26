<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/2
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="../include/admin/adminHeader.jsp"%>
    <title>管理员登录</title>

<script>

    $(function () {
        <c:if test="${!empty msg}">
            $("div#errorMsg").html("${msg}");
        </c:if>
    }
    )
</script>
<div class="wrapper">
    <div id="web_bg" style="background-image: url(/zongyue/img/zongyueBg/zongyue_bg.jpg)"></div>
</div>
<div class="loginDiv">
    <div id="errorMsg">

    </div>
    <form class="loginForm" action="admin/login" method="post">
        <div class="text-muted">账号登录</div>
        <ul>
            <li>
                <input class="form-control" type="text" name="admin_name" placeholder="请输入用户名">
            </li>
            <br>
            <li>
                <input class="form-control" type="password" name="admin_password" placeholder="请输入密码">
            </li>
        </ul>
        <br>
        <div>
            <button class="btn btn-primary" type="submit">登录</button>
        </div>

    </form>


</div>

<%@include file="../include/admin/adminFooter.jsp"%>
