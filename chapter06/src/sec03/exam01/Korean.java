package sec03.exam01;

public class Korean {

	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean() {} // 기본생성자
	
	public Korean(String nation, String name, String ssn) { // 일반생성자
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
	}
	
	public Korean(String nation) { // 일반생성자
		this("홍길동", "abcdef@abc.com");
		this.nation = nation;
	}
	
	public Korean(String name, String ssn) { // 일반생성자
		this("대한민국", name, ssn);
	}
	
}
