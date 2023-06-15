<%--
  Created by IntelliJ IDEA.
  User: Legas
  Date: 15.06.2023
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

<h2>Уважаемый сотрудник! Добро пожаловать.</h2>

<br>
<br>
<br>

<%--Ваше имя: ${param.employeeName}--%>
Name: ${employee.name}<br>
Surname: ${employee.surname}<br>
Salary: ${employee.salary}<br>
Department: ${employee.department}<br>
Your car: ${employee.carBrand}

</body>
</html>
