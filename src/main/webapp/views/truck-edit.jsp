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
<h1>${msg}</h1>
<div class="container">
    <h1>Truck Registration</h1>
    <%--@elvariable id="truck" type=""--%>
    <form:form action="updateTruck" modelAttribute="truck">
        <form:hidden path="truckId"/><br><br>
        <label for="licencePlateNum">Enter plate number :</label>
        <form:input path="licencePlateNum"/><br><br>
        <label for="make">Enter truck make :</label>
        <form:input path="make" value=""/><br><br>
        <label for="model">Enter driving licence number :</label>
        <form:input path="model" value=""/><br><br>
        <input style="margin-bottom: 0px;" type="submit" value="Submit"/>
    </form:form>
</div>

</body>
</html>
