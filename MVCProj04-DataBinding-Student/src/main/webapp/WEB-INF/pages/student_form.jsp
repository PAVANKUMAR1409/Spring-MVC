<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="student" method="post">
				<table align="center" bgcolor="cyan">
					<tr>
						<td>Student No::</td>
						<td><input type="text" name="sno"/></td>
					</tr>
					<tr>
						<td>Student Name::</td>
						<td><input type="text" name="sname"/></td>
					</tr>
					<tr>
						<td>Student Address::</td>
						<td><input type="text" name="addrs"/></td>
					</tr>
					<tr>
						<td>Student Average::</td>
						<td><input type="text" name="avg"/></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="regsiter"/> </td>
					</tr>
				</table>
			
		</form>
</body>
</html>