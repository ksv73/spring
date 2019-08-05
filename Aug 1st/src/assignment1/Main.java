package assignment1;

import java.util.List;
import java.util.Scanner;

import java.util.Iterator;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
List<Employee> employeeList=new ArrayList<Employee>();

int choice=0;
while(true) {
	System.out.println("1) ADD EMPLOYEES");
    System.out.println("2) DISPLAY EMPLOYEES");
    System.out.println("3) Delete Employess");
    System.out.println("4) SEARCH Employess");
    System.out.println("5)exit");
    System.out.println("Enter your choice");
    choice=scanner.nextInt();

   //List<Employee> employeeList = null;
	switch(choice)
    {
    case 1   :   
                 Employee employee=new Employee();
                 System.out.println("Enter the code");
                 int code=scanner.nextInt();
                 System.out.println("Enter the name");
                 String name=scanner.next();
                 employee.setCode(code);
                 employee.setName(name);
		        employeeList.add(employee);
		        break;
   
    case 2: for(Employee e:employeeList)	{
    	System.out.println(e.getCode()+"\t"+e.getName());
    }
    break;
    	
    	case 3: Employee emp= new Employee();
    	Iterator<Employee> iterator= employeeList.iterator();
        System.out.println("Enter the roll number to be deleted");
        code=scanner.nextInt();
        while(iterator.hasNext())
        {
            Employee e=iterator.next();
            if(e.getCode()==code)
            {
                iterator.remove();
                
            }
    }
        break;
        
    	case 4: System.out.println("enter code to be searched");
        int searchcode = scanner.nextInt();
        for(Employee e:employeeList) {
            if(e.getName().equals(searchcode)) {
                System.out.println(e.getName()+"\t"+e.getCode());
            }
    	
    }
        break;
    	case 5:  System.exit(0);
		        
}
	}

}
}