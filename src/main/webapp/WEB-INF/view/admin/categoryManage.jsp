<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <li class="active">栏目目录列表</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">前台 栏目目录列表
            </header>
            <div class="panel-body">
                <%--<canvas id="linechart" width="600" height="330"></canvas>--%>

                <table border="1">
                    <tr>
                        <th>编号</th>
                        <th>栏目名</th>
                        <th>栏目层级</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${category}" var="i">
                        <tr>
                            <td>${i.id}</td>
                            <td>${i.name}</td>
                            <td>${i.parentId}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/CategoryUpdateView.do?id=${i.id}">修改</a>
                                <a href="${pageContext.request.contextPath}/CategoryDelete.do?id=${i.id}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>

            </div>
        </section>
        <!--earning graph end-->
    </div>
</div>

</body>
</html>
