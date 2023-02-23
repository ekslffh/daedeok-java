package sec02.exam01;

public class Customer {
	private String ID;
	private String passWd;
	
	public Customer(String ID, String passWd) {
		this.ID = ID;
		this.passWd = passWd;
	}

	public String getID() {
		return ID;
	}

	public String getPassWd() {
		return passWd;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	
	
		
}
