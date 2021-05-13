package model1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import models.Employee;

public class TestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("demo.xml");
		Employee e=(Employee) ctx.getBean("emp1");
		System.out.println(e.toString());
		

	}

}
