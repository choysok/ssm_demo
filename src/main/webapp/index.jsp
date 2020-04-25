<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2020/4/25
  Time: 5:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/account/testFindAll">测试查询</a>

<h1>测试保存</h1>

<form action="/account/testSave" method="post">
    姓名：<input type="text" name="name"><br>
    金额：<input type="text" name="money"><br>
    <input type="submit" value="保存">
</form>
<br>
</body>
</html>
