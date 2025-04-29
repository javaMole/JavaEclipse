<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Report Page</title>
</head>
<body style="background-color:yellow">
	<h1 style="color: red; text-align: center">Report Page</h1>
	<br>
	
		<c:choose>
		<c:when test="${!empty studentList}">
	<table  border="1" align="center"  style="font-size:30px;border-collapse:separate; border-spacing: 3px; border: 1px solid black;text-align:center">
		<tr style="background-color:green">
			<th>ID</th>
			<th>Name</th>
			<th>COURSE</th>
			<th>FEE</th>
			<th>MODIFY</th>

		</tr>
	<c:forEach var="student"  items="${studentList.getContent()}"  >
		<tr style="background-color:cyan">
			
		<td>${student.id}</td>
		<td>${student.name}</td>
		<td>${student.course}</td>
		<td>${student.fee}</td>
		<td> 
		<a href="edit?id=${student.id}" onclick="return confirm('Are you sure you want to change the student details ?')"><img src="images/edit.png" width="30" height="50"/></a>&nbsp;/
		<a href="delete?id=${student.id}" onclick="return confirm('Are you sure you want to delete the message ? ')"><img src="images/delete.png" width="30" height="40"/></a>
		</td>

		</tr>
	</c:forEach>




	</table>
			<c:if test="${!empty message}">
			
				<h1 style="color:red;text-align:center">${message}</h1>
			</c:if>
			<br>
			<center>
			<c:if test="${!studentList.isFirst()}">
				<a href="showReport?page=0">First</a>
			</c:if>
				&nbsp;&nbsp;
			<c:if test="${!studentList.isLast()}">
				<a href="showReport?page=${studentList.getNumber()+1}"> Next </a>
			</c:if>
			&nbsp;&nbsp;
			
			
		<c:forEach  var="i"  begin="1" end="${studentList.getTotalPages()}" step="1">
		
				<a href="showReport?page=${i-1}">[${i}]</a>  &nbsp;&nbsp;
		
		</c:forEach>
		
				&nbsp;&nbsp;
		<c:if test="${!studentList.isFirst()}">
				<a href="showReport?page=${studentList.getNumber()-1}">Previous</a>
			</c:if>
			&nbsp;&nbsp;
			<c:if test="${!studentList.isLast()}">
				<a href="showReport?page=${studentList.getTotalPages()-1}"> Last </a>
			</c:if>
			
			</center>
		</c:when>
		
		
		<c:otherwise>
		<h1 style="color:red;text-align:center">
		Cannot find the records 
		</h1>
		</c:otherwise>
		</c:choose>
		<br>
<h1 style="color:red;text-align:center">
<a href="register"> 
<img src="images/add.png" width="100" height="100"/> Add new Student</a>
</h1>


</body>
</html>