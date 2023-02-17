package homework3_2;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {

		// 키보드로 정수 2개를 입력받아 4칙연산을 수행하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int a = sc.nextInt(); 
		System.out.print("정수2: ");
		int b = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		
		sc.close();
		
	}

}
