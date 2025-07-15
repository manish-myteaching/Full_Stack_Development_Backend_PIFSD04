<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<title>User Registration Form</title>
</head>
<body>
	<c:if test="${not empty message}">
	       <h2 style="color:red"> ${message }</h2>       
	</c:if>
	<h2>User Registration</h2>
	<form action="/register" method="post">
		<label for="username"> Username:</label><br /> <input type="text"
			id="username" name="username"><br /> <br /> <label
			for="email">Email:</label><br /> <input type="email" id="email"
			name="email"><br /> <br /> <label for="userid">User
			ID:</label><br /> <input type="text" id="userid" name="userid"><br />
		<br /> <label for="password">Password:</label><br /> <input
			type="password" id="password" name="password"><br /> <br />
		<input type="submit" value="Register">
	</form>
</body>
</html>
