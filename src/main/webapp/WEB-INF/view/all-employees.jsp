<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>All employees</title>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 15px;
            text-align: center;
        }
    </style>
</head>
<body>
<h2>All employees</h2>
<br>
<table style="font-size: 24px">
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="emp" items="${allEmps}">
        
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"></c:param>
        </c:url>
        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="empId" value="${emp.id}"></c:param>
        </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="submit" value="Update"
                       onclick="window.location.href='${updateButton}'"
                       style="font-size: 24px">
                <input type="submit" value="Delete"
                       onclick="window.location.href='${deleteButton}'"
                       style="font-size: 24px">
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="submit" value="Add" onclick="window.location.href='addNewEmployee'" style="font-size: 24px">
</body>
</html>
