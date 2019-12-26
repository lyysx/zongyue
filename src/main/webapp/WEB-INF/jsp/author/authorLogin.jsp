<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/18
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="../include/author/authorHeader.jsp" %>


<div id="web_bg" style="background-image: url(img/zongyueBg/author_bg.jpg)">

</div>

<title>作者登录</title>

<div id="top-tipbox" class="top-tipbox hidden" style="left: 40%;top: 30%;">
    <p id="infoMsg">
        <c:if test="${infoMsg.length()!=0}"  >

        </c:if>
    </p>
</div>
<div class="loginDiv">
        <form class="loginForm" action="author/login" method="post">
            <div class="text text-muted">账号登录</div>
            <ul>
                <li>
                    <em>登录名</em>
                    <br>
                    <input class="form-control" type="text" name="author_login_name" placeholder="请输入用户名">
                </li>
                <li>
                    <em>密码</em>
                    <br>
                    <input class="form-control" type="password" name="author_password" placeholder="请输入密码">
                </li>
                <li>
                    <a href="notImplLink">忘记密码</a>
                    <a href="author/register" class="pull-right">作者注册</a>
                </li>
            </ul>

            <br>
            <div>
                <button class="btn btn-primary" id="loginBtn" type="submit">登录</button>
            </div>

        </form>



</div>



<script>

    $('#loginBtn').click(function () {
        if ($('#infoMsg').val().length != 0) {
            $('#top-tipbox').attr("display", "block");
            setTimeout(function () {
                $('#top-tipbox').fadeOut();
                $('#infoMsg').val("");
            }, 100000);
        }
    })



</script>








<%@include file="../include/author/authorFooter.jsp" %>
