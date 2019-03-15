package arrayValueInjection;

public class Fruit {

	private String fruitName[];

	public String[] getFruitName() {
		return fruitName;
	}

	public void setFruitName(String[] fruitName) {
		this.fruitName = fruitName;
	}

	public void printFruitName() {

		for (int i = 0; i < fruitName.length ; i++) {
			System.out.println(fruitName[i]);
		}

	}

}
