<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/11/10
  Time: 0:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../include/fore/userHeader.jsp"%>
<div class="userInformationUpdate">
    <form id="userInformationSetting" method="post">
        <input type="hidden" name="_method" value="PUT">
        <ul>
            <li>
                <em>昵称 </em>
                ${user.user_nickname}
                <a href="javascript:" onclick="showSettingModal()">修改昵称</a>
            </li>
            <li>
                <em>纵阅ID</em>
                ${user.user_id}
            </li>
            <li>
                <em>性别</em>
                男 <input class="radios" id="maleBtn" type="radio" name="user_gender" value="男">
                女 <input class="radios" id="femaleBtn" type="radio" name="user_gender" value="女">
                保密 <input class="radios" id="unknowBtn" type="radio" name="user_gender"value="保密">
            </li>
            <li>
                <em>生日</em>
                <div class="input-group date" id="birthday">
                    <input type="text" class="form-control" name="user_birthday"
                        value="<fmt:formatDate value="${user.user_birthday}" pattern="yyyy-MM-dd" />">
                    <div class="input-group-addon">
                        <span class="glyphicon glyphicon-th"></span>
                    </div>
                </div>
            </li>
            <li>
                <em>简介</em>
                <textarea placeholder="简单的介绍下自己吧" style="resize: none;width: 324px;height: 90px" name="user_information">${user.user_information}</textarea>
            </li>
        </ul>
        <a href="javascript:" onclick="userInformationSet()" class="btn btn-primary" >保存</a>
    </form>
</div>
<div class="modal fade" id="setNicknameModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog" style="width: 350px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4>用户昵称</h4>
            </div>
            <div class="modal-body">
                <input type="text" id="setNickname">
            </div>
            <div class="modal-footer">
               <button onclick="setNickname()">确定</button>
            </div>
        </div>
    </div>

</div>
<script>

    if (${user.user_gender=="男"}){
        $('#maleBtn').attr("checked", "checked");
        $('#femaleBtn').removeAttr("checked");
        $('#unknowBtn').removeAttr("checked");
    }else if (${user.user_gender=="女"}) {
        $('#femaleBtn').attr("checked", "checked");
        $('#maleBtn').removeAttr("checked");
        $('#unknowBtn').removeAttr("checked");
    } else {
        $('#unknowBtn').attr("checked", "checked");
        $('#maleBtn').removeAttr("checked");
        $('#femaleBtn').removeAttr("checked");
    }
</script>
<script>
    $(function () {
        $('#myHome').addClass("active");
    });

    function userInformationSet() {
        // console.log(JSON.stringify($('#userInformationSetting').serializeArray()));
        /*$.post(
            "user/information_ajax",
            $('#userInformationSetting').serialize(),
            function (result) {
                console.log(result);
                /!*if (result.state === "success") {
                    alert("修改成功");
                    location.reload();
                }*!/
            }
        );*/

        $.ajax({
            type: "post",
            dataType: "json",
            cache: "false",
            url: "user/information_ajax",
            data: $('#userInformationSetting').serialize(),
            success: function (result) {
                console.log(result);
                if (result.state === "success") {
                    alert("修改成功");
                    location.reload();
                }
            },
            error: function () {
                alert("连接异常");
            }
        });

        // console.log($('#userInformationSetting').serializeArray());
        // $.post(
        //     "user_information_update_ajax",
        //     $('#userInformationSetting').serializeArray(),
        //     function (result) {
        //         alert("成功");
        //     }
        //
        // )
    }
    
    function setNickname() {
        $.post(
            "user/nickname_ajax",
            {"nickname": $('#setNickname').val(),"_method":"PUT"},
            function (result) {
                console.log(result);
                alert(result.message);
                location.reload();
            }
        );
    }

    function showSettingModal() {
        $('#setNicknameModal').modal("show");
    }

    $(function () {
        $('#birthday').datepicker({
            "format": 'yyyy-mm-dd',
            "language": "zh-CN"
            // startDate: '-3d'
        });
    });

</script>

<%@include file="../../include/fore/foreFooter.jsp"%>