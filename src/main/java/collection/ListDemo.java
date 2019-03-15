package collection;

import java.util.List;

public class ListDemo {

	private List<String> countryName[];

	public List<String>[] getCountryName() {
		return countryName;
	}

	public void setCountryName(List<String>[] countryName) {
		this.countryName = countryName;
	}

	public void printName() {

		for (List<String> list : countryName) {
			System.out.println(list);
		}

	}

}
