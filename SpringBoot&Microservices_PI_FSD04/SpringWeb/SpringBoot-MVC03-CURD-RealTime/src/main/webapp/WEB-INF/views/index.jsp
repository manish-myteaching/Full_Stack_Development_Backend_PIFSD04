<!DOCTYPE html>
<html>
<head>
    <title>Employee Report</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        .report-container {
            text-align: center;
            margin-top: 50px;
        }

        .report-container h2 {
            color: #2c3e50;
        }

        .report-container p {
            font-size: 16px;
            color: #555;
        }

        .report-image {
            margin-top: 20px;
            transition: transform 0.3s ease;
            border: 2px solid #ccc;
            border-radius: 10px;
            width: 300px;
        }

        .report-image:hover {
            transform: scale(1.05);
            cursor: pointer;
        }
    </style>
</head>
<body>

<div class="report-container">
    <h2>Employee Report</h2>
    <a href="get-all-employee">
        <img class="report-image" src="images/report.jpg" alt="Employee Report" />
    </a>
</div>

</body>
</html>
