package sec04.exam02;

public class AccountEx {

	public static void main(String[] args) {

		Account a1 = Account.getAccount();
		
		a1.deposit(200000);
		
		a1.getBalance(); // ������ ������ �ܾ�: 200000
		
		Account a2 = Account.getAccount();
		
		a2.getBalance(); // ������ ������ �ܾ�: 200000

		System.out.println(a1 == a2); // true
		
	}

}
