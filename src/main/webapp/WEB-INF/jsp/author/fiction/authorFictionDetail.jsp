<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/8
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="../../include/author/authorHeader.jsp"%>
<%@include file="../../include/author/authorNavigator.jsp"%>
<title>书籍管理</title>
<div class="container">
    <div class="contentNavWrap">
        <ul id="myTab" class="nav nav-tabs">
            <li>
                <a href="#setting" data-toggle="tab" id="jSetting">作品设置</a>
            </li>
            <li class="active">
                <a href="#drafts" data-toggle="tab" id="jDrafts">草稿箱</a>
            </li>
            <li>
                <a href="#published" data-toggle="tab" id="jPublished">已发布章节</a>
            </li>
            <li>
                <a href="#recycleBin" data-toggle="tab" id="jRecycleBin">回收站</a>
            </li>
            <li class="pull-right">
                <button class="btn btn-primary" id="createNew">新建章节</button>
            </li>
        </ul>
    </div>
    <div id="myTabContent" class="tab-content">
        <div class="tab-pane fade" id="setting">

        </div>
        <div class="tab-pane fade in active" id="drafts">
            <div class="leftDiv" id="draftsLeft">

            </div>
            <div class="rightDiv" id="draftsRight">

            </div>
        </div>
        <div class="tab-pane fade" id="published">
            <div class="leftDiv" id="publishedLeft">

            </div>
            <div class="rightDiv" id="publishedRight">

            </div>
        </div>
        <div class="tab-pane fade" id="recycleBin">
            <div class="leftDiv" id="recycleLeft">

            </div>
            <div class="rightDiv" id="recycleRight">

            </div>
        </div>
    </div>

</div>
</div>
</div>
<script>
    $(function () {
        <%--$("#drafts").load("author_fiction_drafts", {"fiction_id":${fiction.fiction_id}});--%>
        $('#jSetting').click(function () {
            $('#setting').load("author/fiction/setting/${fiction.fiction_id}");
        });
        $('#jDrafts').click(function () {
            $('#draftsLeft').load("author/chapter/list/draft/${fiction.fiction_id}");
        });
        $('#jPublished').click(function () {
            $("#publishedLeft").load("author/chapter/list/published/${fiction.fiction_id}");
            <%--$("#publishedLeft").load("chapter_drafts_left", {"fiction_id":${fiction.fiction_id}});--%>
        });
        $('#jRecycleBin').click(function () {
            <%--$("#recycleLeft").load("chapter_drafts_left", {"fiction_id":${fiction.fiction_id}});--%>
            $("#recycleLeft").load("author/chapter/list/recycle/${fiction.fiction_id}");
        });



        $("#createNew").click(function () {
            var content = null;

            $.post(
                "author/chapter",
                {"fiction_id":${fiction.fiction_id}}
            );
            $('#jDrafts').click();
            location.reload();
        });
        $('#jDrafts').click();

    })
</script>
<%@include file="../../include/author/authorFooter.jsp"%>
