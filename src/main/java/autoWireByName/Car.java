package autoWireByName;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	private String carName;

	@Autowired
	@Qualifier(value="e1")
	private Engine engine;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carNme) {
		this.carName = carNme;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void printName() {
		System.out.println("Car Name  : " + carName);
		System.out.println("Model Year : " + engine);
	}
}
