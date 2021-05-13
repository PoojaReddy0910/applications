package constructormode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationConstructor {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("demo.xml");
        Employee2 e = (Employee2)con.getBean("emp1");
        System.out.println(e.toString());
	}

}
