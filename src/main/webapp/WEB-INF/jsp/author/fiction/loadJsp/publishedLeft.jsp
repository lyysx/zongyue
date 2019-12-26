<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/23
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<div> 共有${chapters.size()}章</div>
<div class="chapter_list">
    <ul class="list-group" id="publishedList">
        <c:forEach items="${chapters}" var="chapter" varStatus="st">
            <li class="list-group-item" id="${chapter.chapter_id}" onclick="publishedListSelected(this.id)">
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
        $('#publishedList li:first').click();
        if (${chapters.size() == 0}) {
            $('#publishedRight.rightDiv').load("author/chapter/empty");
        }
    });

    function publishedListSelected(id) {
        $('#' + id).addClass("active");
        $('#' + id).parent("ul").children("li").not("#" + id).removeClass("active");
        // $('#publishedRight.rightDiv').load("refresh_content");
        // setTimeout($('#publishedRight.rightDiv').load("chapter_published_right", {"chapter_id": id}), 200);
        $('#publishedRight.rightDiv').load("author/chapter/published/"+id);

    }

</script>