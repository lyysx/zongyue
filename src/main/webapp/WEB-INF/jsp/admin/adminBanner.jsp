<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/12/9
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../include/admin/adminHeader.jsp" %>
<%@include file="../include/admin/adminNavigator.jsp" %>
<div class="marginTop"></div>
<div class="container">
    <div class="title">Banner列表</div>
    <div class="borderLine">
        <a class="btn btn-primary" href="admin/banner/add">新增Banner</a>
    </div>
    <table class="table">
        <thead>
        <tr>
            <th>id</th>
            <th>标题</th>
            <th>描述</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${promotionsList.isEmpty() == false}">
            <c:forEach var="promotions" items="${promotionsList}">
                <tr>
                    <td>${promotions.promotions_id}</td>
                    <td>${promotions.promotions_title}</td>
                    <td>${promotions.promotions_description}</td>
                    <td>
                        <button class="btn btn-primary" onclick="checkPro(this.value)" value="${promotions.promotions_id}">查看</button>
                        <button class="btn btn-danger" onclick="deletePro(this.value)" value="${promotions.promotions_id}">删除</button>
                        <c:if test="${promotions.online != 0}">
                            <label class="label label-primary">首页banner</label>
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>

    </table>
    <c:if test="${promotionsList.isEmpty()}">
        <div class="information">暂无Banner</div>
    </c:if>
</div>
<script>
    function checkPro(id) {
        window.location.href = 'admin/banner/' + id;
    }

    function deletePro(id) {

    }
</script>


