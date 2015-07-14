package test1.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
	private Statement statement;
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
			      System.out.println(rsCount);
			     
			   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   
}
