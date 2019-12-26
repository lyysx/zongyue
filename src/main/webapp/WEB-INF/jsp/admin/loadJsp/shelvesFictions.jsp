<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/12/18
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table class="table table-hover table-bordered text-center ">
    <thead class="text-nowrap">
    <tr>
        <td>小说封面</td>
        <td>小说名称</td>
        <td>小说作者</td>
        <td>小说类型</td>
        <td>小说简介</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="fiction" items="${fictionList}">
        <tr fiction_id="${fiction.fiction_id}" class="fictionInformation" >
            <td><img height="144px" width="192" src="/zongyue/img/fictionImage/${fiction.fiction_image}.jpg"></td>
            <td>${fiction.fiction_name}</td>
            <td >${fiction.author.author_name}</td>
            <td>${fiction.genre.genre_name}</td>
            <td class="text-left">${fiction.fiction_synopsis}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="pageDiv">
    <nav>
        <ul class="pagination">
            <li <c:if test="${!page.hasPrevious}">class="disabled"</c:if>
                <c:if test="${page.hasPrevious}">class="enable"</c:if>
            >
                <a  href="admin/fiction/list/shelves?start=0${page.param}" aria-label="Previous" >
                    <span aria-hidden="true">«</span>
                </a>
            </li>

            <li <c:if test="${!page.hasPrevious}">class="disabled"</c:if>
                <c:if test="${page.hasPrevious}">class="enable"</c:if>
            >
                <a  href="admin/fiction/list/shelves?start=${page.start-page.count}${page.param}" aria-label="Previous" >
                    <span aria-hidden="true">‹</span>
                </a>
            </li>

            <c:forEach begin="0" end="${page.totalPage-1}" varStatus="status">
                <li <c:if test="${status.index*page.count==page.start}">class="disabled"</c:if>
                    <c:if test="${status.index*page.count!=page.start}">class="enable"</c:if>
                >
                    <a
                            href="admin/fiction/list/shelves?start=${status.index*page.count}${page.param}"
                            <c:if test="${status.index*page.count==page.start}">class="current"</c:if>
                    >${status.count}</a>
                </li>

            </c:forEach>

            <li <c:if test="${!page.hasNext}">class="disabled"</c:if>
                <c:if test="${page.hasNext}">class="enable"</c:if>
            >
                <a href="admin/fiction/list/shelves?start=${page.start+page.count}${page.param}" aria-label="Next">
                    <span aria-hidden="true">›</span>
                </a>
            </li>
            <li <c:if test="${!page.hasNext}">class="disabled"</c:if>
                <c:if test="${page.hasNext}">class="enable"</c:if>
            >
                <a href="admin/fiction/list/shelves?start=${page.last}${page.param}" aria-label="Next">
                    <span aria-hidden="true">»</span>
                </a>
            </li>
        </ul>
    </nav>
</div>

