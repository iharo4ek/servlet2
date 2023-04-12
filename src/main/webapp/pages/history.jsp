<%--
  Created by IntelliJ IDEA.
  User: Igor
  Date: 12.04.2023
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<form action="/calc">
    <button>calculator</button>
</form>

<core:forEach items="${list}" var="operation">
    <h2>${operation.getNum1()} ${operation.getType()} ${operation.getNum2()} = ${operation.getResult()}</h2>
</core:forEach>

</body>
</html>
