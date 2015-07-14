<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
<form method="post" action="login.jsp">
<p><select name="database"><option value="gadata">Gadata</option><option value="dev_data">devdata</option></select>
<p>Company ID: <input type="text" name="companyID" placeholder="Company ID"></p>
<p>Employee ID: <input type="text" name="employeeID" placeholder="Employee ID"></p>
<p> <input type="submit" value="SUBMITT"></p>

</form>

</body>
</html>