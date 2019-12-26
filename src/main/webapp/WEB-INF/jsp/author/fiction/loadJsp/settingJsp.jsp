<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/14
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="settingWrap">
    <%--<form id="updateFictionForm" action="modify_fiction_info" method="post">--%>
    <%--<input type="hidden" name="fiction_id" value="${fiction.fiction_id}">--%>
    <%--<input type="hidden" name="fiction_name">--%>
    <%--<input type="hidden" name="genre_id">--%>
    <%--<input type="hidden" name="fiction_synopsis">--%>
    <%--</form>--%>
    <%--<input type="hidden" name="_method" value="PUT">--%>
    <form id="updateFictionForm" action="update_fiction_info" enctype="multipart/form-data" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="hidden" name="fiction_id" value="${fiction.fiction_id}">
        <input class="hidden" type="file" id="fImg" name="fImg">
        <input id="fName" type="hidden" name="fiction_name">
        <input id="Gid" type="hidden" name="genre_id">
        <input id="Fs" type="hidden" name="fiction_synopsis">
    </form>
    <input type="hidden" name="fiction_id" value="${fiction.fiction_id}">
    <div class="fictionImg">
        <img id="fImgshow" src="img/fictionImage/${fiction.fiction_image}.jpg">
        <div class="modify" style="margin-top: 30px;">
            <div id="updateImage">上传新封面</div>
        </div>
    </div>
    <div class="fictionInfoList">
        <ul>
            <li>
                <i>作品名称:</i>
                <span class="saved">${fiction.fiction_name}</span>
                <span class="modify">
                    <input id="name" type="text" value="${fiction.fiction_name}">
                </span>
            </li>
            <li>
                <i>作品类型:</i>
                <span class="saved">${fiction.genre.genre_name}</span>
                <%--<input type="hidden" name="genre_id">--%>
                <select id="selectOp" name="genre_id" class="modify">
                    <c:forEach items="${genres}" var="genre">
                        <option value="${genre.genre_id}">${genre.genre_name}</option>
                    </c:forEach>
                </select>
                <%--<div class="dropdown modify" style="display: none">--%>
                <%--<button type="button" class="btn dropdown-toggle" id="dropdownMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
                <%--<span id="genreName">${fiction.genre.genre_name}</span><span class="caret"></span>--%>
                <%--<input id="genreNameHide" name="genre_id" hidden>--%>
                <%--</button>--%>
                <%--<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">--%>
                <%--<li class="dropdown-header">-请选择-</li>--%>
                <%--<c:forEach var="genre" items="${genreList}">--%>
                <%--<li style="cursor: pointer" id="${genre.genre_id}">${genre.genre_name}</li>--%>
                <%--</c:forEach>--%>
                <%--</ul>--%>
                <%--</div>--%>
            </li>
            <li>
                <i>字数:</i>
                <span>${fiction.fiction_word_number}</span>
            </li>
            <li>
                <i>作品状态:</i>
                <span>${fiction.fiction_state}</span>
            </li>
            <li>
                <i>作品介绍:</i>
                <span class="saved">${fiction.fiction_synopsis}</span>
                <span class="modify" style="display: none">
                    <textarea id="synopsis">${fiction.fiction_synopsis}</textarea>
                </span>
            </li>
        </ul>
        <div class="switchListDiv">
            <p class="saved">
                <a href="javascript:" id="switchModelBtn">修改作品信息</a>
            </p>
            <p class="modify">
                <a href="javascript:" id="confirmedBtn">完成</a>
                <a href="javascript:" id="cancelBtn">取消</a>
            </p>
        </div>

    </div>

</div>
<%--<div class="maskDiv">--%>
<%--<div class="updateImageDiv">--%>
<%--<img src="">--%>

<%--</div>--%>
<%--</div>--%>
<%--<div class="maskUI" style="position: fixed;top:0;left:0;right: 0;bottom:0">--%>
<%--<div class="head">更新封面</div>--%>
<%--<a href="javascript:" id="close-btn" title="关闭">&times;</a>--%>
<%--<div class="bd">--%>
<%--<img src="">--%>
<%----%>
<%--</div>--%>
<%--</div>--%>

