package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class ExampleFor2 {

	public static void main(String[] args) {

		// ������ ���
		// Ű����� ����� ���� �Է� �޾� �ش� ������ ���
//		System.out.print("����� ���� �Է� : ");
//		int dan = new Scanner(System.in).nextInt();
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//		}
		
		// for���ȿ� �Ǵٸ� for���� ���Ե� ��� : ��ø for��(nested FOR)
		// for (int i = 0; i < 10; i++) {
		//			(A)
		//		for (int j = 0; j < 10; j++) {
		//			(B)
		// 		}
		//			(C)			
		//	}
		
		// "*"�� ���ٿ� 10���� 5�� ���
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Lotto��ȣ 5000������ ������ �� �ִ� Lotto��ȣ ���� ���
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(r.nextInt(9));
			}
			System.out.println();
		}
		
	}

}
