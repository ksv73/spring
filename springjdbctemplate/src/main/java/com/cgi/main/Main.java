package com.cgi.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.model.Employee;
import com.cgi.repo.EmployeeRepo;

public class Main {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
     EmployeeRepo repo=(EmployeeRepo)context.getBean("emprepo");
     Employee emp=(Employee)context.getBean("employee");
     Scanner scanner=new Scanner(System.in);
     int ch=0;
     while(true)
     {
    	 System.out.println("1) ADD EMPLOYEE");
	        System.out.println("2) DELETE EMPLOYEE");
	        System.out.println("3)  Update EMPLOYEE");
	        System.out.println("4)  display EMPLOYEE");

	        System.out.println("5) EXIT");
	        System.out.println("Enter the choice");
	        ch=scanner.nextInt();
	        switch(ch) {
     
	        case 1 :   Employee employee=new Employee();   
     System.out.println("enter the code");
     String code=scanner.next();
     System.out.println("enter the name");
     String name=scanner.next();
     emp.setCode(code);
     emp.setName(name);
     boolean b=repo.addEmployee(emp);
     if(b==true) {
    	 System.out.println("record added");
     }else
     {
    	System.out.println("record not added"); 
     }
     break;
     
	        case 2:
	        	System.out.println("enter the code to be deleted");
	           code=scanner.next();
	           boolean status=repo.deleteEmployee(code);
	           if(status==true){
	                 System.out.println("Deleted");
	            }
	           else
	            {
	                 System.out.println("Not deleted");
	            } 
	            break;
	       
	        case 3:System.out.println("enter the code to be updated ");
	      code=scanner.next();
	      System.out.println("enter the name");
	      name=scanner.next();
	      boolean u=repo.updateEmployee(name,code);
	      if(u==true) {
	    	  System.out.println("updated");
	      }
	      else
	      {
              System.out.println("Not updated");
  
	      }break;
	      
	     case 4:List<Employee> empList=repo.displayEmployee();
	             for(Employee e: empList) {
	            	 System.out.println(e.getCode()+"\t"+e.getName());
	            	 		
	             }break;
	     
	      
	        case 5:System.exit(0);
	        
	        }
     
	}
	} 
	}
     
