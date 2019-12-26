<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/18
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" isELIgnored="false" %>
<%@include file="../include/author/authorHeader.jsp" %>
<%@include file="../include/author/authorNavigator.jsp"%>
<title>作者首页</title>

    <div class="container">
        欢迎 ${author.author_name}
    </div>

</div>
</div>


<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">笔名设置</h4>
            </div>
            <div class="modal-body">
                <p>您还没有笔名，给自己取个好听的名字吧！</p>
                <input type="text" id="authorNameInput" name="author_name" class="form-control">
                <span class="label label-warning" id="nameCheckMessage"></span>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" id="confirmNameButton">就是它了</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<script>{
        if (${author == null}){
            location.href="author_login";
        }
        if (${empty author.author_name}) {
            $("#myModal").modal('show');
        }
}

</script>
<script>


    $(function () {

        $("#authorNameInput").keyup(function () {
            var message = $("#nameCheckMessage");
            var page = "author/name_ajax";
            var value = $(this).val();
            $.get(
                page,
                {"author_name": value},
                function (result) {
                    if (result.state === "success") {
                        message.attr("class", "label label-success");
                        message.html("不错的笔名呢！");
                    } else {
                        message.attr("class", "label label-warning");
                        message.html("这个名字被人占用了呢！");
                    }
                }
            );

        });

        $("#confirmNameButton").click(function () {
            if ($("#authorNameInput").val().length==0) {
                $("#nameCheckMessage").attr("class", "label label-warning");
                $("#nameCheckMessage").html("笔名不能为空哦！");
                return false;
            }else if ($("#nameCheckMessage").val() == "这个名字被人占用了呢！") {
                return false;
            }
            $.post(
                "author/name_ajax",
                {"author_name": $("#authorNameInput").val(),"_method":"PUT"}
            );
            $("#myModal").modal("hide");
            location.reload();

        });
    });




</script>


<%@include file="../include/author/authorFooter.jsp"%>