package sec02.exam01;

public class ExamCast {

	public static void main(String[] args) {
		
		int intValue = 44032;
		char ch = (char) intValue;
		System.out.println(ch);
		
		double pi = 3.141592;
		intValue = (int) pi;
		System.out.println(intValue);
		
		// 난수(random number)
		System.out.println(Math.random());
		
//		0.0 <= 난수 < 1.0
//		0~100 사이의 난수
//		1.0 <= 난수*100 + 1 < 101.0
		
		// 10 ~ 50\\ 50 사이의 난수
		System.out.println((int)(Math.random()*40 + 10));
		
		int num1 = 1;
		int num2 = 2;
		
		double res = (double)num1 / num2;
		System.out.println(res);
		
//		String 타입의 형변환
//		String 타입 + any type => String type promotion
//		String str = "7";
		
		// 해당 wrapper class.parse기본타입명(문자열변수)
		String s1 = "200";
		int i1 = Integer.parseInt(s1);
		System.out.println(i1 + 10);
		
		short s2 = Short.parseShort(s1);
		System.out.println(s2 - 10);
		
		String flag = "false";
		boolean value = Boolean.parseBoolean(flag);
		System.out.println(value);
		
		// 기본타입을 문자열로 변환
		String str2 = s2 + "";
		String str3 = value + "";
		
		String str4 = String.valueOf(s2);
		
		String ss1 = "홍길동";
		String ss2 = "홍길동";
		
		// 리터럴 풀에 대한 저장주소 테스트
		if (ss1 == ss2) {
			System.out.println("저장 주소가 같다");
		} else {
			System.out.println("저장 주소가 다름");
		}
		
		String ss3 = new String("전우치");
		String ss4 = new String("전우치");
		if (ss3 == ss4) {
			System.out.println("저장 주소가 같다");
		} else {
			System.out.println("저장 주소가 다름");
		}
		
		
		
	}

}