<script>
    $('.saved').css("display", "block");
    $('.modify').css("display", "none");
</script>
<script>
    $('#updateImage').click(function () {
        var maskDiv = '<div class="maskDiv" style="z-index: 999999; position: fixed; left: 0px; top: 0px; background-color: rgb(0, 0, 0); margin: 0px; padding: 0px; width: 100%; height: 100%; opacity: 0.5;"></div>';
        var maskUI = '<div class="maskUI" style="z-index: 1000000; position: fixed; left: 50%; top: 50%;width: 400px; height: 400px; margin-top: -200px; margin-left: -200px"">' +
            '<div class="fixed-box" id="imgDialog">\n' +
            '    <div>\n' +
            '        <div class="hd">\n' +
            '            <div>更新封面</div>\n' +
            '            <a href="javascript:" id="closeUI">&times;</a>\n' +
            '        </div>\n' +
            '        <div class="bd">\n' +
            '            <div class="updateBox" id="img_btn" style="cursor:pointer;">\n' +
            '                <img src="/zongyue/img/addImage.png" width="120" height="158" >\n' +
            '            </div>\n' +
            '            <div>\n' +
            '                <p>\n' +
            '                    上传图片div\n' +
            '                </p>\n' +
            '            </div>\n' +
            '        </div>\n' +
            '    </div>\n' +
            '</div>' +
            '</div>';
        $('body').append(
            maskDiv, maskUI
        );
    })
</script>
<script>
    // $('body').delegate(".maskDiv", "click", function (event) {
    //     $(this).remove();
    // });

    $('body').delegate("#closeUI", "click", function (event) {
        removeDiv();
    });

    $('body').delegate("#img_btn", "click", function (event) {
        $('#fImg').click();
        removeDiv();
    });

    function removeDiv() {
        $('.maskDiv').remove();
        $('.maskUI').remove();
    }

</script>
<script>
    $('#switchModelBtn').click(function () {
        $('.saved').css("display", "none");
        $('.modify').css("display", "block");
        $("#selectOp option[value=${fiction.genre_id}]").attr("selected", "selected");
    })
    $('#cancelBtn').click(function () {
        $('.saved').css("display", "block");
        $('.modify').css("display", "none");
    });
    $('#confirmedBtn').click(function () {
        // var formdata = new FormData(document.getElementById('updataFictionForm'));
        $('#fName').val($('#name').val());
        $('#Gid').val($('#selectOp').val());
        $('#Fs').val($('#synopsis').val());
        var formdata = new FormData($('#updateFictionForm')[0]);
        // console.log(formdata.get("fiction_id"));
        // console.log(formdata);
        // $('#updateFictionForm').submit();
        // var form = document.getElementById("updataFictionForm");
        // var form1 = new FormData(form);
        // console.log(form1);
        // var formdata = new FormData($('#updateFictionForm')[0]);
        // console.log(formdata);
        $.ajax({
            url: 'update_fiction_info',
            type: 'POST',
            async: false,
            cache: false,
            data: formdata,
            processData: false,
            contentType: false,
            // dataType: "json",
            success: function () {
                alert("保存成功");
                $('.saved').css("display", "block");
                $('.modify').css("display", "none");
                $('#jSetting').click();
            },
            error: function () {
                alert("网络异常");
            }

        });
        // $.post(
        //     "update_fiction_info",00
        //     $('#updateFictionForm').serializeArray(),
        //     function () {
        //
        //     }
        // );
        // $('#updateFictionForm').submit();
    });

    function getObjectUrl(file) {
        var url = null;
        if (window.createObjectURL != undefined) { // basic
            url = window.createObjectURL(file);
        } else if (window.URL != undefined) { // mozilla(firefox)
            url = window.URL.createObjectURL(file);
        } else if (window.webkitURL != undefined) { // webkit or chrome
            url = window.webkitURL.createObjectURL(file);
        }
        return url;
    }

    $('#fImg').on("change", function () {
        var objUrl = getObjectUrl(this.files[0]);
        if (objUrl) {
            $('#fImgshow').attr("src", objUrl);
        }
    });
</script>
