<%--
  Created by IntelliJ IDEA.
  User: liuyangyang
  Date: 2019/9/18
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="back" style="background: #efefef">
<div id="wrapper">
    <div class="overlay"></div>

    <!-- Sidebar -->
    <nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">
        <ul class="nav sidebar-nav">
            <li class="sidebar-brand">
                <a href="javascript:">
                    作者中心
                </a>
            </li>
            <li>
                <a href="author/home"><i class="fa fa-fw fa-home"></i> 首页</a>
            </li>
            <li class="dropdown">
                <a href="javascript" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-fw fa-plus"></i> 小说管理 <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                    <li class="dropdown-header">小说管理</li>
                    <li><a href="author/fiction/list">我的小说</a></li>
                    <li><a href=" author/fiction/add">创作中心</a></li>
                </ul>
            </li>
            <li>
                <a href="javascript:"><i class="fa fa-fw fa-cog"></i> 个人设置</a>
            </li>
            <li>
                <a href="javascript:"><i class="fa fa-fw fa-dropbox"></i> 关于</a>
            </li>
            <li>
                <a href="javascript:"><i class="fa fa-fw fa-twitter"></i> 联系我们</a>
            </li>
            <li>
                <a href="author/login_out"><i class="fa fa-fw fa-sign-out"></i> 退出</a>
            </li>
        </ul>
    </nav>
    <!-- /#sidebar-wrapper -->
    <div id="page-content-wrapper">
        <button type="button" class="hamburger is-closed animated fadeInLeft" data-toggle="offcanvas">
            <span class="hamb-top"></span>
            <span class="hamb-middle"></span>
            <span class="hamb-bottom"></span>
        </button>
