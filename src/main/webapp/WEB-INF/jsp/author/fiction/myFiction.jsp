<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/23
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="../../include/author/authorHeader.jsp" %>
<%@include file="../../include/author/authorNavigator.jsp" %>
<title>我的小说</title>
<div class="container">
    <div class="workingArea">
        <h1 class="label label-info">小说管理</h1>
        <br>
        <br>
        <table class="table table-striped table-bordered table-hover table-condensed">
            <thead>
            <tr class="success">
                <td class="first">小说封面</td>
                <td class="second">小说名称</td>
                <td class="third">小说类型</td>
                <td class="fourth ">小说简介</td>
                <td class="fifth">小说状态</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${fictionList}" var="fiction" varStatus="st">
                <tr fiction_id="${fiction.fiction_id}" class="fictionInformation">
                    <td class="first"><img src="img/fictionImage/${fiction.fiction_image}.jpg"></td>
                    <td class="second">${fiction.fiction_name}</td>
                    <td class="third">${fiction.genre.genre_name}</td>
                    <td class="fourth1">${fiction.fiction_synopsis}</td>
                    <td class="fifth">
                        <c:if test="${fiction.fiction_state == 0}">
                            未上架
                        </c:if>
                        <c:if test="${fiction.fiction_state == 1}">
                            已上架
                        </c:if>
                        <c:if test="${fiction.fiction_state == 2}">
                            已签约
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>


</div>
</div>
</div>
<script>
    $(function () {
        $(".fictionInformation").click(function () {
            // $(location).prop("href", "localhost:8080/admin_fiction_detail" + "?fiction_id=" + $(this).attr("fiction_id"));
            var url = "author/fiction/" + $(this).attr("fiction_id");
            // alert(url);
            location.href = url;
        });
    })

</script>
<%@include file="../../include/author/authorPage.jsp" %>
<%@include file="../../include/author/authorFooter.jsp" %>
