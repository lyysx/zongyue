<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/12/10
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../include/admin/adminHeader.jsp" %>
<%@include file="../include/admin/adminNavigator.jsp" %>
<div class="marginTop"></div>
<div class="container">
    <div class="title">添加Banner</div>
    <form method="post" action="admin/banner/add">
        <ul class="inner-ul">
            <li>
                <span class="info">标题</span>
                <input type="text" name="promotions_title">
            </li>
            <li>
                <span class="info">描述</span>
                <input type="text" name="promotions_description">
            </li>
        </ul>
        <div>
            <button type="submit" class="btn btn-primary">保存</button>
        </div>
    </form>
</div>
