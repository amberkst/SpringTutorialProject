package autowirebyType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {

		String[] file = new String[] { "resources/autoWireCarBean.xml", "resources/autoWireEngineBean.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(file);
		Car car = (Car) context.getBean("car");
		car.printName();

	}

}
