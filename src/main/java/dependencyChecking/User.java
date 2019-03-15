package dependencyChecking;

import org.springframework.beans.factory.annotation.Required;

public class User {

	private String name;
	private Address address;
	private int contactNo;

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public void printName() {
		System.out.println("UserName " + name);
		System.out.println("UserAddress " + address);
		System.out.println("UserContact " + contactNo);
	}

}
