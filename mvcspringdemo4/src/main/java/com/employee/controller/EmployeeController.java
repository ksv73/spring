package com.employee.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	EmployeeRepository repo=new EmployeeRepository();


@RequestMapping("/")
	public String addEmployee(Model model)
	{
	List<Employee>empList=repo.getEmployeeList();
	model.addAttribute("employeelist", empList);
		return "index";
	}
@RequestMapping("/saveEmployee")
public String saveEmployee(@RequestParam Integer code,@RequestParam String name,Model model) 
{
	Employee employee=new Employee();
	employee.setCode(code);
	employee.setName(name);
	repo.addEmployee(employee);
	model.addAttribute("employeelist",repo.getEmployeeList() );
	return "index";
}
@RequestMapping("/deleteEmployee")
public String deleteEmployee(@RequestParam Integer code,Model model)
{
	repo.deleteEmployee(code);
	model.addAttribute("employeelist", repo.getEmployeeList());
	return "index";
}
	
}
