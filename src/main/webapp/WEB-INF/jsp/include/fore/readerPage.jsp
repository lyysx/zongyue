<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/7
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="chapterController">
    <a <c:if test="${previous == null}"> class="disabled" </c:if> href="chapter/${previous}">上一章</a>
    <a href="fiction/${fiction.fiction_id}">目录</a>
    <a<c:if test="${next == null}"> class="disabled" </c:if> href="chapter/${next}">下一章</a>
</div>
