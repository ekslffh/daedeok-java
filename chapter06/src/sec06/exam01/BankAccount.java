package sec06.exam01;

public class BankAccount {
	// �ܾ�(�Ӽ�:����)
	protected int balance;
	// �޼��� : �Ա�, ���, �۱�, �ܾ���ȸ
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		} 
		return false;
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {
		if (otherAccount != null) {
			if (amount > balance || amount <= 0) {
				throw new IllegalArgumentException();
			} else {
				withdraw(amount);
				otherAccount.deposit(amount);
				return true;
			}
		}
		return false;
	}							
	
}
