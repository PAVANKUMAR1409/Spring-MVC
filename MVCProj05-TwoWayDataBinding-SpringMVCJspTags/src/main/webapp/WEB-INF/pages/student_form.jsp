<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form:form  modelAttribute="stud"> 
		<!-- method="post" is default  -->
		<!-- if action is not given it take default as /MVCProj05-DataBinding-SpringMVCJspTags/student -->
				<table align="center" bgcolor="cyan">
					<tr>
						<td>Student No::</td>
						<td><form:input path="sno"/></td>
					</tr>
					<tr>
						<td>Student Name::</td>
						<td><form:input path="sname"/></td>
					</tr>
					<tr>
						<td>Student Address::</td>
						<td><form:input path="addrs"/></td>
					</tr>
					<tr>
						<td>Student Average::</td>
						<td><form:input path="avg"/></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="regsiter"/> </td>
					</tr>
				</table>
			
		</form:form>
</body>
</html>