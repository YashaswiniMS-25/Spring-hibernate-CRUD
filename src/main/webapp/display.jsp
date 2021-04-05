<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>

<title>Insert title here</title>
</head>

<body id="dispaly.do">
	<h1>welcome</h1>
	<table>
		<tr>
			<th>Team Id</th>
			<th>Team Name</th>
			<th>Home Ground</th>
			<th>Team captain</th>
			<th>Edit </th>
			<th>delete</th>
		</tr>


		<c:forEach items="${teams}" var="team">
			<tr>
				<td>${team.getTeamId()}</td>
				<td>${team.getTeamName()}</td>
				<td>${team.getHomeGround()}</td>
				<td>${team.getTeamCaptain()}</td>
				<td><a href="update.jsp">update</a></td>
				<td><a href="delete.jsp">delete</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>
