package springreference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext context = new ClassPathXmlApplicationContext("springreference/config.xml");
 BasicDetails details = (BasicDetails) context.getBean("basicDetails");
 System.out.println(details);
	}

}
