<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Conseiller</title>
</head>
<body>
    <div align="center">
        <h1>Ajouter un conseiller</h1>
        <form:form action="saveConseiller" method="post" modelAttribute="conseiller">
        <table>
            <form:hidden path="matriculeCnsi"/>
            
            <tr>
                <td>Matricule:</td>
                <td><form:input path="matriculeCnsi" /></td>
            </tr>
            
            <tr>
                <td>Nom:</td>
                <td><form:input path="nom" /></td>
            </tr>
            
            
            <tr>
                <td>prenom:</td>
                <td><form:input path="prenom" /></td>
            </tr>
            
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr>
            
            <tr>
                <td>Pseudo</td>
                <td><form:input path="pseudo" /></td>
            </tr>
            
            <tr>
                <td>Mot de passe:</td>
                <td><form:input path="motDePasse" /></td>
            </tr>
            
            <tr>
                <td>Address:</td>
                <td><form:input path="adresse" /></td>
            </tr>
            <tr>
                <td>Telephone:</td>
                <td><form:input path="tel" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>