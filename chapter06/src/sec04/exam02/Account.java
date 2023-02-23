package sec04.exam02;

public class Account {
	// 문제2] 은행업무(입금과 출금)을 수행할 수 있는 계좌클래스(Account)를 생성하시오.
	// 		 계좌 클래스는 예금주와 잔고속성이 있으며, 생성자에 의하여 초기화된다.
	//		 입금(deposit)과 출금(withdraw)동작을 처리하는 메서드와 잔고를 확인하는 메서드(getBalance)를 구현하시오.
	
	// 문제2]의 계좌 클래스의 객체를 생성할때 별도의 객체가 생성되는 것이 아니라 객체는 
	// 하나만 생성되고 각각의 객체변수에 생성된 객체의 동일한 주소만  배정하라(싱글톤 패턴)
	
	// 싱글톤 패턴
	// 프로그램 전역에서 사용되며, 객체의 인스턴스가 오직 한개만 생성되도록 설계하는 방법
	// 고정된 메모리를 갖는 하나의 인스턴스만 생성되므로 사용자의 수와 관계없이
	// 싱글톤 인스턴스는 전역변수(static)에 해당하므로 다른 클래스에서 호출한 인스턴스와 데이터 공유 가능
	// 생성자의 접근지정자가 "private"이다.
	
	private static Account account;
	
	private String name;
	private int balance;
	
	private Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public static Account getAccount() {
		if (account == null) {
			account = new Account("나성민", 0);
		}
		return account;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("잔고가 부족합니다.");
		} else {
			balance -= amount;
		}
	}
	
	public void getBalance() {
		System.out.println(name + " 고객님의 잔액: " + balance);
	}
	
}
