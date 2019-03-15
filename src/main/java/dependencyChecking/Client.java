package dependencyChecking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("resources/userBean.xml");
		User user = (User) context.getBean("user");
		user.printName();
	}
}
