package jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository {
	
	private Connection connection;
	  private PreparedStatement statement;
	
	  public EmployeeRepository() {
		 
  try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cgi123");
} catch (ClassNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e) {
	e.printStackTrace();
}

	  }
			
	   public boolean addEmployee(Employee employee)
	   {
		   String sql="insert into employee values(?,?)"; 
		   try {
			statement = connection.prepareStatement(sql);
			statement.setString(1,employee.getCode());
			statement.setString(2,employee.getName());
			int n=statement.executeUpdate();
			if(n>0) {
				System.out.println("record inserted successfully");

				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	   }  

			
		   public boolean deleteEmployee(String code){
			   //get the code from main
			   //delete the record for the code entered
			   //if the record got deleted , return true
			   
			   
			   String sql="delete from employee where code=?";
			   
			   try {
				statement = connection.prepareStatement(sql);
				statement.setString(1,code);
				System.out.println(sql);
				int n=statement.executeUpdate();
				if(n>0) {
					System.out.println("record deleted successfully");
					return true;
				}
			   } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;

			   }

			
			
			
			
		public List<Employee> getEmployees()
		{				  List<Employee>empList=new ArrayList<Employee>();

			  try {
				  statement = connection.prepareStatement("SELECT * FROM employee");
				 ResultSet rset = statement.executeQuery();
				   while (rset.next()) {
					   Employee emp=new Employee();
					   emp.setCode(rset.getString(1));
					   emp.setName(rset.getString(2));
					   empList.add(emp);
				   }

			
					
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return empList;

			
			   }

		



	
}
	
	
