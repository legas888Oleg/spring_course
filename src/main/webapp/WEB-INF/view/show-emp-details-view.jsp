<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Legas
  Date: 15.06.2023
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
</head>

<body>

<h2>Уважаемый сотрудник! Добро пожаловать.</h2>

<br>
<br>
<br>

<%--Ваше имя: ${param.employeeName}--%>
Name: ${employee.name}<br>
Surname: ${employee.surname}<br>
Salary: ${employee.salary}<br>
Phone number: ${employee.phoneNumber}<br>
Email: ${employee.email}<br>
Department: ${employee.department}<br>
Your car: ${employee.carBrand}
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>

</body>
</html>
