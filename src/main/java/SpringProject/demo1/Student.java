package SpringProject.demo1;

public class Student {

	private String sName;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void hello() {
		System.out.println("Hello "+sName);
	}

}
