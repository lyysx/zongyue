<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/23
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="../include/author/authorHeader.jsp"%>
<title>作者注册</title>
<script>

    $(function(){
        $("#login_name").keyup(function () {

            var value = $(this).val();
            if (value.length <= 5 || value.length >=12) {
                $("#login_name_message").attr("class", "label label-warning");
                $("#login_name_message").html("账号长度应为6-12");
            } else {
                $("#login_name_message").attr("class", "label label-success");
                $("#login_name_message").html("账号可以使用");
            }
            /*$.get(
                page,
                {"author_login_name": value},
                function (result) {
                    if (result == "success") {
                        $("#login_name_message").attr("class", "label label-success");
                        $("#login_name_message").html("账号可以使用");
                    } else {
                        $("#login_name_message").attr("class", "label label-danger");
                        $("#login_name_message").html("账号已被注册");
                    }
                }
            );*/
            
        });
        $('#passwordTxt').keyup(function () {
            var length = $(this).val().length;
            if (length<6){
                $("#password_message").attr("class", "label label-warning");
                $("#password_message").html("密码长度必须大于等于6");
            } else if (length > 12) {
                $("#password_message").attr("class", "label label-warning");
                $("#password_message").html("密码长度必须小于等于12");
            } else {
                $("#password_message").attr("class", "label label-success");
                $("#password_message").html("密码可以使用");
            }
        })
        $('#passwordTxt1').keyup(function () {
            var passwd1 = $('#passwordTxt').val();
            var passwd2 = $(this).val();
            if (passwd1.length<6){
                $("#password_message").attr("class", "label label-warning");
                $("#password_message").html("密码长度必须大于等于6");
            } else if (passwd1.length > 12) {
                $("#password_message").attr("class", "label label-warning");
                $("#password_message").html("密码长度必须小于等于12");
            } else {
                $("#password_message").attr("class", "label label-success");
                $("#password_message").html("密码可以使用");
            }
            if (passwd1 == passwd2) {
                $("#password_message1").attr("class", "label label-success");
                $("#password_message1").html("密码可以使用");
            } else {
                $("#password_message1").attr("class", "label label-warning");
                $("#password_message1").html("两次密码不一致");
            }

        });
        // function check() {
        //     var loginName = $("#login_name").val();
        //     var password = $("#passwordTxt").val();
        //     var password1 = $("#passwordTxt1").val();
        //     if (loginName.length <= 6) {
        //         $("#login_name_message").val().html("用户名长度不能小于6");
        //         alert("!!!!!!!")
        //         return false;
        //     }
        //     if (password.length <= 6) {
        //         $("#passwordTxt_message").val().html("密码长度不能小于6");
        //         return false;
        //     }
        //     if (password != password1) {
        //         $("#password_message1").val().html("两次输入的密码不一致");
        //         return false;
        //     }
        //
        // }
        $("#registerForm").submit(function () {

            var loginName = $("#login_name").val();
            var password = $("#passwordTxt").val();
            var password1 = $("#passwordTxt1").val();
            if (loginName.length >= 6 && loginName.length <= 12) {
                if (password.length > 5 && password.length <= 12) {
                    /*$("#password_message").attr("class", "label label-success");
                    $("#password_message").html("完成");*/
                    if (password == password1) {
                        return true;
                        /*$.get(
                            "author/login_name_ajax",
                            {"author_login_name": value},
                            function (result) {
                                if (result == "success") {
                                    $("#login_name_message").attr("class", "label label-success");
                                    $("#login_name_message").html("账号可以使用");
                                    return true;
                                } else {
                                    $("#login_name_message").attr("class", "label label-danger");
                                    $("#login_name_message").html("账号已被注册");
                                    return false;
                                }
                            });*/

                    } else {
                        $("#password_message1").attr("class", "label label-warning");
                        $("#password_message1").html("两次输入的密码不一致");
                    }
                } else {
                    $("#password_message").attr("class", "label label-warning");
                    $("#password_message").html("密码长度必须为6-12");
                }
            } else {

            }
            return false;
            // if (password.length <= 6) {
            //     $("#passwordTxt_message").val().html("密码长度不能小于6");
            //     return false;
            // }else if (password != password1) {
            //     $("#password_message1").val().html("两次输入的密码不一致");
            //     return false;
            // }

        });


    });
</script>
<title>作者注册</title>
<div class="authorRegisterDiv" id="author_register">
    <div class="label label-info">作者注册</div>
    <form action="author/register" method="post" id="registerForm" class="registerForm">
        <c:if test="${msg}">
            <div style="color: red;">${msg}</div>
        </c:if>
        <ul>
            <li>
                <em>作者登录名</em>
                <input type="text" name="author_login_name" placeholder="请输入登录名" id="login_name">
                <span id="login_name_message" class="label label-warning"></span>
            </li>
            <li>
                <em>设置登录密码</em>
                <input type="password" name="author_password" id="passwordTxt" placeholder="请输入密码">
                <span id="password_message" class="label label-warning"></span>
            </li>
            <li>
                <em>验证密码</em>
                <input type="password" id="passwordTxt1" placeholder="再次输入密码">
                <span id="password_message1" class="label label-warning"></span>
            </li>

        </ul>
        <div>
            <button type="submit" class="btn btn-primary" id="registerButton">成为作者</button>
        </div>

    </form>




</div>



<%@include file="../include/author/authorFooter.jsp"%>
