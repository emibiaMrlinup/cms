<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加媒体库信息</title>
</head>
<body>
<!-- Main row -->
<div class="row">

    <div class="col-md-12">
        <!--breadcrumbs start -->
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i>主页 </a></li>

            <li class="active">添加媒体库信息</li>
        </ul>
        <!--earning graph start-->
        <section class="panel">
            <header class="panel-heading">
                添加媒体库信息

            </header>
            <div class="panel-body">
                <%--enctype="multipart/form-data"是上传二进制数据。form里面的input的值以2进制的方式传过去--%>
                <%--<canvas id="linechart" width="600" height="3id30"></canvas>--%>
                <form method="post" action="${pageContext.request.contextPath}/mediaAdd.do"
                      enctype="multipart/form-data">

                    媒体库名称：<input type="text" name="name"><br>
                    媒体库类别：<br>
                    <div>
                        <input type="radio" name="type" value="图片" checked="checked">图片<br>
                        <input type="radio" name="type" value="视频">视频<br>
                    </div>
                    媒体库文件路径：<input type="file" name="multipartFile"/>
                    <%--媒体库所属栏目：<input type="text" name="categoryId"><br>--%>
                    <input type="submit" value="提交">
                    <input type="reset" value="重写">
                </form>
                <a href="${pageContext.request.contextPath}/queryMediaList.do">返回媒体库列表</a>
            </div>
        </section>
        <!--earning graph end-->
    </div>
</div>
</body>
</html>
