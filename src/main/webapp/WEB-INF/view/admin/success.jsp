<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/12
  Time: 11:06
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
<font size="5">提交成功！</font>
<font size="5">点击按钮返回主页</font>
<form name="form1">
    <button type="submit"  onclick="fh()">返回</button>
</form>
</body>
</html>
<script>
    function fh(){
        document.form1.action="${pageContext.request.contextPath}/";
        document.form1.submit();
    }
</script>
