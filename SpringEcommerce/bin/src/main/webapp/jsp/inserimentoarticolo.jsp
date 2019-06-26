<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form:form method="POST" modelAttribute="newArticolo">

<form:input id="codArticolo" path="codArticolo" type="text" placeholder="CodArticolo" />
<form:input id="descrizione" path="descrizione" type="text" placeholder="Descrizione" />
<form:input id="prezzo" path="prezzo" type="text" placeholder="Prezzo" />
<input type="submit" value="Inserisci">
</form:form>

</body>
</html>