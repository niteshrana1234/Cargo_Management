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
    <h1>List of Trucks</h1>
    <table>
        <thead>
        <tr>
            <th>Cargo ID</th>
            <th>Cargo Name</th>
            <th>Description</th>
            <th>Weight</th>
            <th>Picked up </th>
            <th>Delivered</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="cargo" items="${listCargo}">

            <tr>
                <td>${cargo.id}</td>
                <td>${cargo.name}</td>
                <td>${cargo.description}</td>
                <td>${cargo.weight}</td>
                <td>${cargo.pickupDate}</td>
                <td>${cargo.deliveryDate}</td>
                <td><a href="editCargo?id=${cargo.id}">Edit</a></td>
                <td><a href="deleteCargo?id=${cargo.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<a href="goBackCargo" style="display: block; margin-left: 280px;">Go back to Registration</a>


</body>
</html>
