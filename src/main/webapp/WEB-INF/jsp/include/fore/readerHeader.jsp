<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/7
  Time: 22:07
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
    <link rel="stylesheet" href="css/bootstrap/3.3.6/bootstrap.min.css" />
    <link rel="stylesheet" href="css/fore/style.css" />
    <link rel="Shortcut Icon" href="img/favicon.ico"/>
    <script>
        function loginout() {
            $.post(
                "user_logout",
                {"_method": "DELETE"}
            );

        }
    </script>
</head>
<body>
<div class="read-top">
    <div>
        <img src="img/zongyueBg/logo.jpg" alt="阅">
        <img src="img/zongyueBg/logoName.jpg" alt="纵阅小说网">
    </div>
    <div>
        <ul>
            <li>
                <a href="">首页</a>
            </li>
            <li>
                <a href="javascript:">分类</a>
            </li>
            <li>
                <a href="rank">排行</a>
            </li>
            <li>
                <a href="all">书库</a>
            </li>
            <li>
                <a href="#">完本</a>
            </li>
            <li>
                <a href="author/login">作者专区</a>
            </li>
        </ul>
    </div>
    <div>
        <input type="text" placeholder="搜索" class="search-input" />
        <input type="submit" value="搜索" class="search-btn" />
    </div>
    <div class="readUserTop" id="notLogged">
        <a href="javascript:" id="loginIn">登录</a>
        <a href="user/register">注册</a>
    </div>
    <div class="readUserTop" id="userLogged">
        <a href="user/home">${user.user_nickname}</a>
        <a href="user/bookshelf">我的书架</a>
        <a href="javascript:" onclick="loginout()">退出</a>
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
                    <a href="#" style="float: right">忘记密码</a>
                </div>
            </div>
            <div class="modal-footer">

                <button type="button" class="btn btn-primary" id="userlogin">登录</button>
            </div>
        </div>
    </div>

</div>
<script>
    if (${user == null}) {
        $('#notLogged').css('display', 'block');
        $('#userLogged').css('display', 'none');
    } else {
        $('#notLogged').css('display', 'none');
        $('#userLogged').css('display', 'block');
    }
    $('#loginIn').click(function () {
        $('#loginModal').modal("show");
    });
    $('#userlogin').click(function () {
        $.post(
            "user/login",
            {"username":$('#username').val(),"password":$('#password').val()},
            function (result) {
                infoMsgChange(result);
            }
        )
    })
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
</script>