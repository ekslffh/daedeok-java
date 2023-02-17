package sec01.exam01;

public class ExampleRefVariable02 {

	public static void main(String[] args) {
		// 객체 참조변수 : class 타입
		// 사용형식
		// class명 변수명 = new class명([매개변수list]); -->생성자메서드
		Triangle tr1 = new Triangle();
		Triangle tr2 = tr1;

		System.out.println("tr1=" + tr1);
		System.out.println(tr2 == tr1);
		
		Triangle tr3 = new Triangle(10, 15);
		Triangle tr4 = new Triangle(50, 30);
		
		if (tr3.equals(tr4)) {
			System.out.println(" 같은 삼각형 객체");
		} else {
			System.out.println("서로 다른 삼각형 객체");
		}
	}

}

//class Triangle {
//	int width;
//	int height;
//
//	public Triangle() {}
//
//	public Triangle(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
//}
