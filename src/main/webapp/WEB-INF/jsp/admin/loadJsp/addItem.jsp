<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/12/13
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>${promotions.promotions_id}</div>
<div>${ps_id}</div>
<div class="title flr">
    <span>新增Banner子项目</span>
    <span class="glyphicon glyphicon-backward hoverP" onclick="back()">返回</span>
</div>
<div class="container">
    <form action="admin/banner/item/${promotions.promotions_id}" method="post" enctype="multipart/form-data">
        <ul class="inner-ul">
            <li>
                <span>标题</span>
                <input type="text" name="promotion_title">
            </li>
            <li>
                <span>描述</span>
                <input type="text" name="promotion_description">
            </li>
            <li>
                <span>网址</span>
                <input type="text" name="promotion_url">
            </li>
            <li>
                <span>图片</span>
                <img src="/zongyue/img/addImage.png">
                <input type="file" name="image">
            </li>
        </ul>
        <button class="btn btn-primary" type="submit">保存</button>
        <button class="btn btn-default" id="resetBtn" type="reset">重置</button>
    </form>
</div>
