<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/1
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="../../include/fore/foreHeader.jsp" %>
<%@include file="../../include/fore/foreNavigator.jsp"%>
<title>${fiction.fiction_name}</title>
<div class="bookDetailWrap">
    <div class="bookInformation">
        <div class="bookImage">
            <a href="javascript:"><img src="img/fictionImage/${fiction.fiction_image}.jpg"></a>
        </div>
        <div class="bookDetails">
            <h1>
                <em>${fiction.fiction_name}</em>
                <span>
                    <a href="javascript:">${fiction.author.author_name} </a>
                     著
                </span>
            </h1>
            <p>
                <label class="label label-primary">占位</label>
                <label class="label label-primary">占位</label>
            </p>
            <p>
                <span class="bookNum">${fiction.fiction_word_number}</span>
                <cite>字</cite>
                <i>|</i>
                <span class="bookNum">${fiction.fiction_recommend}</span>
                <cite>推荐</cite>
            </p>
            <p>
                <c:if test="${startChapterID == null}">
                    <a href="javascript:"class="red-btn disabled">免费阅读</a>
                </c:if>
                <c:if test="${startChapterID != null}">
                    <a href="chapter/${startChapterID}"class="red-btn">免费阅读</a>
                </c:if>
                <a href="javascript:" class="blue-btn" id="joinBookShelf" onclick="joinToBookShelf()">加入书架</a>
                <a href="javascript:" class="blue-btn" onclick="recommended()">投推荐票</a>
            </p>
            <%--<em>当前状态为：</em>--%>
            <%--<label id="fictionState" class="label label-info" style="cursor: pointer"></label>--%>
        </div>
        <div id="clearDiv"></div>
    </div>
    <div class="contentNavWrap">
        <ul id="myTab" class="nav nav-tabs">
            <li class="active">
                <a href="#content" data-toggle="tab">作品信息</a>
            </li>
            <li>
                <a href="#catalog" data-toggle="tab" id="chapterList">章节信息</a>
            </li>

        </ul>

    </div>
    <div id="myTableContent" class="tab-content">
        <div class="tab-pane fade in active" id="content">
            <pre class="synopsisPre">  ${fiction.fiction_synopsis}</pre>
        </div>
        <div class="tab-pane fade" id="catalog">
            <ul>
                <c:forEach items="${chapters}" var="chapter">
                    <li>
                        <a href="chapter/${chapter.chapter_id}">${chapter.chapter_title}</a>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </div>

</div>
<div class="modal fade" id="recommendModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog" style="width: 350px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4>投推荐票</h4>
            </div>
            <div class="modal-body">
                <div id="recommendInfo">

                </div>
                <div>选择要投的推荐票数量</div>
                <button onclick="numberDown()">
                    <span class="glyphicon glyphicon-minus"></span>
                </button>
                <input type="number" id="numberOfRecommend" value="0">
                <button onclick="numberUpper()">
                    <span class="glyphicon glyphicon-plus"></span>
                </button>
                <div>
                    <span>我的推荐票数：</span>
                    ${user.user_recommend_ticket}
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" onclick="updateRecommend()">确定</button>
            </div>
        </div>
    </div>

</div>
<script>
    if (${user !=null}) {
        <c:if test="${user != null}">
        $.get(
            "check_bookshelf_ajax",
            {"user_id":${user.user_id},"fiction_id":${fiction.fiction_id}},
            function (result) {
                if (result == "true") {
                    $('#joinBookShelf').attr("class","blue-btn disabled");
                    $('#joinBookShelf').html("已在书架");
                }
            }
        );
        </c:if>

    }
</script>
<script>

    function recommended() {
        if (${user == null}) {
            $('#loginModal').modal("toggle");
        } else {
            $('#recommendModal').modal("show");
        }
    }

    function numberDown() {
        var num = $('#numberOfRecommend').val() - 1;
        if (num < 0) {
            num = 0;
        }
        $('#numberOfRecommend').val(num);
    }

    function numberUpper() {
        var num = parseInt($('#numberOfRecommend').val()) + 1;
        $('#numberOfRecommend').val(num);
    }

    function joinToBookShelf() {
        if (${user == null}) {
            $('#loginModal').modal("toggle");
        } else {
            <c:if test="${user != null}">
            $.get(
                "join_bookshelf_ajax",
                {"user_id":${user.user_id},"fiction_id":"${fiction.fiction_id}"},
                function (result) {
                    if (result == "true") {
                        $('#joinBookShelf').attr("class","blue-btn disabled");
                        $('#joinBookShelf').html("已在书架");
                    }
                }
            )
            </c:if>

        }

    }
</script>
<script>
    function updateRecommend() {
        var recommend = $('#numberOfRecommend');
        var info = $('#recommendInfo');
        if (parseInt(recommend.val()) > ${user.user_recommend_ticket} || parseInt(recommend.val()) < 0) {
            info.html("推荐票数有误，请重新输入");
            info.addClass("alert alert-danger");
            return false;
        } else {
            $.post(
                "user/fiction_recommend",
                {"_method":"PUT","fid":${fiction.fiction_id},"num":recommend.val()},
                function (result) {
                    if (result.state === "success") {
                        info.html("推荐票投递成功");
                        info.addClass("alert alert-success");
                        location.reload();
                    } else {
                        info.html("推荐票投递失败");
                        info.addClass("alert alert-warning");
                    }
                }
            );
        }
    }
</script>

<%@include file="../../include/fore/foreFooter.jsp"%>
