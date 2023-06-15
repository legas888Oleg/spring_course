<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Legas
  Date: 15.06.2023
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!Doctype html>
<html>
<head>
    <title>Employee info</title>
</head>
<body>
<h2>Employee info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee">
    Name <form:input path="name"/><br><br>
    Surname <form:input path="surname"/><br><br>
    Department <form:input path="department"/><br><br>
    Salary <form:input path="salary"/><br>
    <br>
    <input type="submit" value="OK">
</form:form>


</body>
</html>
