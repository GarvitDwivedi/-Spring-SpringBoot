package com.garvit.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\GARVIT DWIVEDI\\eclipse-workspace\\DependencyInjectionUsingXml\\SpringBeanDi.xml");
		
		
		Address a1 = (Address) container.getBean("address1");
		System.out.println(a1);
		System.out.println("_______________-");
		
		
		Student s1 = (Student) container.getBean("student1");
		System.out.println(s1);
		

	}

}
