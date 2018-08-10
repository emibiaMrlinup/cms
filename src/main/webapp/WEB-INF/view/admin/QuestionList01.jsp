<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/12
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>

<body>

<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>
            <li class="active">调查问卷01</li>
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
                        <th>姓名</th>
                        <th>年龄</th>
                        <th>选项</th>
                        <th>性别</th>
                        <th>喜爱页面</th>
                        <th>意见</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${questions}" var="q">
                        <tr>
                            <td>${q.id}</td>
                            <td>${q.username}</td>
                            <td>${q.old}</td>
                            <td>${q.selects}</td>
                            <td>${q.sex}</td>
                            <td>${q.page}</td>
                            <td>${q.comments}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/deleteQuestion.do?id=${q.id}">删除记录</a>
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
