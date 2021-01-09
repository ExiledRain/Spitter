<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
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
<sf:form method="POST" commandName="spitter">
    <sf:errors path="*" element="div"/>
    <sf:label path="firstName">First Name: </sf:label>
        <sf:input path="firstName"/></br>
    <sf:label path="lastName" >Last Name:</sf:label>
        <sf:input path="lastName"/></br>
    <sf:label path="username" > Username:</sf:label>
        <sf:input path="username"/> </br>
    <sf:label path="password">Password:</sf:label>
        <sf:password path="password"/></br>
    <input type="submit" value="Register"/>
</sf:form>
</body>
</html>
