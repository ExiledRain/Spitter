<%@ taglib prefix="c" uri="java.sun.com/jsp/jstl/core" %>
<%@page session="false" %>
<%--
  Created by IntelliJ IDEA.
  User: XiR
  Date: 1/7/2021
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
<h1>Welcome to Spittr</h1>
<a href="<c:url value="/spittlers" />">Spittlers</a> |
<a href="<c:url value="/register" />">Register</a>
</body>
</html>
