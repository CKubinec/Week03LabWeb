<%--
  Created by IntelliJ IDEA.
  User: Craig
  Date: 2020-09-22
  Time: 3:22 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Age Calculator</title>
</head>
<body>
<h1>Age Calculator</h1>
<form method="post">
    <label>Enter Your Age:
    <input type="text" name="age"><br>
    </label>
    <p>${message}</p>
    <input type="submit" value="Age Next Birthday"><br>
    <a href="arithmetic">Arithmetic Calculator</a>
</form>
</body>
</html>
