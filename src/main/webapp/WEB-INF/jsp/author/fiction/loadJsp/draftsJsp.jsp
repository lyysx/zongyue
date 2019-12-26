<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/15
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="leftDiv">
    <div>共有多少章呢</div>
    <ul>
        <div></div>
    </ul>
</div>
<div class="rightDiv">
    <div class="selectingTopBar">
        <span>发布至：</span>
        <span><select>测试</select></span>
        <span>章节类型：</span>
        <span><select>测试二</select></span>
        <div class="btn-group" role="group" style="float: right">
            <button class="btn btn-default" id="sumText">统计字数</button>
            <button class="btn btn-default" id="saveContext">保存</button>
            <button class="btn btn-primary" id="publishContext">发布</button>
        </div>
    </div>
    <div class="editArea">
        <input type="text" class="form-control" placeholder="在这里输入章节名称，例如：“第二章 古墓奇遇”" id="inputFictionTitle" name="chapter_title">
        <textarea id="textareaFictionContext" class="form-control" name="chapter_content" placeholder="请输入正文" style="height: 70%;resize: none   "></textarea>
    </div>
</div>
