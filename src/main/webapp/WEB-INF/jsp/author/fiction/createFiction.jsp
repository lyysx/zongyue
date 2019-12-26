<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/25
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="../../include/author/authorHeader.jsp" %>
<%@include file="../../include/author/authorNavigator.jsp" %>

<title>创建小说</title>
    <div class="container">
        <div class="workArea">
            <form action="author/fiction/add" method="post" enctype="multipart/form-data" style="padding-left: 100px;padding-right: 100px">
                <ul>
                    <li>
                        <em>作品图片</em>
                        <div class="imgDiv">
                            <img src="img/fictionImage/0.jpg" class="imgShow" id="imgShow">
                            <input type="file" name="uploadImage" id="imgUpper">
                        </div>

                    </li>
                    <li>
                        <em>作品名称 </em>
                        <input type="text" name="fiction_name" id="fictionNameInput" class="form-control">
                    </li>
                    <li>
                        <span>作品类型</span>
                        <div class="dropdown">
                            <button type="button" class="btn dropdown-toggle" id="dropdownMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span id="genreName">-请选择-</span><span class="caret"></span>
                                <input id="genreNameHide" name="genre_id" hidden>
                            </button>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">
                                <li class="dropdown-header">-请选择-</li>
                                <c:forEach var="genre" items="${genreList}">
                                    <li style="cursor: pointer" id="${genre.genre_id}">${genre.genre_name}</li>
                                </c:forEach>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <em>作品简介</em>
                        <textarea name="fiction_synopsis" id="fictionSynopsis" class="form-control" style="resize: none;height: 300px"></textarea>
                    </li>
                    <li>
                        <button type="submit" class="btn btn-primary" style="margin-top: 5px;float: right">创建完成</button>
                    </li>
                </ul>

            </form>


        </div>

    </div>
    </div>
    </div>
    <script>
        function getObjectUrl(file) {
            var url = null ;
            if (window.createObjectURL!=undefined) { // basic
                url = window.createObjectURL(file) ;
            } else if (window.URL!=undefined) { // mozilla(firefox)
                url = window.URL.createObjectURL(file) ;
            } else if (window.webkitURL!=undefined) { // webkit or chrome
                url = window.webkitURL.createObjectURL(file) ;
            }
            return url ;
        }
        // $("#example-basic").steps({
        //     headerTag: "h3",
        //     bodyTag: "section",
        //     transitionEffect: "slideLeft",
        //     autoFocus: true
        // });
        $('.dropdown-menu').on('click', function (e) {
            var targetValue = $(e.target);
            targetValue.is('li') && $("#genreName").text(targetValue.text());
            $("#genreNameHide").val(targetValue.attr("id"));
        })

        $('#imgUpper').on("change", function () {
            var objUrl = getObjectUrl(this.files[0]);
            if (objUrl) {
                $('#imgShow').attr("src", objUrl);
            }
        });
    </script>
    <%--<div id="example-basic">--%>
    <%--<h3>Keyboard</h3>--%>
    <%--<section>--%>
    <%--<p>Try the keyboard navigation by clicking arrow left or right!</p>--%>
    <%--</section>--%>
    <%--<h3>Effects</h3>--%>
    <%--<section>--%>
    <%--<p>Wonderful transition effects.</p>--%>
    <%--</section>--%>
    <%--<h3>Pager</h3>--%>
    <%--<section>--%>
    <%--<p>The next and previous buttons help you to navigate through your content.</p>--%>
    <%--</section>--%>
    <%--</div>--%>


    <%@include file="../../include/author/authorFooter.jsp" %>

