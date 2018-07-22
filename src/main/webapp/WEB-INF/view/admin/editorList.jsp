<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>EditorList</title>
</head>
<body>

<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>
            <li class="active">信息录入员列表</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">
                信息录入员列表

            </header>
            <div class="panel-body">
                <%--<canvas id="linechart" width="600" height="330"></canvas>--%>

                <table border="1">
                    <tr>
                        <th>编号</th>
                        <th>姓名</th>
                        <th>密码</th>
                        <th>性别</th>
                        <th>角色</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${editors}" var="editor">
                        <tr>
                            <td>${editor.id}</td>
                            <td>${editor.username}</td>
                            <td>${editor.password}</td>
                            <td>${editor.sex}</td>
                            <td>${editor.role}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/editorUpdateView.do?id=${editor.id}">修改</a>
                                <a href="${pageContext.request.contextPath}/editorDelete.do?id=${editor.id}">删除</a>
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
