package sec04.exam02;

public class Phone {
	/* 이름과 전화번호 속성을 가진 Phone class를 생성하시오
	 * 메서드는 초기화를 위한 생성자, 개별적 전화번호 수정을 위한 메서드(setPhone) 및
	 * 전화번호와 이름을 출력하는 메서드(printPhoneNum)를 작성하시오
	 * 실행클래스 생성  
	 */
	private String name;
	private String phone;
	
	public Phone(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printPhoneNum() {
		System.out.println(name + ": " + phone);
	}
	
}
