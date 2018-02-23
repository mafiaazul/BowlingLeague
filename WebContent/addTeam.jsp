<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert a new team</title>
</head>
<body>
	<h2>Enter a new team</h2><br />
	<form action="addTeam" method="post">
		Enter Team Name: <input type="text" name="teamName" size="45"><br />
		Enter Team Type: <input type="text" name="teamType" size="20"><br />
		Enter Preferred Night: <input type="text" name="preferredNight" size="10"><br />
		<input type="submit" value="Add Team" />
	</form>
	
</body>
</html>