package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class ExampleFor2 {

	public static void main(String[] args) {

		// 구구단 출력
		// 키보드로 출력할 단을 입력 받아 해당 구구단 출력
//		System.out.print("출력할 단을 입력 : ");
//		int dan = new Scanner(System.in).nextInt();
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//		}
		
		// for문안에 또다른 for문이 포함된 경우 : 중첩 for문(nested FOR)
		// for (int i = 0; i < 10; i++) {
		//			(A)
		//		for (int j = 0; j < 10; j++) {
		//			(B)
		// 		}
		//			(C)			
		//	}
		
		// "*"를 한줄에 10개씩 5줄 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Lotto번호 5000원으로 구매할 수 있는 Lotto번호 생성 출력
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(r.nextInt(9));
			}
			System.out.println();
		}
		
	}

}
