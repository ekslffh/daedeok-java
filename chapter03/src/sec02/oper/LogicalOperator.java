package sec02.oper;

import java.io.IOException;
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) throws IOException {
		// 논리연산자(AND, OR) : 복수개의 논리값(조건식: 관계연산자)을 논리곱, 논리합 연산
		// 논리부정연산자(NOT) : 단항연산자로 토글(toggle) 기능
		// -------------------------------
		// 입력 출력
		// -------------------------------
		// A B AND OR EX-OR
		// 0 0 0 0 0
		// 0 1 0 1 1
		// 1 0 0 1 1
		// 1 1 1 1 0

//		int ch1 = System.in.read();
//		if ((ch1 >= 65) && (ch1 <= 90)) {
//			System.out.println("대문자입력");
//		} else if ((ch1 >= 97) && (ch1 <= 122)) {
//			System.out.println("소문자입력");
//		} else if ((ch1 >= 48) && (ch1 <= 57)) {
//			System.out.println("숫자 입력");
//		}
		
		// 한 글자를 입력 받아 대문자면 소문자로, 소문자면 대문자로 출력하시오.
//		int ch2 = System.in.read();
//		if ((ch2 >= 65) && (ch2 <= 90)) {
//			System.out.println((char)(ch2 + 32));
//		} else if ((ch2 >= 97) && (ch2 <= 122)) {
//			System.out.println((char)(ch2 - 32));
//		}
		
		// 한 자리 숫자 2개를 입력받아 더한 값을 출력하시오.
//		int ch3 = System.in.read() - 48;
////		System.in.skip(2);
//		System.in.read(); // CR
//		System.in.read(); // LF
//		int ch4 = System.in.read() - 48;
//		System.out.println(ch3 + ch4);
		
		Scanner sc = new Scanner(System.in);
		
		// [공통]키보드로 임의의 정수를 입력 받아 그 수가 짝수인지 홀수인지를 판별하시오.
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		// [선택]키보드로 입력 받은 문자열이 본인의 데이터베이스 계정id와 같으면
		// 두번째 문자열을 입력 받고 그 값이 자신의 DB계정 암호와 같으면
		// "반갑습니다. 정상적으로 Login 했습니다."를 출력하고 
		// 계정id가 틀리면 "사용자 계정이 없습니다"를
		// 암호가 틀리면 "잘못된 암호입니다"를 출력하는 프로그램 작성
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		if (id.equals("pc20")) {
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			if (password.equals("java")) {
				System.out.println("반갑습니다. 정상적으로 Login 했습니다.");
			} else {
				System.out.println("잘못된 암호입니다.");
			}
		} else {
			System.out.println("사용자 계정이 없습니다.");
		}
		
	}

}
