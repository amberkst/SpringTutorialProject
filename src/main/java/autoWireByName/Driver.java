package autoWireByName;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {

		String[] file = new String[] { "resources/autoWireCarBeanByName.xml",
				"resources/autoWireEngineBeanByName.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(file);
		Car car = (Car) context.getBean("car");
		car.printName();

	}

}
