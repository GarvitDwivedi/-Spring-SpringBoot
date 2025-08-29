package com.garvit.it;
import java.util.* ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\GARVIT DWIVEDI\\eclipse-workspace\\SpringDIconstructorInjection\\Springbeanfile.xml");
		
		
		Address a1 = (Address) container.getBean("address1");
		System.out.println(a1);
		
		Student s1 = (Student) container.getBean("student1");
		System.out.println(s1);
		
		System.out.println("_______________-");
		
		
		
		Address a2 = (Address) container.getBean("address2");
		System.out.println(a2);
		
		
		
		Student s2 = (Student) container.getBean("student2");
		System.out.println(s2);
		
		System.out.println("_______________-");
		
		
		
		Address a3 = (Address) container.getBean("address3");
		System.out.println(a3);
		
		
	
		Student s3 = (Student) container.getBean("student3");
		System.out.println(s3);
		
		Map<String , Integer>mp = s3.getMap();
		
		
		

	}

}
