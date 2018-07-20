<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>categoryList</title>
</head>
<body>

<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>
            <li class="active">媒体库管理列表</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">test
            </header>

            <div class="panel-body">
                <%--<canvas id="linechart" width="600" height="330"></canvas>--%>

                <table border="1">
                    <tr>
                        <th>编号</th>
                        <th>媒体库资源名称</th>
                        <th>媒体资源类型</th>
                        <th>媒体资源路径</th>
                        <th>媒体资源所属栏目编号</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${mediaFiles}" var="media">
                        <tr>
                            <td>${media.id}</td>
                            <td>${media.name}</td>
                            <td>${media.type}</td>
                            <td>${media.path}</td>
                            <td>${media.categoryId}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/mediaUpdateView.do?id=${media.id}">修改</a>
                                <a href="${pageContext.request.contextPath}/mediaDelete.do?id=${media.id}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>

            </div>
        </section>
    </div>
</div>

</body>
</html>
