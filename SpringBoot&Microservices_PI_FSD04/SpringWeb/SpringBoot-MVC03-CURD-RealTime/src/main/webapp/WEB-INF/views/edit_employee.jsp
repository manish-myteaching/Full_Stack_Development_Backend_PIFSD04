<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee Registration Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	background: #f4f4f4;
	padding: 20px;
}

form {
	background: white;
	padding: 25px;
	border-radius: 10px;
	max-width: 400px;
	margin: auto;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h2 {
	text-align: center;
}

label {
	font-weight: bold;
}

input[type="text"], input[type="number"] {
	width: 100%;
	padding: 10px;
	margin: 8px 0 15px;
	border: 1px solid #ccc;
	border-radius: 4px;
}

input[type="submit"] {
	width: 100%;
	background: #28a745;
	color: white;
	padding: 12px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background: #218838;
}
</style>
</head>
<body>

	<c:if test="${not empty message}">
		<h2 style="color: red">${message }</h2>
	</c:if>

	<form:form method="post" action="/edit-employee"
		modelAttribute="employee">

		<!-- Employee Name -->
		<form:label path="employeeId">Employee Id:</form:label>
		<form:input path="employeeId" readonly="true" />
		<br>
		<br>

		<!-- Employee Name -->
		<form:label path="employeeName">Employee Name:</form:label>
		<form:input path="employeeName" />
		<br>
		<br>

		<!-- Designation -->
		<form:label path="designation">Designation:</form:label>
		<form:input path="designation" />
		<br>
		<br>

		<!-- Salary -->
		<form:label path="salary">Salary:</form:label>
		<form:input path="salary" type="number" step="0.01" />
		<br>
		<br>

		<!-- Department Number -->
		<form:label path="departNumber">Department Number:</form:label>
		<form:select path="departNumber">
			<form:option value="" label="-- Select Department --" />
			<form:option value="10">HR</form:option>
			<form:option value="20">Sales</form:option>
			<form:option value="30">IT</form:option>
			<form:option value="40">Finance</form:option>
		</form:select>
		<br>
		<br>
		<input type="submit" value="Submit" />

	</form:form>

</body>
</html>
