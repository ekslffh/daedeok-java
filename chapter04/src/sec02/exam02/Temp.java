package sec02.exam02;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {

		// ���� 4-2��
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println("1-100���̿� 3�� ����� ������ " + sum);
		
		// ���� 4-3��
//		while (true) {
//			int dice1 = (int)(Math.random() * 6) + 1;
//			int dice2 = (int)(Math.random() * 6) + 1;
//			System.out.println("(" + dice1 + "," + dice2 + ")");
//			if ((dice1 + dice2) == 5) {
//				break;
//			}
//		}
		
		// ���� 4-4��
//		for (int x = 1; x <= ((60 - 5) / 4); x++) {
//			for (int y = 1; y <= ((60 - 4) / 5); y++) {
//				if ((4 * x + 5 * y) == 60) {
//					System.out.println("(" + x + "," + y + ")");
//					break;
//				}
//			}
//		}
		
		// ���� 4-5��
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < (i + 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// ���� 4-6��
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < (3 - i); j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < (i + 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// ���� 4-7��
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		int balacne = 0;
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.print("���ݾ�>");
				balacne += scanner.nextInt();
				break;
			case 2:
				System.out.print("��ݾ�>");
				balacne -= scanner.nextInt();
				break;
			case 3:
				System.out.print("�ܰ�>" + balacne);
				break;
			case 4:
				System.out.print("\n���α׷� ����");
				run = false;
			}
			System.out.println();
		}
		
	}

}
