package sec04.exam02;

public class PhoneEx {

	public static void main(String[] args) {

		Phone p1 = new Phone("³ª¼º¹Î", "010-8481-9926");
		
		p1.printPhoneNum();
		
		p1.setPhone("010-1234-5678");
		
		p1.printPhoneNum();
		
	}

}
