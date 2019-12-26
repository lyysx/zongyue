<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/7
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../include/fore/userHeader.jsp"%>

<div class="container myself">
    <div class="left">
        <img class="img-circle" src="img/userImage.jpg">
    </div>
    <div class="userInformation">
        <p class="name">
            ${user.user_nickname}
            <i>
                <c:if test="${user.user_gender == null}">
                    (保密)
                </c:if>
                <c:if test="${user.user_gender != null}">
                    (${user.user_gender})
                </c:if>

            </i>
            <span>
                <a href="user/setting">用户设置</a>
            </span>
        </p>
        <p>
            <i>简介 : </i>
            <c:if test="${user.user_information == null}">
                暂无简介
            </c:if>
            <c:if test="${user.user_information != null}">
                ${user.user_information}
            </c:if>
        </p>
        <p>
            <i>
                我的推荐票:
            </i>
            ${user.user_recommend_ticket}
            <span class="pull-right">
                <a href="user/paying" target="_blank">充值</a>
            </span>
        </p>
    </div>
</div>
<script>
    $(function () {
        $('#myHome').parent("ul").children("li").removeClass("active");
        $('#myHome').addClass("active");
    })
</script>


<%@include file="../../include/fore/foreFooter.jsp"%>
