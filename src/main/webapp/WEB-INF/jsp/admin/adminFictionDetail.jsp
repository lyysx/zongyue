<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/26
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../include/admin/adminHeader.jsp" %>
<%@include file="../include/admin/adminNavigator.jsp" %>
<title>${fiction.fiction_name}</title>
<div class="marginTop"></div>
<div class="book-wrap">
    <div class="top-wrap">
        <div class="bookImage">
            <a href="javascript:"><img src="/zongyue/img/fictionImage/${fiction.fiction_image}.jpg"></a>
        </div>
        <div class="book-right">
            <div class="title-info">
                <div class="book-title">${fiction.fiction_name}</div>
                <div class="book-author">
                    <div class="author-info">
                        <a href="javascript:">${fiction.author.author_name}</a>         著
                    </div>
                </div>
            </div>
            <div class="read">
                <c:if test="${startChapterID == null}">
                    <a href="javascript:"class="btn btn-primary disabled">免费阅读</a>
                </c:if>
                <c:if test="${startChapterID != null}">
                    <a href="chapter/${startChapterID}"class="btn btn-primary">免费阅读</a>
                </c:if>
            </div>
            <div class="state">
                <div>当前状态：<label class="label label-info point" id="fictionState"></label></div>
            </div>
        </div>
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
            <pre class="synopsisPre">${fiction.fiction_synopsis}</pre>
        </div>
        <div class="tab-pane fade" id="catalog">
            <p>目录信息</p>
        </div>
    </div>
</div>
<%--<div class="bookDetailWrap">
    <div class="bookInformation">
        <div class="bookImage">
            <a href="javascript:"><img src="/zongyue/img/fictionImage/${fiction.fiction_image}.jpg"></a>
        </div>
        <div class="bookInformation">
            <h1><em>${fiction.fiction_name}</em></h1>
            <span><a href="javascript:">${fiction.author.author_name}</a>         著</span>
            <em>当前状态为：</em>
            <label id="fictionState" class="label label-info" style="cursor: pointer"></label>
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
            <p>${fiction.fiction_synopsis}</p>
        </div>
        <div class="tab-pane fade" id="catalog">
            <p>目录信息</p>
        </div>
    </div>

</div>--%>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button data-dismiss="modal" class="close" type="button"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title">编辑状态</h4>
            </div>
            <div class="modal-body">
                <p>状态</p>
                <div class="btn-group" data-toggle="buttons" id="stateSelect">
                    <label class="btn btn-default" id="notOnShelf">
                        <input type="radio" value="0" >未上架
                    </label>
                    <label class="btn btn-default" id="onShelf">
                        <input type="radio" value="1" > 已上架
                    </label>
                    <label class="btn btn-default" id="signed">
                        <input type="radio" value="2" > 已签约
                    </label>
                </div>
            </div>
            <div class="modal-footer">
                <button data-dismiss="modal" class="btn btn-default" type="button">关闭</button>
                <button class="btn btn-primary" id="stateConfirmed" type="button">确定</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
<script>
    function freshState() {
        if (${fiction.fiction_state == 0}){
            $("#fictionState").html("未上架");
            $("#notOnShelf").addClass("active");
        }else if (${fiction.fiction_state==1}) {
            $("#fictionState").html("已上架");
            $("#onShelf").addClass("active");
        } else {
            $("#fictionState").html("已签约");
            $("#signed").addClass("active");
        }

    }
    $(function () {
        freshState();

        $("#fictionState").click(function () {
            $("#myModal").modal("toggle");

        });

        $("#stateConfirmed").click(function () {
            var state = $('#stateSelect input:radio:checked').val();
            var id = ${fiction.fiction_id};
            page = "admin/fiction/state";
            $.post(
                page,
                {"fiction_state": state, "fiction_id": id,"_method":"put"},
                function () {
                    // $('#fictionState').html(result);
                    location.reload();
                }
            )

        });

        $('#chapterList').click(function () {
            $('#catalog').load("admin/fiction/catalog/${fiction.fiction_id}");

        });

    })


</script>


<%@include file="../include/admin/adminFooter.jsp" %>
