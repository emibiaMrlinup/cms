<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>categoryList</title>
    <script>
        function x() {
            
        }
        
        
    </script>
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

<%--<c:forEach items="${category}" var="i"--%>
    <%--<c:if test="${i.parentId == null}">--%>
                <%--<ul id="${i.id}">--%>
                    <%--<li>一级栏目名称:${i.name}--%>
          <%--<c:if test="${i.parentId != null}">--%>
              <%--获得父栏目的ul append--%>
                        <%----%>
              <%--var parentNode=document.getElementById("${i.id}") --%>
                  <%----%>
              <%--$("ul").append(parentNode);--%>
                        <%--<ul>--%>
                            <%--<li>二级栏目</li>--%>
                        <%--</ul>--%>

                        <%--</c:if>--%>
                    <%--<li>--%>
                <%--</ul>--%>
                    <%--</c:if>--%>
                <%--</c:forEach>--%>

            </div>

            <%--<table border="1">--%>
                <%--<tr>--%>
                    <%--<th>编号</th>--%>
                    <%--<th>姓名</th>--%>
                    <%--<th>层级关系</th>--%>

                <%--</tr>--%>
                <%--<c:forEach items="${category}" var="c">--%>
                    <%--<tr>--%>
                        <%--<td>${c.id}</td>--%>
                        <%--<td>${c.name}</td>--%>
                        <%--<td>${c.parentId}</td>--%>
                    <%--</tr>--%>
                <%--</c:forEach>--%>
            <%--</table>--%>

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
