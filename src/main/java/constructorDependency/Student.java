package constructorDependency;

public class Student {

	private String sName;
	private String sRollNo;
	private String sEmail;

	/*public Student() {
		System.out.println("Default Constructor");
	}*/
	
	public Student(String sName, String sRollNo, String sEmail) {
		super();
		this.sName = sName;
		this.sRollNo = sRollNo;
		this.sEmail = sEmail;
	}

	public void printName() {
		System.out.println("Student Name " + sName);
		System.out.println("Student Roll no " + sRollNo);
		System.out.println("Student Email  " + sEmail);
	}

}
