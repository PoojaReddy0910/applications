package autotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AutoApplication {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("demo.xml");
		Employee1 e=(Employee1) con.getBean("emp1");
		System.out.println(e.toString());

	}

}
