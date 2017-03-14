<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UploadFile</title>
</head>
<body>
<h2>uploadFile</h2>
<form action="upload" enctype="multipart/form-data" method="post">
	<table>
		<tr>
			<td>describe</td>
			<td><input type="text" name = "description"></td>
		</tr>
		<tr>
			<td>choose File:</td>
			<td><input type = "file" name = "file"></td>
		</tr>
		<tr>
			<td><input type="submit" value="upload">
			</td>
		</tr>
	
	</table>


</form>
</body>
</html>