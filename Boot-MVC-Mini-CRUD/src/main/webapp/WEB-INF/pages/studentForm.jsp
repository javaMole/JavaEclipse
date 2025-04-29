<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body style="background-color:yellow">
<h1 style="color:red;text-align:center">Student Form</h1>
<br>
<br>
	
	<form action="register" method="POST" align="center">
	<b> Name : &nbsp;
	<input type="text" name="name"/>
	</b>
	<br>
	<br>
	<b> Course :&nbsp; 
	<input type="text" name="course"/>
	</b>
	<br>
	<br>
	<b> Fee : &nbsp;
	<input type="text" name="fee"/>
	</b>
	<br>
	<br>
	<input  type="submit" value="register" onclick="return confirm('Are you sure you want to save the details of the student ? ')"/>
	</form>


</body>
</html>