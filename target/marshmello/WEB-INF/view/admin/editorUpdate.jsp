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

            <li class="active">更新信息录入员信息</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">
                管理员可以修改 信息录入员信息

            </header>
            <div class="panel-body">
                <form method="post" action="${pageContext.request.contextPath}/editorUpdate.do">
                    编号：<input type="text" readonly name="id" value="${editor.id}" style="color:black"><br>
                    姓名：<input type="text" name="username" value="${editor.username}"><br>
                    密码：<input type="text" name="password" value="${editor.password}"><br>
                    <input type="submit" value="提交">
                    <input type="reset" value="重写">
                </form>
                <a href="${pageContext.request.contextPath}/queryEditorList.do">信息录入员列表</a>
            </div>
        </section>

    </div>
</div>

</body>
</html>
