<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单元素列表</title>
</head>
<body>

<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>
            <li><a href="${pageContext.request.contextPath}/eleAddView.do"><i class="fa fa-home"></i>添加表单元素</a></li>
            <li class="active">表单元素列表</li>
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
                        <th>元素名称</th>
                        <th>所属表单</th>
                    </tr>
            <c:forEach items="${form}" var="c">
                    <c:forEach items="${eles}" var="i">
                    <c:if test="${i.formname == c.name}">
                        <tr>
                            <td>${i.id}</td>
                            <td>${i.name}</td>
                            <td>${i.formname}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/FormeleDelete.do?id=${i.id}">删除</a>
                            </td>
                        </tr>
                    </c:if>
                    </c:forEach>
            </c:forEach>
                </table>

            </div>
        </section>
        <!--earning graph end-->
    </div>
</div>

</body>
</html>
