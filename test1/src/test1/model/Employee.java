package test1.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	
	public ResultSet selectEmployeeQuery(Statement statement,String companyId,String companyEmployeeId)
	   {
		   String queryString = "select top 1  * from reward_employees re join reward_user ru on re.user_id = ru.user_id where re.company_id="+companyId+"and company_employee_id='"+companyEmployeeId+"'";
		   ResultSet rs = null;
		   //Row Count
		   
		 
		try {
			
			rs = statement.executeQuery(queryString);
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		return rs;
	   }
}
