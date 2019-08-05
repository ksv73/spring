package com.cgi.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.cgi.model.Employee;

public class EmployeeRepo {
	private List<Employee> employeeList;

	public EmployeeRepo() {
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
	@Autowired	
	JdbcTemplate jdbcTemplate;

	public boolean addEmployee(Employee employee) {
		int rows=0;
		boolean inserted=false;
	    String sql="insert into employee values(?,?)";
	 rows = jdbcTemplate.update(sql,employee.getCode(),employee.getName());
		if(rows>0) {
			inserted=true;
		}
		return inserted;
	}


	public boolean deleteEmployee(String code){
		int rows=0;
		boolean deleted=false;

		   String sql="delete from employee where code=?";
		   rows=jdbcTemplate.update(sql,code);
		   
		   
		   if(rows>0) {
				deleted=true;
			}
			return deleted;
		
	}



	public boolean updateEmployee(String name,String code){
		int rows=0;
		boolean updated=false;

		String sql = "update employee set name=(?) WHERE code =(?)" ;
		rows=jdbcTemplate.update(sql,name,code);
			if(rows>0) {
				updated=true;
				
			}return updated;
	}

	public List<Employee> displayEmployee(){
		String sql="select code,name from employee";
		List<Employee> empList=jdbcTemplate.query(sql,new EmployeeMapper());
		return empList;
	}

	

















	private PreparedStatementSetter code() {
		// TODO Auto-generated method stub
		return null;
	}


	}
