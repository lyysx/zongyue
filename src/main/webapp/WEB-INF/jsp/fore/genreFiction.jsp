<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/4
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../include/fore/foreHeader.jsp"%>
<%@include file="../include/fore/foreNavigator.jsp"%>
<title>分类</title>
<ul>
    <c:forEach items="${fictionByGenre}" var="fiction">
        <li>
            <a href="fiction/${fiction.fiction_id}">${fiction.fiction_name}</a>
        </li>
    </c:forEach>

</ul>



<%@include file="../include/fore/foreFooter.jsp"%>