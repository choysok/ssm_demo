<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2020/4/25
  Time: 5:59
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>查询所有账户</h1>
<c:forEach items="${listOfAccount}" var="account">
    ${account.name},${account.money}<br>
</c:forEach>
</body>
</html>
