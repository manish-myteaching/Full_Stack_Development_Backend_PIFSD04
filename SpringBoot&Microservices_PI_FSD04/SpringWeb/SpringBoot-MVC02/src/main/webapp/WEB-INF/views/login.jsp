
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
</head>
<body>
	<c:if test="${not empty message}">
	       <h2 style="color:red"> ${message }</h2>       
	</c:if>
	<h2>Login</h2>
	<form action="/login" method="post">
		<label for="userid">User ID:</label><br /> <input type="text"
			id="userid" name="userid" required><br /> <br /> <label
			for="password">Password:</label><br /> <input type="password"
			id="password" name="password" required><br /> <br /> <input
			type="submit" value="Login">
	</form>
</body>
</html>
