<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: emibia
  Date: 2018/7/21
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看表单</title>
</head>
<body>
<th>${form.name}</th><br>
<c:forEach items="${eles}" var="i">
    <c:if test="${i.formname == form.name}">
        <tr><th>${i.name}</th><input type="text"><br></tr>
    </c:if>
</c:forEach>
</body>
</html>
