package com.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer customer = (Customer) context.getBean("bank");
		System.out.println("CustomerID: " + customer.getCustId());
		System.out.println(customer.getcName());
		System.out.println(customer.getAccount());
		System.out.println(customer.getLoan());
//		System.out.println(customer.getTransaction());
		System.out.println(customer.getAddress());

	}

}
