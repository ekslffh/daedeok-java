package homework3_2;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {

		// Ű����� ���� 2���� �Է¹޾� 4Ģ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1: ");
		int a = sc.nextInt(); 
		System.out.print("����2: ");
		int b = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		
		sc.close();
		
	}

}
