<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit form</title>
</head>
<body style="background-color:yellow">
<h1 style="color:red;text-align:center">Student Edit Form</h1>
<br>
<br>
	
	<frm:form  method="POST" align="center" modelAttribute="studentD" >
	
	<b> Name : &nbsp;
	<frm:input path="name"/>
	</b>
	<br>
	<br>
	<b> Course :&nbsp; 
	<frm:input path="course"/>
	</b>
	<br>
	<br>
	<b> Fee : &nbsp;
	<frm:input path="fee"/>
	</b>
	<br>
	<br>
	<input  type="submit" value="edit" onclick="return confirm('Are you sure you want to make the following changes ? ')"/>
	</frm:form>


</body>
</html>