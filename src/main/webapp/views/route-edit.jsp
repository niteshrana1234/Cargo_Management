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
<h1 style="margin-left: 365px; margin-top: 10px;">${msg}</h1>
<div class="container">

    <h1>Route Registration</h1>
    <%--@elvariable id="route" type=""--%>
    <form:form action="updateRoute" modelAttribute="route">
        <form:hidden path="routeId"/><br><br>

        <label for="initialAddress">Enter initial address :</label>
        <form:input path="initialAddress"/><br><br>
        <label for="destinationAddress">Enter destination address :</label>
        <form:input path="destinationAddress" value=""/><br><br>

        <label for="departureDate">Select departure date:</label>
        <form:input type="date" path="departureDate" value=""/><br><br>
        <label for="arrivalDate">Select arrival date :</label>
        <form:input type="date" path="arrivalDate" value=""/><br><br>

        <input style="margin-bottom: 0px;" type="submit" value="Submit Edit"/>
    </form:form>
</div>

</body>
</html>
