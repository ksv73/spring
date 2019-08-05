package com.employee.repository;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

import com.employee.model.Employee;


public class EmployeeRepository {
	private List<Employee> employeeList;

	public EmployeeRepository() {
		employeeList=new ArrayList<Employee>();
	}
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
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

}
