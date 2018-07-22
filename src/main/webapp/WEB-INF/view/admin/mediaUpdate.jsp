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

            <li class="active">更新媒体库信息</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">
                管理员可以修改媒体库信息<

            </header>
            <div class="panel-body">
                <form method="post" action="${pageContext.request.contextPath}/mediaUpdate.do">
                    编号：<input type="text" readonly name="id" value="${mediaFiles.id}" style="color:black"><br>
                    媒体库名：<input type="text" name="name" value="${mediaFiles.name}"><br>
                    类型：<input type="text" name="type" value="${mediaFiles.type}"><br>
                    <input type="submit" value="提交">
                    <input type="reset" value="重写">
                </form>
                <a href="${pageContext.request.contextPath}/queryMediaList.do">媒体库资源列表</a>
            </div>
        </section>

    </div>
</div>

</body>
</html>
