<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cargo Management System</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }

        .container {
            padding: 30px;
        }

        .card {
            border: none;
            transition: transform 0.2s;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            padding: 20px;
        }

        .card:hover {
            transform: scale(1.03);
        }

        .card-img-top {
            max-width: 150px;
            max-height: 150px;
            object-fit: contain;
            margin: 0 auto;
        }

        .card-title {
            font-size: 1.5rem;
            margin-top: 20px;
            color: #007bff;
        }

        .btn-primary {
            width: 100%;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="text-center mb-5">Welcome to the Cargo Management System</h1>
    <div class="row">
        <div class="col-md-6">
            <div class="card">
                <img src="/driver.jpeg" alt="Driver Image" class="card-img-top">
                <div class="card-body">
                    <h5 class="card-title">Create a Driver</h5>
                    <p class="card-text">Add a new driver to the system.</p>
                    <a href="/createDriver" class="btn btn-primary">Create Driver</a>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="card">
                <img src="/truck.webp" alt="Truck Image" class="card-img-top">
                <div class="card-body">
                    <h5 class="card-title">Create a Truck</h5>
                    <p class="card-text">Add a new truck to the system.</p>
                    <a href="/createTruck" class="btn btn-primary">Create Truck</a>
                </div>
            </div>
        </div>
    </div>
    <div class="row mt-4">
        <div class="col-md-6">
            <div class="card">
                <img src="/cargo.jpg" alt="Cargo Image" class="card-img-top">
                <div class="card-body">
                    <h5 class="card-title">Create a Cargo</h5>
                    <p class="card-text">Add a new cargo to the system.</p>
                    <a href="/createCargo" class="btn btn-primary">Create Cargo</a>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="card">
                <img src="/route.webp" alt="Route Image" class="card-img-top">
                <div class="card-body">
                    <h5 class="card-title">Create a Route</h5>
                    <p class="card-text">Add a new route to the system.</p>
                    <a href="/createRoute" class="btn btn-primary">Create Route</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
