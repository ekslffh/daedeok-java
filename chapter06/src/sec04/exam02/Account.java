package sec04.exam02;

public class Account {
	// ����2] �������(�Աݰ� ���)�� ������ �� �ִ� ����Ŭ����(Account)�� �����Ͻÿ�.
	// 		 ���� Ŭ������ �����ֿ� �ܰ�Ӽ��� ������, �����ڿ� ���Ͽ� �ʱ�ȭ�ȴ�.
	//		 �Ա�(deposit)�� ���(withdraw)������ ó���ϴ� �޼���� �ܰ� Ȯ���ϴ� �޼���(getBalance)�� �����Ͻÿ�.
	
	// ����2]�� ���� Ŭ������ ��ü�� �����Ҷ� ������ ��ü�� �����Ǵ� ���� �ƴ϶� ��ü�� 
	// �ϳ��� �����ǰ� ������ ��ü������ ������ ��ü�� ������ �ּҸ�  �����϶�(�̱��� ����)
	
	// �̱��� ����
	// ���α׷� �������� ���Ǹ�, ��ü�� �ν��Ͻ��� ���� �Ѱ��� �����ǵ��� �����ϴ� ���
	// ������ �޸𸮸� ���� �ϳ��� �ν��Ͻ��� �����ǹǷ� ������� ���� �������
	// �̱��� �ν��Ͻ��� ��������(static)�� �ش��ϹǷ� �ٸ� Ŭ�������� ȣ���� �ν��Ͻ��� ������ ���� ����
	// �������� ���������ڰ� "private"�̴�.
	
	private static Account account;
	
	private String name;
	private int balance;
	
	private Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public static Account getAccount() {
		if (account == null) {
			account = new Account("������", 0);
		}
		return account;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("�ܰ� �����մϴ�.");
		} else {
			balance -= amount;
		}
	}
	
	public void getBalance() {
		System.out.println(name + " ������ �ܾ�: " + balance);
	}
	
}
