package sec06.exam01;

public class BankAccount {
	// 잔액(속성:변수)
	protected int balance;
	// 메서드 : 입금, 출금, 송금, 잔액조회
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
