package sec02.exam01;

/**
 * @author PC-20
 * boolean
 * true / false 중 하나 표현
 * 조건문에 주로 사용
 * 자동 초기 값은 false
 * 형변환의 대상이 될 수 없음
 */

public class ExamBoolean {

	public static void main(String[] args) {
		
		boolean flag = false;
		int age = 25;
		
		flag = (age >= 18);
		if (flag) {
			System.out.println("성년입니다!");
		} else {
			System.out.println("미성년자입니다.");
		}
		
		while(flag) {
			System.out.println("조건이 참이면 반복문이 실행됩니다");
		}
		
	}

}
