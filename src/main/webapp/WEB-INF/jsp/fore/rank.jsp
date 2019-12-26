<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/12/25
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../include/fore/foreHeader.jsp" %>
<%@include file="../include/fore/foreNavigator.jsp" %>

<div class="container">
    <ul>
        <c:forEach items="${fictions}" var="fiction">
            <li>
                <a href="fiction/${fiction.fiction_id}">${fiction.fiction_name}</a>
            </li>
        </c:forEach>
    </ul>

</div>

<%@include file="../include/fore/foreFooter.jsp" %>
