package sec02.exam01;

import java.util.Scanner;

public class ExamInput02 {

	public static void main(String[] args) {
		// Scanner: 다양한 자료를 키보드로 입력 받고자 하는 경우 사용
		// java.util 패키지에 존재
		// next(): 문자열 입력
		// nextInt(), nextByte(), nextShort(), nextLong(): 정수 입력
		// nextDouble, nextFloat(): 실수 입력
		// nextLine(): 줄단위로 입력받아 문자열로 저장
		
		// Scanner class를 사용하기 위한 절차
		// 1) import java.util.Scanner
		// 2) 객체생성: Scanner 객체명 = new Scanner(System.in);
		// 3) 타입명 변수명 = 객체명.nextInt();
		// 자신의 이름과 나이를 키보드로 입력 받아 변수에 저장하고 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.nextLine();
//		System.out.print("나이를 입력하세요 : ");
//		int age = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("=================");
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
		
		// 반지름(실수)을 입력 받아 원둘레와 원의 넓이를 구하여 출력
		final double PI = 3.1415926;
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		
		double round = 2 * PI * radius;
		double area = PI * radius * radius;
		System.out.printf("원둘레 : %.2f\n", round);
		System.out.printf("원의 넓이 : %.2f", area);
				
	}

}
