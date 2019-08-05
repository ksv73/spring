package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Iterator;

public class EmployeeRepository {
	Scanner scanner=new Scanner(System.in);
	private List<Employee> employeeList;
	
	public EmployeeRepository()
	   {
	       employeeList=new ArrayList<Employee>();
	   }
	  public void setEmpList(List<Employee> empList){
	      this.employeeList=empList;
	  }
	  public List<Employee> getEmpList(){
	    return employeeList;
	  } 
	  public void addEmployee(Employee employee){
	    employeeList.add(employee);
	  }
	  public boolean deleteEmployee(int code)
	  {
	     boolean deleted=false;
	     Iterator<Employee> iter=employeeList.iterator();
	     while(iter.hasNext())
	     {
	       Employee e=iter.next();
	       if(e.getCode()==(code))
	          {
	                iter.remove();
	                deleted=true;
	                break;
	          }
	     }
	    return deleted;
	  } 
	  public boolean isExistEmployee(int code)
	   {
	      boolean isFound=false;
	      for(Employee e : employeeList) {
	          if(e.getCode()==(code))
	               {
	                 isFound=true;
	                 break;
	               } 
	     }        
	     return isFound;
	   }

}
