package test;

import java.util.Scanner;

public class ExamScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[�ʼ� ���� �Է�]");
		// �Է�
		System.out.print("1. �̸�: ");
		String name = sc.nextLine();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String secretNumber = sc.nextLine();
		System.out.print("3. ��ȭ��ȣ: ");
		String phoneNumber = sc.nextLine();
		System.out.println();
		// ���
		System.out.println("[�Է��� ����]");
		System.out.println(name);
		System.out.println(secretNumber);
		System.out.println(phoneNumber);
		
//		long var = 50000000000;
		
	}

}
