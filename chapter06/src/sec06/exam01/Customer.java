package sec06.exam01;

public class Customer {
	// �̸�, ��������(��), �������¼� 
	private String name;
	private BankAccount[] accounts; // ��������(��)
	public int numberOfAccounts;
	
	public Customer(String name) {
		this.name = name;
		accounts = new BankAccount[5]; // �ִ� 5���� ���� ��������
	}
	
	public String getName() { // ���̸� ��ȯ
		return name;
	}
	
	public BankAccount getAccount(int idx) { // Ư�� ���¹�ȣ ��ȯ
		return accounts[idx];
	}
	
	public void addAccount(BankAccount account) { // ���� �������� �߰�
		accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}
	
	public int getNumberOfAccounts() { // ���� ������ �� ��ȯ
		return numberOfAccounts;
	}
	
	@Override
	public String toString() {
		return "�̸�: " + name + ", ���� ����: " + numberOfAccounts;
	}
	
}
