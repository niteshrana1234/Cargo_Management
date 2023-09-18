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


    </style>
</head>
<body>

<h1>${message}</h1>

<div class="container">
    <h1>List of Routes</h1>
    <table>
        <thead>
        <tr>
            <th>Route ID</th>
            <th>Initial Address</th>
            <th>Destination Address</th>
            <th>Departure</th>
            <th>Arrival</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="route" items="${listRoute}">

            <tr>
                <td>${route.routeId}</td>
                <td>${route.initialAddress}</td>
                <td>${route.destinationAddress}</td>
                <td>${route.departureDate}</td>
                <td>${route.arrivalDate}</td>
                <td><a href="editRoute?id=${route.routeId}">Edit</a></td>
                <td><a href="deleteRoute?id=${route.routeId}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<a href="goBackRoute" style="display: block; margin-left: 280px;">Go back to Registration</a>


</body>
</html>
