package secondaryDatatype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		String files[] = new String[] { "resources/carBean.xml", "resources/engineBean.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(files);
		Car c = (Car) context.getBean("car");
		c.printCar();
	}
}
