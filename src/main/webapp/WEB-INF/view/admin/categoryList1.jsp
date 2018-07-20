
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>categoryList1</title>
</head>
<body>

<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>

            <li><a href="${pageContext.request.contextPath}/Categorymanage.do"><i class="fa fa-home"></i>栏目管理 </a></li>
            <li class="active">栏目目录树形列表</li>

        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">test
            </header>
            <div class="panel-body">
            </div>
            <ul>
                <c:forEach items="${category}" var="c">


                    <c:if test="${c.parentId==null}">
                    <li id="${c.id}">${c.name}</li>
                    </c:if>

                    <c:if test="${c.parentId != null}">
                            <ul>
                            <c:forEach items="${category}" var="i">

                                    <c:if test="${i.parentId==c.id}">

                                        <li>${i.name}</li>
                                    </c:if>

                            </c:forEach>
                            </ul>
                    </c:if>
                </c:forEach>
            </ul>
        </section>
    </div>
    <ul>
        <li>1111</li>

            <ul>
                <li>222222</li>
            </ul>


    </ul>
</div>

</body>
</html>
