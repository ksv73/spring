package com.cgi.pdemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("demo3.xml");
Employee empl=(Employee)context.getBean("emp");
System.out.println(empl.getId());
System.out.println(empl.getName());
System.out.println(empl.getDesig());
//System.out.println(empl.getAddress());
Address ad=empl.getAddress();
System.out.println(ad.getHno());
System.out.println(ad.getStreet());
System.out.println(ad.getCity());

	}

}
