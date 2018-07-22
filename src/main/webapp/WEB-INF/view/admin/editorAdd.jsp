<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2018/7/4
  Time: 上午9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加信息录入员</title>
</head>
<body>
<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>

            <li class="active">添加信息录入员</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">
                添加信息录入员

            </header>
            <div class="panel-body">
                <%--<canvas id="linechart" width="600" height="330"></canvas>--%>
                <form method="post" action="${pageContext.request.contextPath}/editorAdd.do"
                      enctype="multipart/form-data">
                    姓名:<input type="text" name="username"><br>
                    密码：<input type="password" name="password"><br>
                    性别：<input type="text" name="sex"><br>
                    <input type="submit" value="提交">
                    <input type="reset" value="重写">
                </form>
                <a href="${pageContext.request.contextPath}/queryEditorList.do">返回信息录入员列表</a>
            </div>
        </section>
        <!--earning graph end-->
    </div>
</div>
</body>
</html>
