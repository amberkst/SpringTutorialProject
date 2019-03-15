package dependencyChecking;

public class Address {

	private String uAddress;

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	@Override
	public String toString() {
		return "Address [uAddress=" + uAddress + "]";
	}
	
}
