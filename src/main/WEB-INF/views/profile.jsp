<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: XiR
  Date: 1/8/2021
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile page</title>
</head>
<body>
<h1>Your profile</h1>
<c:out value="${spitter.username}" /></br>
<c:out value="${spitter.firstName}" />
    <c:out value="${spitter.lastName}"/>
</body>
</html>
