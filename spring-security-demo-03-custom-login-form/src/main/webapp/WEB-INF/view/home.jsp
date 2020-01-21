<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
<title>Luv2code</title>
</head>
<body>
	<h2>Luv2code Company Home page - Yohoo - Silly Goose - NO Soup!!!</h2>
	<hr>
	Welcome to luv2code home page!
	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">
		<input type="submit" value="logout" />
	</form:form>
</body>
</html>