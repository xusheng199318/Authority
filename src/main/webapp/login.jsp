<%--
  Created by IntelliJ IDEA.
  User: xusheng
  Date: 2017/10/31
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="js/dist/css/zui.css"/>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>

    <script type="text/javascript" src="js/dist/lib/jquery/jquery.js"></script>
    <script type="text/javascript" src="js/dist/js/zui.min.js"></script>
</head>
<body>
<form id="loginForm" class="form-horizontal" action="${pageContext.request.contextPath}/user/login" method="post" onsubmit="return check();">
    <div class="form-group">
        <label for="username" class="col-sm-3 required">用户名：</label>
        <div class="col-md-6 col-sm-10">
            <input type="text" id="username" class="form-control" placeholder="用户名：" name="username"/>
        </div>
    </div>

    <div class="form-group">
        <label for="password" class="col-sm-3 required">密码：</label>
        <div class="col-md-6 col-sm-10">
            <input type="password" id="password" class="form-control" placeholder="密码：" name="password"/>
        </div>
    </div>


    <div id="buttons" style="margin-left: 100px; margin-top: 30px;" class="form-group">
        <div  class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-primary">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;
            <button type="reset" class="btn btn-primary">重置</button>
        </div>
    </div>
</form>
<script type="text/javascript">
    function check() {
        var username = $("#username").val();
        if (username == undefined ||　username == "") {
            alert("用户名不能为空！");
            return false;
        }

        var password = $("#password").val();
        if (password == undefined || password == "") {
            alert("密码不能为空");
            return false;
        }
    }

</script>
</body>
</html>
