package com.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("account.xml");
		 Account a1=(Account) ctx.getBean("ac1");
		 Scanner scanner=new Scanner(System.in);
		 List l=new ArrayList();
		 l.add(scanner.next());
		 l.add(scanner.next());
		 a1.setAccount_holder(l);
		 System.out.println(a1.getAccount_holder().toString());

	}

}
