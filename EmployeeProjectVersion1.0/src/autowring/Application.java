package autowring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("demo.xml");
		Employee e=(Employee) ctx.getBean("emp");
		System.out.println(e.toString());
		


	}

}
