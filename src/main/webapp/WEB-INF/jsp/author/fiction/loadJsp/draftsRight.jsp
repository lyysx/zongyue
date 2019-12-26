<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/18
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="selectingTopBar">
    <span>发布至：</span>
    <span><select>测试</select></span>
    <span>章节类型：</span>
    <span><select>测试二</select></span>
    <div class="btn-group" role="group" style="float: right">
        <button class="btn btn-warning" id="moveToRecycle">删除</button>
        <button class="btn btn-default" id="sumText">统计字数</button>
        <button class="btn btn-default" id="saveContext" data-toggle="tooltip" data-placement="保存成功">保存</button>
        <button class="btn btn-primary" id="publishContext">发布</button>
    </div>
</div>
<div class="editArea">
    <input type="text" class="form-control" placeholder="在这里输入章节名称，例如：“第二章 古墓奇遇”" id="inputFictionTitle" name="chapter_title" value="${chapter.chapter_title}">
    <textarea id="textareaFictionContext" class="form-control" name="chapter_content" placeholder="请输入正文" style="height: 70%;resize: none   ">${chapter.chapter_context}</textarea>
</div>
<script>
    $("#sumText").click(function () {
        alert($('#textareaFictionContext').val().length);
    });
    $('#saveContext').click(function () {
        var title = $('#inputFictionTitle').val();
        var content = $('#textareaFictionContext').val();
        $.post(
            "author/chapter/draft",
            {
                "chapter_id":${chapter.chapter_id},
                "chapter_title": title,
                "chapter_context": content,
                "chapter_word_number": content.length,
                "_method": "PUT"
            }
        );

        location.reload();
    });
    $('#publishContext').click(function () {
        var title = $('#inputFictionTitle').val();
        var content = $('#textareaFictionContext').val();

        $.post(
            "chapter_publish_ajax",
            {"chapter_id":${chapter.chapter_id},
                "chapter_title": title,
                "chapter_context": content,
                "chapter_word_number": content.length,
                "_method": "PUT"
            }
        );
        location.reload();
    });
    $('#moveToRecycle').click(function () {
        $.post(
            "chapter_recycle_ajax",
            {"chapter_id":${chapter.chapter_id}, "_method": "PUT"}
        );
        location.reload();
    });

</script>
