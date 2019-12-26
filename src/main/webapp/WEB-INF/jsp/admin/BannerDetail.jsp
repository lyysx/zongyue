<%@ page import="com.shiki.zongyue.pojo.Promotion" %><%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/12/11
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../include/admin/adminHeader.jsp" %>
<%@include file="../include/admin/adminNavigator.jsp" %>
<div class="marginTop"></div>
<div class="wrapper">
    <div id="container">
        <div class="title">修改Banner</div>
        <div class="container">
            <div>
                <form method="post" action="admin/banner/${promotions.promotions_id}">
                    <input type="hidden" name="_method" value="PUT">
                    <ul class="inner-ul">
                        <li>
                            <span class="info">标题</span>
                            <input type="text" name="promotions_title" value="${promotions.promotions_title}">
                        </li>
                        <li>
                            <span class="info">描述</span>
                            <input type="text" name="promotions_description"
                                   value="${promotions.promotions_description}">
                        </li>
                    </ul>
                    <div>
                        <button class="btn btn-primary" type="submit">保存</button>
                        <button class="btn btn-default" type="reset">重置</button>
                        <button class="btn btn-warning" type="button" onclick="setBanner(${promotions.promotions_id})">设置为首页Banner
                        </button>
                    </div>
                </form>
            </div>
            <div class="inner-middle">
                <span class="subTitle">Banner子项目</span>
                <button class="btn btn-primary" onclick="addItem()">添加子项目</button>
            </div>
            <div>
                <table class="table">
                    <thead>
                    <tr>
                        <th>id</th>
                        <th>标题</th>
                        <th>图片</th>
                        <th>描述</th>
                        <th>网址</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:if test="${!promotionList.isEmpty()}">
                        <c:forEach items="${promotionList}" var="promotion">
                            <tr>
                                <td>${promotion.promotion_id}</td>
                                <td>${promotion.promotion_title}</td>
                                <td><img src="/zongyue/img/sliderImage/${promotion.promotion_image}" alt="图片异常"></td>
                                <td>${promotion.promotion_description}</td>
                                <td>${promotion.promotion_url}</td>
                                <td>
                                    <button class="btn btn-primary" onclick="modify(this.id)" id="${promotion.promotion_id}">编辑</button>
                                    <button class="btn btn-default">删除</button>
                                </td>
                            </tr>
                        </c:forEach>
                    </c:if>
                    </tbody>
                </table>

            </div>
        </div>
    </div>
    <div id="addContainer">
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
                        <img class="image" src="/zongyue/img/addImage.png" id="addImage">
                        <input type="file" name="image" class="hidden" id="addInput">
                    </li>
                </ul>
                <button class="btn btn-primary" type="submit">保存</button>
                <button class="btn btn-default" id="resetBtn" type="reset">重置</button>
            </form>
        </div>
    </div>
    <div id="updateContainer">
        <div class="title flr">
            <span>修改Banner子项目</span>
            <span class="glyphicon glyphicon-backward hoverP" onclick="back1()">返回</span>
        </div>
        <div class="container">
            <form id="updateForm" action="admin/banner/item/${promotions.promotions_id}" method="post" enctype="multipart/form-data">
                <input type="hidden" name="_method" value="PUT">
                <input type="hidden" name="promotion_id">
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
                        <img src="" class="image" id="updateImage">
                        <input type="file" name="image" id="updateInput" class="hidden">
                    </li>
                </ul>
                <button class="btn btn-primary" type="submit">保存</button>
                <button class="btn btn-default" id="resetBtn1" type="reset">重置</button>
            </form>
        </div>
    </div>
</div>


<script>
    function setBanner(id) {
        alert(id);
        $.post(
            "admin/banner/"+id,
            {"online":1,"_method": "PUT"},
            function () {
                alert("修改成功");
                location.href("/admin/banner");
            }
        );
    }

    function addItem() {
        <%--$('.wrapper').get("admin/item",{"id":${promotions.promotions_id}});--%>
        $('#container').css("display", "none");
        $('#addContainer').css("display", "block");
        <%--location.href = "admin/banner/${promotions.promotions_id}";--%>
    }

    function back() {
        $('#container').css("display", "block");
        $('#addContainer').css("display", "none");
        $('#resetBtn').click();
    }

    function back1() {
        $('#container').css("display", "block");
        $('#updateContainer').css("display", "none");
        $('#resetBtn1').click();

    }

    $('#addImage').click(function () {
        $('#addInput').click();
    });
    $('#updateImage').click(function () {
        $('#updateInput').click();
    });

    function modify(id) {
        $.get(
            "admin/item/" + id,
            function (res) {
                $('#updateForm :input[name="promotion_id"]').val(id);
                $('#updateForm :input[name="promotion_title"]').val(res.promotion_title);
                $('#updateForm :input[name="promotion_description"]').val(res.promotion_description);
                $('#updateForm :input[name="promotion_url"]').val(res.promotion_url);
                if (res.promotion_image === null) {
                    $('#updateForm img').attr("src", "/zongyue/img/addImage.png");
                } else {
                    $('#updateForm img').attr("src", res.promotion_image);
                }
            }
            // function (res) {
            //     console.log(res);
            // }
        );
        $('#container').css("display", "none");
        $('#updateContainer').css("display", "block");
    }
</script>