<%--
  Created by IntelliJ IDEA.
  User: 张铭坤
  Date: 2018/7/11
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>questionList</title>
</head>
<script>
    window.onload = function sx() {
        var sex = document.getElementById('sex');
        var page = document.getElementById("page");
        var selects = document.getElementById("selects");
        var s = document.getElementsByName("gender");
        var c = document.getElementsByName("page");
        var e = document.getElementsByName("selects");

        if (sex.value == "男") {
            s[0].checked = s[0].checked;
        }
        if (sex.value == "女") {
            s[1].checked = !s[1].checked;
        }
        if (page.value == "主页") {
            c[0].checked = c[0].checked;
        }
        if (page.value == "公司信息") {
            c[1].checked = !c[1].checked;
        }
        if (page.value == "栏目内容") {
            c[2].checked = !c[2].checked;
        }
        // if (selects.value == "kj"){
        //     e[0].checked = e[0].checked;
        // }
        // if (selects.value == "sh"){
        //     e[1].checked = !e[1].checked;
        // }
        // if (selects.value == "rw"){
        //     e[2].checked = !e[2].checked;
        // }
        // if (selects.value == "ls"){
        //     e[3].checked = !e[3].checked;
        // }
        // if (selects.value == "ys"){
        //     e[4].checked = !e[4].checked;
        // }
        // if (selects.value == "yy"){
        //     e[5].checked = !e[5].checked;
        // }
        // if (selects.value == "xw"){
        //     e[6].checked = !e[6].checked;
        // }


    }
</script>

<body>
<p>调查问卷1</p>

<form action="${pageContext.request.contextPath}/addQuestion.do" method="post">
    您的名字是<input type="text" name="username">

    您现在的年龄是<input type="text" name="old">

    <p>您希望我们公司为您展现哪一方面的服务？</p>
    <select  name="selects">
        <option value="科技" >科技</option>
        <option value="生活" >生活</option>
        <option value="人文" >人文</option>
        <option value="历史" >历史</option>
        <option value="艺术" >艺术</option>
        <option value="音乐" >音乐</option>
        <option value="社会时事新闻" >社会时事新闻</option>
    </select>

    <p>您的性别?</p>
    <input type="hidden" id="sex">
    <input type="radio" name="sex" value="男" checked="checked"/>男
    <input type="radio" name="sex" value="女"/>女
    <p>关于我们的主页</p>

    <p>您最喜欢哪方面的页面</p>
    <input type="hidden" id="page">
    <input type="radio" name="page" value="主页"/>主页
    <input type="radio" name="page" value="公司信息"/>公司信息
    <input type="radio" name="page" value="栏目内容"/>栏目内容

    </p>
    <p>您希望我们为您提供什么样的服务</p>
    <textarea name="comments"/></textarea>
    <p>

        <input type="submit" value="提交">
        <input type="reset" value="重写">
</form>
</body>
</html>