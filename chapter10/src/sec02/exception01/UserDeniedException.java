package sec02.exception01;

import java.util.Scanner;

public class UserDeniedException {
/**
 * 새로운 예외 클래스 정의
 * <사용형식>
 * class 예외클래스명 extends Exception {
 * 		예외클래스명() {
 * 			super("예외메시지");
 * 		}
 * }
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;

		try {
			System.out.print("시험점수 : ");
			score = Integer.parseInt(sc.nextLine());
			
			if (score < 0 || score > 100) {
				throw new BadInputException();
			}
		} catch (BadInputException e) {
			e.printStackTrace();
		}
	}
	
}

class BadInputException extends Exception {
	BadInputException() {
		super("사용자의 입력 값이 올바르지 않습니다");
	}	
}