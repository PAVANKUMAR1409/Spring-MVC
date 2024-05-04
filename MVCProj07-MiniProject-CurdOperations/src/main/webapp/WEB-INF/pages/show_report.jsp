<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>

<c:choose>
	<c:when test="${!empty list}">
			<table align="center" bgcolor="cyan">
				<tr style="color:red"> <th>EMPNO</th> <th>EMPNAME</th> <th>EMP_JOB</th> <th>EMP_SAL</th> <th>EMP_DEPTNO</th>  <th>Operations</th></tr>
				<c:forEach var="emp" items="${list}">
					<tr>
						<td>${emp.empno}</td>
						<td>${emp.ename}</td>
						<td>${emp.job}</td>
						<td>${emp.sal}</td>
						<td>${emp.deptno}</td>
						<td>
							<a href="edit_employee?no=${emp.empno}"><img  src="resources/images/edit.png" width="30px" height="30px"></a>
							&nbsp;&nbsp;
							<a href="delete_employee?no=${emp.empno}" onClick="return confirm('Do you want to delete?')"><img  src="resources/images/delete.png" width="30px" height="30px"></a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
				<h1 style="color:red;text-align:center">RECORDS NOT FOUND</h1>
		</c:otherwise>
</c:choose>
		<h1 style="text-align:center;color:green">${msg}</h1>

<br/>
<br/>
<center><a href="add_employee"><img src="resources/images/add.jpg" width="50" height="50"/>Add Employee</a></center>
<br/>
<br/>
<center><a href="./"><img  src="resources/images/home.png" width="50px" height="50px"></a></center>