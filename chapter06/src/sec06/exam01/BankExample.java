package sec06.exam01;

public class BankExample {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		BankAccount ba3 = new BankAccount();
		
		Customer c = new Customer("ȫ�浿");
		c.addAccount(ba1);
		c.addAccount(ba2);
		c.addAccount(ba3);
		
		Bank b1 = new Bank(c);
		Customer[] cust = b1.getCustomers();
		for (int i = 0; i < b1.getNumberOfCustomers(); i++) {
			System.out.println("�̸� : " + cust[i].getName());
			for (int j = 0; j < cust[i].getNumberOfAccounts(); j++) {
				BankAccount acc = cust[i].getAccount(j);
				System.out.println("�ܾ�: " + acc.getBalance());
			}
		}
	}
}
