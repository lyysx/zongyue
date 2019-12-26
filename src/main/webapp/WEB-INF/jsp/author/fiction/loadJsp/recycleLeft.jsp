<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/23
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<div> 共有${chapters.size()}章</div>
<div class="chapter_list">
    <ul class="list-group" id="recycleList">
        <c:forEach items="${chapters}" var="chapter" varStatus="st">
            <li class="list-group-item" id="${chapter.chapter_id}" onclick="recycleListSelected(this.id)">
                <div>
                    <strong>${chapter.chapter_title}</strong>
                </div>
                <div>
                    共有${chapter.chapter_word_number}字
                    <fmt:formatDate value="${chapter.chapter_edit_time}" pattern="MM-dd HH:mm" />
                </div>
            </li>
        </c:forEach>

    </ul>


</div>
<script>
    $(function () {
        $('#recycleList li:first').click();
        if (${chapters.size() == 0}) {
            $('#recycleRight.rightDiv').load("author/chapter/empty");
        }
    });

    function recycleListSelected(id) {
        $('#' + id).addClass("active");
        $('#' + id).parent("ul").children("li").not("#" + id).removeClass("active");
        // $('#recycleRight.rightDiv').load("refresh_content");
        // setTimeout($('#recycleRight.rightDiv').load("chapter_recycle_right", {"chapter_id": id}), 200);
        $('#recycleRight.rightDiv').load("author/chapter/recycle/"+id);
    }


</script>