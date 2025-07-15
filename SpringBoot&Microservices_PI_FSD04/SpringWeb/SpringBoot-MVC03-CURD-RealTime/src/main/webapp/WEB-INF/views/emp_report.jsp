<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
<title>All Employees</title>
<style>
table {
	width: 80%;
	border-collapse: collapse;
	margin: 20px auto;
}

th, td {
	padding: 12px;
	border: 1px solid #ccc;
	text-align: left;
}

th {
	background-color: #f4f4f4;
}

h2 {
	text-align: center;
}
</style>
</head>
<body>
	<h2>All Employees</h2>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Designation</th>
				<th>Salary</th>
				<th>Department No</th>
				<th>Edit/Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${employees}">
				<tr>
					<td>${emp.employeeId}</td>
					<td>${emp.employeeName}</td>
					<td>${emp.designation}</td>
					<td>${emp.salary}</td>
					<td>${emp.departNumber}</td>
					<td><a href="delete-employee?employeeId=${emp.employeeId}" onclick="return  confirm('Do you want to delete..!')">
							<img src="images/delete.png" width="40" height="40" />
					</a>
					<a  style="margin-left: 20px;" href="edit-employee?employeeId=${emp.employeeId}"> 
					        <img src="images/edit.png" width="40" height="40" />
					</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<h1 style="color: green; text-align: center">${message}</h1>

	<h1 style="text-align: center">
		<a href="/add-employee">
			<button>Add Employee</button>
		</a>
	</h1>
</body>
</html>
