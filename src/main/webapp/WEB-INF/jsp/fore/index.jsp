<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/10/28
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../include/fore/foreHeader.jsp" %>
<%@include file="../include/fore/foreNavigator.jsp"%>

<title>纵阅小说网</title>
<div class="main_content">
    <div class="top-box">
        <!--分类列表 -->
        <div class="genre-list">
            <div class="genreTitle">
                作品分类
            </div>
            <div class="container" style="width: 100%">
                <div class="row">
                    <c:forEach var="genre" items="${genres}" varStatus="st">
                        <div class="col-xs-6 flex <c:if test="${st.index % 2 == 0}"> even</c:if>">
                            <a href="genre/${genre.genre_id}">
                                    ${genre.genre_name}
                            </a>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- 轮播 -->
        <c:if test="${banners.isEmpty()}">
            <div id="sliderWrap" class="carousel slider" data-ride="carousel">
                <div class="carousel-inner" role="listbox">
                    <div class="item active ">
                        <img src="img/sliderImage/a1.jpg" >
                    </div>
                    <div class="item">
                        <img src="img/sliderImage/a2.jpg">
                    </div>
                    <div class="item">
                        <img src="img/sliderImage/a3.jpg">
                    </div>
                        <%--<c:forEach var="sliderFiction" items="${sliderFictions}">
                            <div class="item">
                                <img src="${sliderFiction.fiction_image}">
                            </div>
                        </c:forEach>--%>
                </div>
                <ol class="carousel-indicators">
                        <%--<c:forEach items="${sliderFictions}" varStatus="status">
                            <li data-target="#sliderWrap" data-slider-to="${status.index}"></li>
                        </c:forEach>--%>
                    <li data-target="#sliderWrap" data-slide-to="0" class="active"></li>
                    <li data-target="#sliderWrap" data-slide-to="1"></li>
                    <li data-target="#sliderWrap" data-slide-to="2"></li>
                </ol>
                <a class="left carousel-control" href="#sliderWrap" role="button" data-slide="prev" style="background-image: linear-gradient(to right,transparent 0,rgba(0,0,0,.0001) 100%);">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                </a>
                <a class="right carousel-control" href="#sliderWrap" role="button" data-slide="next" style="background-image: linear-gradient(to right,transparent 0,rgba(0,0,0,.0001) 100%);">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                </a>
            </div>
        </c:if>
        <c:if test="${!banners.isEmpty()}">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <c:forEach var="banner" varStatus="st" items="${banners}">
                        <li data-target="#carousel-example-generic"
                            data-slide-to="${st.index}"
                            <c:if test="${st.index==0}">class="active"</c:if>
                        >
                        </li>
                    </c:forEach>
                </ol>
                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <c:forEach var="banner" items="${banners}" varStatus="st">
                        <div class="item <c:if test="${st.index==0}">active</c:if>">
                            <a href="
                            <c:if test="${banner.promotion_url!=null}">${banner.promotion_url}</c:if>
                            <c:if test="${banner.promotion_url==null}">javascript:</c:if>
                             ">
                                <img src="img/sliderImage/${banner.promotion_image}" alt="网络异常">
                            </a>
                            <div class="carousel-caption">
                                ${banner.promotion_title}
                            </div>
                        </div>
                    </c:forEach>
                </div>
                <!-- Controls -->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev" style="background-image: linear-gradient(to right,transparent 0,rgba(0,0,0,.0001) 100%);">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next" style="background-image: linear-gradient(to right,transparent 0,rgba(0,0,0,.0001) 100%);">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </c:if>
        <!-- 榜单-->
        <div class="fictionListRecommend">
            <div class="recommendDiv">
                <div class="recommendTitle">推荐榜</div>
                <div class="moreRecommend">
                    <a href="">更多></a>
                </div>

            </div>
            <div class="recommendFictions">
                <ul>
                    <c:forEach var="fiction" items="${fictionsByRecommend}">
                        <li>
                            <a href="fiction/${fiction.fiction_id}">${fiction.fiction_name}</a>
                            <span>${fiction.fiction_recommend}</span>
                        </li>
                    </c:forEach>
                </ul>
            </div>

        </div>

    </div>


</div>






<%@include file="../include/fore/foreFooter.jsp" %>
