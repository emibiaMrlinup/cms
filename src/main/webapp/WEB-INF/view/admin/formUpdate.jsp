<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>修改表单</title>
</head>
<body>
<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>

            <li class="active">修改表单</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">
                添加表单

            </header>
            <div class="panel-body">
                <%--<canvas id="linechart" width="600" height="330"></canvas>--%>
                <form method="post" action="${pageContext.request.contextPath}/FormAdd.do"
                      enctype="multipart/form-data">
                    命名:<input type="text" name="name" value="${form.name}"><br>
                    发布者:<input type="text" name="publish" value="${form.publish}"><br>
                    所属栏目<select name="categoris" value="${form.categoris}">
                    <option value="0">==请选择==</option>
                    <c:forEach items="${cates}" var="i">
                        <option value="${i.name}" >${i.name}</option>
                    </c:forEach>
                </select>

                    <br>
                    <!-- 所属文章<span> <select name="articles">

                           <option>c.name</option>

                   </select>
                       </span> -->
                    <input type="submit" value="提交">
                    <input type="reset" value="重写">
                </form>
                <a href="${pageContext.request.contextPath}/formList.do">返回表单列表</a>
            </div>
        </section>
        <!--earning graph end-->
    </div>
</div>
</body>
</html>
