<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/18
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<div> 共有${chapters.size()}章</div>
<div class="chapter_list">
    <ul class="list-group" id="draftsList">
        <c:forEach items="${chapters}" var="chapter" varStatus="st">
            <li class="list-group-item" id="${chapter.chapter_id}" onclick="draftsListSelected(this.id)">
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
        $('#draftsList li:first').click();
        if (${chapters.size() == 0}) {
            $('#draftsRight.rightDiv').load("author/chapter/empty");
        }
    });

    function draftsListSelected(id) {
        $('#' + id).addClass("active");
        $('#' + id).parent("ul").children("li").not("#" + id).removeClass("active");
        // $('#draftsRight.rightDiv').load("refresh_content", refreshDrafts(id));
        $('#draftsRight.rightDiv').load("author/chapter/detail/"+id);
    }
    // function refreshDrafts(id) {
    //     // $('#draftsRight.rightDiv').load("refresh_content");
    //     $('#draftsRight.rightDiv').load("chapter_detail_right", {"chapter_id": id});
    // }

</script>