<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/4
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../include/fore/readerHeader.jsp"%>
<title>${fiction.fiction_name}_${chapter.chapter_title}</title>
<div class="textWarp">
    <div class="chapterContainer">
        <div class="textHeader">
            <h2>${chapter.chapter_title}</h2>
            <div class="info_reader">
                <a href="fiction/${fiction.fiction_id}">${fiction.fiction_name}</a>
                <a href="#">${fiction.author.author_name}</a>
                <span>${chapter.chapter_word_number} 字 </span>
                <span>
                <fmt:formatDate value="${chapter.chapter_edit_time}" pattern="yyyy-MM-dd HH:mm"/>
            </span>
            </div>
        </div>
        <div class="chapterContent">
            <pre>  ${chapter.chapter_context}</pre>
        </div>
    </div>

</div>
<%@include file="../../include/fore/readerPage.jsp"%>
<%@include file="../../include/fore/foreFooter.jsp"%>