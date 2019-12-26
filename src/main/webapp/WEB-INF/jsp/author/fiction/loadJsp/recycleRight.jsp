<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/22
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="selectingTopBar">
    <span>发布至：</span>
    <span><select>测试</select></span>
    <span>章节类型：</span>
    <span><select>测试二</select></span>
    <div class="btn-group" role="group" style="float: right">
        <button class="btn btn-danger" id="deleteChapter">彻底删除</button>
        <button class="btn btn-default" id="moveToDrafts">恢复为草稿</button>
    </div>
</div>
<div class="editArea">
    <input type="text" class="form-control" placeholder="在这里输入章节名称，例如：“第二章 古墓奇遇”" id="inputFictionTitle" name="chapter_title" value="${chapter.chapter_title}">
    <textarea id="textareaFictionContext" class="form-control" name="chapter_content" placeholder="请输入正文" style="height: 70%;resize: none   ">${chapter.chapter_context}</textarea>
</div>
<script>
    $('#deleteChapter').click(function () {
        $.post(
            "chapter_delete_ajax",
            {"chapter_id":${chapter.chapter_id},"_method": "DELETE"}
        );
        $('#jRecycleBin').click();
    });
    $('#moveToDrafts').click(function () {

        $.post(
            "chapter_drafts_ajax",
            {"chapter_id":${chapter.chapter_id},"_method": "PUT"}
        );
        $('#jRecycleBin').click();

    });
</script>
