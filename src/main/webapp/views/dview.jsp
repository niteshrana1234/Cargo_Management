<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>List of Drivers</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        h1 {
            margin: 0 0 20px;
            color: #333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ccc;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        .action-buttons {
            display: flex;
            justify-content: space-between;
        }

        .edit-button, .delete-button {
            padding: 5px 10px;
            border: none;
            cursor: pointer;
        }

        .edit-button {
            background-color: #28a745;
            color: #fff;
        }

        .delete-button {
            background-color: #dc3545;
            color: #fff;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>List of Drivers</h1>
    <table>
        <thead>
        <tr>
            <th>Driver ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Licence Number</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="driver" items="${listDriver}">
            <tr>
                <td>${driver.driverId}</td>
                <td>${driver.name}</td>
                <td>${driver.age}</td>
                <td>${driver.licenceNum}</td>
                <td><a href="editDriver?id=${driver.driverId}">Edit</a></td>

<%--                <td><a href="deleteDriver?id=${driver.id}">Delete</a></td>--%>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<a href="goBack">Go back to Registration</a>

</body>
</html>
