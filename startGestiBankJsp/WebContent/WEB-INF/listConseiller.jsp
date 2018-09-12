<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des conseillers</title>
</head>
<body>
	<div align="center">
		<h1>Liste des conseiller</h1>
		
		<table border="1">

			<th>Matricule</th>
			<th>Nom</th>
			<th>Prenom</th>
			<th>email</th>
			<th>Pseudo</th>
			<th>adresse</th>
			<th>Tel</th>
			
			<c:forEach var="conseiller" items="${listConseiller}">
				<tr>
					<td>${conseiller.matriculeCnsi}</td>
					<td>${conseiller.nom}</td>
					<td>${conseiller.prenom}</td>
					<td>${conseiller.email}</td>
					<td>${conseiller.pseudo}</td>
					<td>${conseiller.adresse}</td>
					<td>${conseiller.tel}</td>
					<td><a href="editConseiller?id=${conseiller.matriculeCnsi}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteConseiller?id=${conseiller.matriculeCnsi}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<h4>
			Ajouter un conseiller <a href="newConseiller">here</a>
		</h4>
	</div>
</body>
</html>