<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<title>CUSTOMER REGISTRATION PAGE</title>
		<style>
			.error{color:red}
		</style>
	</head>
	<body>
		<h1 align = "center">Registration Page</h1>
		<br>
		<hr>
		<br>
		<form:form action="processForm" modelAttribute="customers" method="post">
			First Name: <form:input path = "firstName"/>
			<br><br>
			Last Name<span class ="error">*</span>: <form:input path = "lastName"/>
			<form:errors path = "lastName" cssClass = "error" />
			<br><br>
			Free passes : <form:input path ="freePasses"/>
			<form:errors path = "freePasses" cssClass = "error"/>
			<br><br>
			
			postal code: <form:input path ="postalCode"/>
			<form:errors path = "postalCode" cssClass = "error"/>
			<br><br>
			
			Id : <form:input path ="id"/>
			<form:errors path = "id" cssClass = "error"/>
			<br><br>
			
			<input type = "submit" value = "Submit"/>
			<br><br>
		</form:form>
	</body>
</html>