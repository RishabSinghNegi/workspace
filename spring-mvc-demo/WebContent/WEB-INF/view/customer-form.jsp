<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Customer Registration Form</title>
</head>
<style>
.error {
	color: red
}
</style>
<body>
	<form:form action="processForm" modelAttribute="customer">
 First name: <form:input path="firstName" />
 <br>
 Last Name: <form:input path="lastName" />
 <form:errors path="lastName" cssClass="error" />
		<br>
		Course Code: <form:input path="courseCode" />
 <form:errors path="courseCode" cssClass="error" />
 
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>