<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Legas
  Date: 19.06.2023
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!Doctype html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Information for all employees</h3>
<br>
<br>
<security:authorize access="hasRole('HR')">
    <input type="submit" value="Salary" onclick="window.location.href = 'hr_info'">
    Only for HR staff
</security:authorize>
<br>
<br>
<security:authorize access="hasRole('MANAGER')">
    <input type="submit" value="Performance" onclick="window.location.href = 'manager_info'">
    Only for MANAGERS
</security:authorize>
</body>
</html>
