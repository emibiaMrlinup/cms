<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单列表</title>
</head>
<body>

<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>
            <li><a href="${pageContext.request.contextPath}/addFormView.do"><i class="fa fa-home"></i>添加表单</a></li>
            <li class="active">表单列表</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">
            </header>
            <div class="panel-body">
                <%--<canvas id="linechart" width="600" height="330"></canvas>--%>

                <table border="1">
                    <tr>
                        <th>编号</th>
                        <th>表单名称</th>
                        <th>所属栏目</th>
                        <th>所属文章</th>
                        <th>发布者</th>
                    </tr>
                    <c:forEach items="${forms}" var="i">
                        <tr>
                            <td>${i.id}</td>
                            <td>${i.name}</td>
                            <td>${i.categoris}</td>
                            <td>${i.articles}</td>
                            <td>${i.publish}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/elementAddView.do?id=${i.id}">添加表单元素</a>
                                <a href="${pageContext.request.contextPath}/FormView.do?id=${i.id}">查看表单</a>
                                <a href="${pageContext.request.contextPath}/FormUpdateView.do?id=${i.id}">修改</a>
                                <a href="${pageContext.request.contextPath}/FormDelete.do?id=${i.id}">删除</a>
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
