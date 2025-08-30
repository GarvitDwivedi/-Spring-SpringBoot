package com.garvit.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\GARVIT DWIVEDI\\eclipse-workspace\\LearningAutoWiring\\springBean.xml");
		
		Address a1 = (Address) container.getBean("address");
		
		System.out.println(a1);
		
		Student s1 = (Student) container.getBean("student2");
		
		System.out.println(s1);
		
		
		
	}

}
