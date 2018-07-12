<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2018/7/4
  Time: 下午3:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Update editor </title>
</head>
<body>

<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>

            <li class="active">修改欄目信息</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">
                管理员可以修改 欄目信息
            </header>
            <div class="panel-body">
                <form method="post" action="${pageContext.request.contextPath}/categoryUpdate.do">
                    欄目编号：<input type="text" readonly name="id" value="${category.id}" style="color:black"><br>
                    欄目名稱：<input type="text" name="name" value="${category.name}"><br>
                    <input type="submit" value="提交">
                    <input type="reset" value="重写">
                </form>
                <a href="${pageContext.request.contextPath}/queryCategorylist.do">欄目列表</a>
            </div>
        </section>
    </div>
</div>
</body>
</html>
