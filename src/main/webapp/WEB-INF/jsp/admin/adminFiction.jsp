<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/5
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="../include/admin/adminHeader.jsp" %>
<%@include file="../include/admin/adminNavigator.jsp" %>
<title>小说管理</title>
<div class="marginTop"></div>
<div class="container">
    <div class="title">小说管理</div>
    <div class="navigator fr">
        <div class="btn" id="newFiction">新建小说</div>
        <div class="btn" id="enableFiction">可签约小说</div>
    </div>
    <div class="borderLine"></div>
    <div class="table-responsive" id="table">

    </div>

</div>

<script>
    $(function () {
        $('body').delegate(".fictionInformation", 'click',function (event) {
            var url = "admin/fiction/"+$(this).attr("fiction_id");
            location.href = url;
        });

        $('body').delegate(".pagination li.enable a","click",function () {
            var url = $(this).attr("href");
            $('#table').load(url);
            return false;
        });
        $('body').delegate(".pagination li.disabled a","click",function () {
            return false;
        });

        /*$(".fictionInformation").click(function () {
            // $(location).prop("href", "localhost:8080/admin_fiction_detail" + "?fiction_id=" + $(this).attr("fiction_id"));
            var url = "admin/fiction/"+$(this).attr("fiction_id");
            // alert(url);
            location.href = url;
        });*/
        $('#enableFiction').click(function () {
            $('.navigator').children("div").removeClass("active");
            $(this).addClass("active");
            $('#table').load("admin/fiction/list/shelves");
        })
        $('#newFiction').click(function () {
            $('.navigator').children("div").removeClass("active");
            $(this).addClass("active");
            $('#table').load("admin/fiction/list/new");
            // $('.showTable').load("");
        });
        $('#newFiction').click();
    })

</script>

<%--<%@include file="../include/admin/adminPage.jsp" %>--%>
<%@include file="../include/admin/adminFooter.jsp" %>
