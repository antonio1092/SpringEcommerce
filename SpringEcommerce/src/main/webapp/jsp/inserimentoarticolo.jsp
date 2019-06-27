<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="java.util.*" %>
<%@page import="com.ecommerce.webapp.entity.Categoria" %>
<%@page import="com.ecommerce.webapp.entity.Iva" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserimento</title>
</head>
<body>

<%
		ArrayList<Categoria> categorie = (ArrayList<Categoria>) request.getAttribute("categoria");
	ArrayList<Iva> listini = (ArrayList<Iva>) request.getAttribute("iva");
	%>

<form:form method="POST" modelAttribute="newArticolo">
<form:input id="codArticolo" path="codArticolo" type="text" placeholder="CodArticolo" />
<form:input id="descrizione" path="descrizione" type="text" placeholder="Descrizione" />
<label>Categoria:</label> <select
			name="categorie">

			<%
				if (categorie != null) {
			%>
			<%
				if (categorie.size() != 0) {
			%>

			<%
				for (Categoria c : categorie) {
			%>
			<option value="<%=c.getId()%>"><%=c.getDescrizione()%></option>
			<%
				}
			%>
		</select>
		<%
			}
		%>
		<%
			}
		%>


<input type="submit" value="Inserisci">
</form:form>

</body>
</html>