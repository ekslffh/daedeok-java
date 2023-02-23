package sec04.exam02;

public class Goods {
	// 상품클래스에는 상품번호와 상품명으로 구성되며 ,상품명만 매개변수로 사용하는 생성자가 존재한다.
	// 실행클래스에서 상품클래스를 생성시킬때마다 상품번호가 자동적으로 1씩 증가되도록 설계하시오.

	private static long gid = 1000;
	private String gName;

	public Goods(String gName) {
		gid++;
		this.gName = gName; 
	}

	@Override
	public String toString() {
		return "상품코드 : " + gid + "\n상품명 : " + gName;
	}

}
