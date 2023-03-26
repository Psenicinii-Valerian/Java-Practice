<%--
  Created by IntelliJ IDEA.
  User: Valerian
  Date: 12/18/2022
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee manager | Login</title>
    <%@include file="common/bootstrap_css.html"%>
</head>

<body>
<%@ include file="common/header.html"%>
<div class="container">
    <h1>Welcome to employee manager</h1>
    <form method="post">
        <div class="form-group">
            <label for="exampleInputEmail1" class="form-label">User</label>
            <input type="text" name="user" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
        </div>
        <div class=form-group>
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" name ="password" class="form-control" id="exampleInputPassword1">
        </div>
        <div class="form-check">
            <input type="checkbox" class="form-check-input" id="exampleCheck1">
            <label class="form-check-label" for="exampleCheck1">Remember me</label>
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
</div>
<%@include file="common/bootstrap_js.html"%>
</body>
</html>
