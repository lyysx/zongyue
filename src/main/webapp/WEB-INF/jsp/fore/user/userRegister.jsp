<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/7
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
<style>
    body{
        display: flex;
        align-items: center;
        justify-content: center;
    }
</style>
<html>
<head>
    <title>用户注册</title>
</head>
<body>

<div class="register">
    <div class="label label-primary">用户注册</div>
    <div class="userRegisterDiv">
            <ul>
                <li>
                    <span class="glyphicon glyphicon-user"></span>
                    <input class="form-control" placeholder="请输入用户名" type="text" name="username" id="username" />
                    <em id="userInfo"></em>
                </li>
                <li>
                    <span class="glyphicon glyphicon-lock"></span>
                    <input class="form-control" placeholder="请输入密码" type="password" name="password" id="password" />
                    <em id="passwordInfo"></em>
                </li>
                <li>
                    <span class="glyphicon glyphicon-lock"></span>
                    <input class="form-control" type="password" placeholder="请输入密码" id="password1" />
                    <em id="passwordInfo1"></em>
                </li>
            </ul>
            <div>
                <button type="submit" class="btn btn-primary" id="registerBtn">注册</button>
            </div>
    </div>
</div>
<script>
    function usernameCheck() {
        if ($('#username').val().length < 6 || $('#username').val().length > 12) {
            $('#userInfo').attr("class", "failEm");
            $('#userInfo').html("用户名长度必须在6和12之间");
            return false;
        } else {
            $('#userInfo').attr("class", "successEm");
            $('#userInfo').html("完成");
            return true;

        }
    }

    function passwordCheck() {
        if ($('#password').val().length < 6 || $('#password').val().length>12) {
            $('#passwordInfo').attr("class", "failEm");
            $('#passwordInfo').html("密码长度必须在6和12之间");
            return false;
        }else {
            $('#passwordInfo').attr("class", "successEm");
            $('#passwordInfo').html("完成");
            return true;
        }
    }

    function password1Check() {
        if ($('#password1').val() != $('#password').val()) {
            $('#passwordInfo1').attr("class", "failEm");
            $('#passwordInfo1').html("两次输入的密码不一致");
            return false;
        }else {
            $('#passwordInfo1').attr("class", "successEm");
            $('#passwordInfo1').html("完成");
            return true;
        }
    }
    $('#username').keyup(function () {
        usernameCheck();
    })
    $('#password').keyup(function () {
       passwordCheck()
        password1Check();
    })
    $('#password1').keyup(function () {
        passwordCheck()
        password1Check();
    });
    $('#registerBtn').click(function () {
        if (usernameCheck()&&passwordCheck()&&password1Check()) {
            $.get(
                "user/check_name_ajax",
                {"username": $('#username').val()},
                function (result) {
                    if (result.state == "false") {
                        $('#userInfo').attr("class", "failEm");
                        $('#userInfo').html(result.message);
                    } else {
                        $.post(
                            "user/register_ajax",
                            {"username":$('#username').val(),"password":$('#password').val()},
                            function () {
                                location.href = "user/register_result";
                            }
                        )
                    }
                }
            );
        } else {
            usernameCheck();
            passwordCheck();
            password1Check();
        }
    })
    
</script>
</body>
</html>
