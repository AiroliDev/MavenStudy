package com.sample.app;



import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.app.beans.Student;

public class AppMain {
 
	Logger log=Logger.getLogger(AppMain.class);

	public static void main(String[] args) {
		
	
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
	Student student=context.getBean("student",Student.class);
	System.out.println("Student AGE iS "+student.getAge());
	}
}
