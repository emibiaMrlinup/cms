<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/12
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
</head>
<body>
<form name="form1">

    <button type="submit" class="btn btn-teal" onclick="wj01()">调查问卷01</button>
    <button type="submit" class="btn btn-pink" onclick="wj02()">调查问卷02</button>
    <button type="submit" class="btn btn-pink" onclick="wj03()">调查问卷03</button>

</form>
</body>
</html>
<script>
    function wj01() {
        document.form1.action = "${pageContext.request.contextPath}/selectQuestion01.do";
        document.form1.submit();
    }

    function wj02() {
        document.form1.action = "${pageContext.request.contextPath}/selectQuestion02.do";
        document.form1.submit();
    }

    function wj03() {
        document.form1.action = "${pageContext.request.contextPath}/selectQuestion03.do";
        document.form1.submit();
    }
</script>
