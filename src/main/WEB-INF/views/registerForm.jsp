<%@ page session="false" %>
<%--
  Created by IntelliJ IDEA.
  User: XiR
  Date: 1/8/2021
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RegisterForm</title>
</head>
<body>
<h1>Register</h1>
<form method="post">
    First Name: <input type="text" name="firstName"/></br>
    Last Name: <input type="text" name="lastName"/></br>
    Username: <input type="text" name="username"/> </br>
    Password: <input type="password" name="password"/></br>
    <input type="submit" value="Register"/>
</form>
</body>
</html>