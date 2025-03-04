package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCoreApplication1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(SpringBootCoreApplication1Application.class, args);
		
		System.out.println("ApplicationName: "+cac.getApplicationName());
		System.out.println("DisplayName: "+cac.getDisplayName());
		System.out.println("Id: "+cac.getId());
		System.out.println("StartupDate: "+cac.getStartupDate());
		System.out.println("BeanDefinationCount: "+cac.getBeanDefinitionCount());
		
		System.out.println("BeanNames: ");
		String[] beanDefinitionNames = cac.getBeanDefinitionNames();
		
		for(String beanNames : beanDefinitionNames) {
			System.out.println(beanNames);
		}
		
	}

}
