package test1.model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Xiaoyi
 */
public class SQLConnect {
    Statement statement;
    Connection conn;
   public void dbConnect(String databaseName)
   {
      try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          conn = DriverManager.getConnection("jdbc:sqlserver://10.208.121.234;databaseName="+databaseName+";","xiaoyic","bd9ap2cu");
         //System.out.println("connected");
        // statement = conn.createStatement();        
        
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   public Statement returnStatement()
  {
	 if (conn != null)
	 {	 
     try {
          statement = conn.createStatement();        
       
     } catch (Exception e) {
        e.printStackTrace();
     }
	 }
     return statement;
  }
   
   public void dbConnect()
  {
     try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.208.121.234;databaseName=gadata;","xiaoyic","bd9ap2cu");
        System.out.println("connected");
        statement = conn.createStatement();        
       
     } catch (Exception e) {
        e.printStackTrace();
     }
  }
   public int selectEmployeeQuery(String companyId,String companyEmployeeId)
   {
	   String queryString = "select top 1* from reward_employees where company_id="+companyId+"and company_employee_id='"+companyEmployeeId+"'";
	   ResultSet rs = null;
	   //Row Count
	   int rsCount = 0;
	 
	try {
		rs = statement.executeQuery(queryString);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       try {
		while (rs.next()) {
			//rs.getInt("id");rs.getString(1
			 rsCount = rsCount + 1;
		     
		     
		   }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       return rsCount;
   }
   
   
   public void selectUsersQuery(String companyId,String companyEmployeeId)
   {
	   String queryString = "select top 1 * from reward_user where company_id="+companyId+"and company_employee_id='"+companyEmployeeId+"'";
	   ResultSet rs = null;
	   //Row Count
	   int rsCount = 0;
	 
	try {
		rs = statement.executeQuery(queryString);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       try {
		while (rs.next()) {
			//rs.getInt("id");rs.getString(1
			 rsCount = rsCount + 1;
		      
		     
		   }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   
}

