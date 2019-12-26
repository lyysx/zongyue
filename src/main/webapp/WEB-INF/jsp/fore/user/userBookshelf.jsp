<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/12
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../include/fore/userHeader.jsp"%>

<div class="container">
    <table class="table">
        <thead>
            <th>类别</th>
            <th>书名</th>
            <th>作者</th>
            <th>阅读进度</th>
        </thead>
        <tbody>
            <c:if test="${bookshelfs == null}">书架空空的</c:if>
            <c:if test="${bookshelfs != null}">
                <c:forEach items="${bookshelfs}" var="fiction" >
                    <tr>
                        <td><a href="genre/${fiction.fiction.genre_id}">${fiction.fiction.genre.genre_name}</a></td>
                        <td><a href="fiction/${fiction.fiction_id}">${fiction.fiction.fiction_name}</a></td>
                        <td><a>${fiction.fiction.author.author_name}</a></td>
                        <td>${fiction.chapter_id}</td>
                    </tr>
                </c:forEach>
            </c:if>
        </tbody>
    </table>






</div>
<script>
    $(function () {
        $('#myBookshelf').parent("ul").children("li").removeClass("active");
        $('#myBookshelf').addClass("active");
    })
</script>

<%@include file="../../include/fore/foreFooter.jsp"%>