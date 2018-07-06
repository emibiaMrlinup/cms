<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link>
    <title>categoryList</title>
</head>
<body>

<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>
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
                    st="${c.parentId == null}">
                    <li id="${c.id}">
                            ${c.name}
                    </li>

                    <c:if test="${c.parentId != null}">
                        var i=$('${c.id}').

                        <ul>
                            <c:forEach items="${c.id}" var="s">
                                <li>
                                        ${s.name}a
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
