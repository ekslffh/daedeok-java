package sec06.exam01;

public class Customer {
	// 이름, 소유계좌(들), 소유계좌수 
	private String name;
	private BankAccount[] accounts; // 소유계좌(들)
	public int numberOfAccounts;
	
	public Customer(String name) {
		this.name = name;
		accounts = new BankAccount[5]; // 최대 5개의 계좌 소유가능
	}
	
	public String getName() { // 고객이름 반환
		return name;
	}
	
	public BankAccount getAccount(int idx) { // 특정 계좌번호 반환
		return accounts[idx];
	}
	
	public void addAccount(BankAccount account) { // 고객의 계좌정보 추가
		accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}
	
	public int getNumberOfAccounts() { // 고객당 계좌의 수 반환
		return numberOfAccounts;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ", 계좌 개수: " + numberOfAccounts;
	}
	
}
