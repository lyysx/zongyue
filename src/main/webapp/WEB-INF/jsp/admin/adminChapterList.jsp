<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/25
  Time: 0:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<ul>
    <c:forEach items="${chapterList}" var="chapter">
        <li>
            <a href="admin/chapter/${chapter.chapter_id}">${chapter.chapter_title}</a>

        </li>
    </c:forEach>
</ul>

