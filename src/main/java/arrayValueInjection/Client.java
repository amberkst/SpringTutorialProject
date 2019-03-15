package arrayValueInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("resources/fruitBean.xml");
		Fruit f = (Fruit) context.getBean("fruit");
		f.printFruitName();
	}

}
