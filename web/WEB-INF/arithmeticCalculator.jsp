<%--
  Created by IntelliJ IDEA.
  User: Craig
  Date: 2020-09-22
  Time: 6:16 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Arithmetic Calculator</title>
</head>
<body>
    <h1>Arithmetic Calculator</h1>
    <form method="post">
        <label>First:
        <input type="text" name="first" value="${first}"><br>
        </label>
        <label>Second:
        <input type="text" name="second" value="${second}"><br>
        </label>
        <input type="submit" value="+" name="+">
        <input type="submit" value="-" name="-">
        <input type="submit" value="*" name="*">
        <input type="submit" value="%" name="%"><br>
        <p>Result: ${message}</p>
        <a href="age">Age Calculator</a>
    </form>
</body>
</html>
