package sec01.exception01;

public class ExceptionEx01 {

	public static void main(String[] args) {
		myMethod(20, 3);
		myMethod(30, 0);
	}

	public static void myMethod(int i, int y) {
		try {
			// 오류 발생 가능성이 있는 명령문들
			int res1 = 0;
			int res2 = 0;
			res1 = i / y;
			System.out.println("나눗셈 : " + res1);
			res2 = i % y;
			System.out.println("나머지 : " + res2);
		} catch (ArithmeticException e) {
			System.out.println("연산오류");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		System.out.println("정상적 종료");
	}

}
