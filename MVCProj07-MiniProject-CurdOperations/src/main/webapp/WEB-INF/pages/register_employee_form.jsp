<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false"%>

<h1 style="color:red;text-align:center">Register the Employee</h1>

<form:form action="add_employee" method="post" modelAttribute="emp">
	<table align="center" border="0" bgcolor="cyan">
		<tr>
			<td>Employee Name::</td>
			<td><form:input path="ename"/></td>
		</tr>
		<tr>
			<td>Employee job::</td>
			<td><form:input path="job"/></td>
		</tr>
		<tr>
			<td>Employee Salary::</td>
			<td><form:input path="sal"/></td>
		</tr>
		<tr>
			<td>Employee DeptNo::</td>
			<td><form:input path="deptno"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="register employee"/></td>
			<td><input type="reset"  value="cancel"/></td>
		</tr>
	
	</table>

</form:form>