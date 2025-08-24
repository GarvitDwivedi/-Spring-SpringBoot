package com.garvit.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		
		
	ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\GARVIT DWIVEDI\\eclipse-workspace\\BeanConfiguration\\springBean.xml");
	
	Address ad = (Address) container.getBean("a1"); ;
	
	System.out.println(ad);

		
		

	}

}
