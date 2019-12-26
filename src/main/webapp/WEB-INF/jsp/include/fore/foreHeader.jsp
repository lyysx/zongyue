<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/28
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>">
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/bootstrap/3.3.6/bootstrap.min.css" />
    <link rel="stylesheet" href="css/fore/style.css" />
    <link rel="Shortcut Icon" href="img/favicon.ico"/>
    <script>
        <%--if (${user != null}) {--%>
        <%--$('.notLogged').css('display', 'none');--%>
        <%--$('.userLogged').css('display', 'block');--%>
        <%--$('#userJump').click(function () {--%>
        <%--$.post(--%>
        <%--"user_home",--%>
        <%--{"uid":${user.user_id}}--%>
        <%--);--%>

        <%--});--%>
        <%--} else {--%>
        <%--$('.notLogged').css('display', 'block');--%>
        <%--$('.userLogged').css('display', 'none');--%>
        <%--}--%>

        function loginIn() {
            $('#loginModal').modal("show");
        }

        // $('#loginIn').click(function () {
        //     $('#loginModal').modal("show");
        // });
        function userLogin() {
            $.post(
                "user/login",
                {"username":$('#username').val(),"password":$('#password').val()},
                function (result) {
                    infoMsgChange(result);
                }
            )
        }
        function infoMsgChange(result) {
            if (result.state == "success") {
                $('#infoMsg').attr("class", "alert alert-success");
                $('#infoMsg').html(result.message);
                location.reload();
            } else {
                $('#infoMsg').attr("class", "alert alert-danger");
                $('#infoMsg').html(result.message);
            }
        }

        function loginout() {
            $.post(
                "user/logout",
                {"_method": "delete"},
                function () {
                    location.reload();
                }
            );

        }
        <%--<c:if test="${user!=null}">--%>
        <%--function userJump() {--%>
            <%--$.post(--%>
                <%--"user_home",--%>
                <%--{"uid":${user.user_id}},--%>
                <%--function () {--%>
                    <%--location.href = "user_home";--%>
                <%--}--%>
            <%--);--%>
        <%--}--%>
        <%--</c:if>--%>


    </script>
</head>
<body>
<div class="top-head">
    <div class="top-logo">
        <a href="index">
        <img src="img/zongyueBg/logo.jpg" class="img-circle"><img src="img/zongyueBg/logoName.jpg">
        </a>
    </div>
    <div class="user-top notLogged"
    <c:if test="${user == null}"> style="display: block"</c:if>
    <c:if test="${user != null}"> style="display: none"</c:if>>
        <a href="javascript:" onclick="loginIn()">登录</a>
        <a href="user/register">注册</a>
    </div>
    <div class="user-top userLogged"
            <c:if test="${user != null}"> style="display: block"</c:if>
            <c:if test="${user == null}"> style="display: none"</c:if>>
        <a href="user/home">${user.user_nickname}</a>
        <a href="user/bookshelf">我的书架</a>
        <a href="javascript:" onclick="loginout()">退出</a>
    </div>
    <div class="top-search">
        <form action="search" method="get" target="_blank">
            <input type="text" placeholder="搜索" class="search-input" name="keyword" />
            <%--<button class="search-btn"> <span class="glyphicon glyphicon-search"></span></button>--%>
            <input type="submit" class="search-btn" value="搜索" />
        </form>
    </div>

</div>
<div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog" style="width: 350px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4>用户登录</h4>
            </div>
            <div class="modal-body">
                <div id="infoMsg">

                </div>
                <ul class="loginUl">
                    <li>
                        <span class="glyphicon glyphicon-user"></span>
                        <input type="text" id="username" />
                    </li>
                    <li>
                        <span class="glyphicon glyphicon-lock"></span>
                        <input type="password" id="password">
                    </li>
                </ul>
                <div>
                    <a href="user/register" style="float: left;">免费注册</a>
                    <a href="#" style="float: right">忘记密码</a>
                </div>
            </div>
            <div class="modal-footer">

                <button type="button" class="btn btn-primary" onclick="userLogin()">登录</button>
            </div>
        </div>
    </div>

</div>

