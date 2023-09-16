<%--
  Created by IntelliJ IDEA.
  User: Nitesh Magar
  Date: 9/8/2023
  Time: 10:36 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Driver Registration</title>
    <style>
        .date-input {
            display: inline-block;
            margin-right: 20px; /* Adjust margin as needed */
        }
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);

        }

        h1 {
            margin: 0 0 20px;
            color: #333;
        }

        form {
            margin: 0;
            padding: 0;
        }

        form label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        form input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        form input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
        }

        form input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<h1 style="margin-left: 365px; margin-top: 10px;">${msg}</h1>
<div class="container">
    <h1 style="display: inline-block">Cargo Registration</h1>
    <a href="goHome" style="display: inline-block; padding-left: 220px">Home</a>

    <%--@elvariable id="cargo" type=""--%>
    <form:form action="saveCargo" modelAttribute="cargo">

        <form:hidden path="id"/><br><br>
        <label for="name">Enter cargo name :</label>
        <form:input path="name"/><br><br>

        <label for="description">Enter cargo description :</label>
        <form:input path="description" value=""/><br><br>

        <label for="weight">Enter cargo weight :</label>
        <form:input path="weight" value=""/><br><br>

        <div class="date-input">
            <label for="pickupDate">Enter pickup date:</label>
            <form:input type="date" path="pickupDate" value=""/>
        </div>

        <div class="date-input">
            <label for="deliveryDate">Enter delivery date:</label>
            <form:input type="date" path="deliveryDate" value=""/>
        </div>

        <input style="margin-bottom: 0px; display: block; margin-top: 15px;" type="submit" value="Submit"/>

    </form:form>
    <a href="viewAllCargo" style="margin-top: 20px; display: block;">View All Cargo</a>
</div>

</body>
</html>
