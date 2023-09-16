<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center">Welcome to the Cargo Management System</h1>
    <div class="row mt-5">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Create a Driver</h5>
                    <p class="card-text">Add a new driver to the system.</p>
                    <a href="/createDriver" class="btn btn-primary">Create Driver</a>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="card">
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
                <div class="card-body">
                    <h5 class="card-title">Create a Cargo</h5>
                    <p class="card-text">Add a new cargo to the system.</p>
                    <a href="/createCargo" class="btn btn-primary">Create Cargo</a>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="card">
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
