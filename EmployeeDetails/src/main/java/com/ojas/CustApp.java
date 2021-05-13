package com.ojas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustApp {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("customer.xml");
		Customer c= (Customer) ac.getBean("customer");
		System.out.println(c.toString());
		c.destroy();

	}

}
