<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>categoryList</title>
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
                <c:forEach items="${categories}" var="c">
                    <li>
                            ${c.category.name}
                    </li>

                    <c:if test="${c.subCategories != null}">
                        <ul>
                            <c:forEach items="${c.subCategories}" var="s">
                                <li>
                                        ${s.name}
                                </li>
                            </c:forEach>
                        </ul>
                    </c:if>
                </c:forEach>
            </ul>
        </section>
    </div>
</div>

</body>
</html>
