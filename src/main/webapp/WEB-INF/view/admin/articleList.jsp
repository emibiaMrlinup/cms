<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>articleList</title>
</head>
<body>

<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>
            <li class="active">文章列表</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">test article
            </header>
            <div class="panel-body">
            </div>

            <ul>
                <c:forEach items="${articleList}" var="i">
                    <li>${i.id}</li>
                    <li>${i.name}</li>
                    <li>${i.content}</li>
                    <li>${i.keyword}</li>
                    <li>${i.author}</li>
                </c:forEach>
            </ul>
        </section>
    </div>
</div>

</body>
</html>
