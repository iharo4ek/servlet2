<%--
  Created by IntelliJ IDEA.
  User: Igor
  Date: 10.04.2023
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="/calc" method="post">
    <input type="number" value="${num1}" name="num1">
    <br>
    <br>
    <input type="number" value="${num2}" name="num2">
    <br>
    <br>
    <select name="type">
        <option value="SUM">SUM</option>
        <option value="SUB">SUB</option>
        <option value="MUL">MUL</option>
        <option value="DIV">DIV</option>
    </select>

    <br>
    <br>
    <button>calculate</button>
    <br>
</form>
<p>result: ${result}</p>

</body>
</html>

