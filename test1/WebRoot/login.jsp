<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="test1.model.*" %>
<%@ page import="java.sql.Statement,java.sql.SQLException" %>  
<%@ page import="java.sql.ResultSet" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<%  
   
   String companyID= request.getParameter("companyID");  
   String employeeID=request.getParameter("employeeID");  
   String databaseName=request.getParameter("database");  
   
  
   SQLConnect con1 = new SQLConnect();

   con1.dbConnect(databaseName);
   Statement statementTemp = con1.returnStatement();
   Employee e1 = new Employee();

   ResultSet  rsTemp = e1.selectEmployeeQuery(statementTemp,companyID,employeeID);
	int rsCount = 0;
   try {
	   Decrypt de1=new Decrypt();
	   boolean found = false;

	   while ( rsTemp.next() )
	   {
	       found = true;
	       out.println("Password:   ");  
			// out.println(rsTemp.getString(1));	
			out.println(de1.decode(rsTemp.getString("user_key")));
			
	   }

	   if (!found)
	   {
		   out.println("No Data");	   
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
   //out.println(request.remoteHost);  
     
      
        
     // session.setAttribute("name",name);  
    
%> 

<%@include file="debugInfo.jsp" %>
</body>
</html>