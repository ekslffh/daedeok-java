package sec02.exam02;

import java.util.Random;
import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		// while ����
		// 1~10������ ��
//		int sum = 0; // ���
//		int ins = 1; // 1,2,3,...,10������ ���� ����
//		while (ins <= 10) {
//			sum += ins++;
//		}
//		System.out.println("sum = " + sum);
//	}

		// ������ ���
//		int i = 2; // ��
//		while (i < 10) {
//			int j = 1;
//			while (j < 10) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 1) Ű����� 1~100�� ������ ������ �Է¹޾� �հ� ����� ���ϴ�
		// ���α׷��� �ۼ��Ͻÿ�. ��, 0���� �Է��ϸ� �Է��� ���߰� �հ� ����� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int count = 0;
//		while (true) {
//			System.out.print("���� �Է�: ");
//			int score = sc.nextInt();
//			if (score == 0) {
//				break;
//			}
//			sum += score;
//			count++;
//		}
//		if (count != 0) {
//			double avg = sum / (double)count;
//			avg = (int)(avg*10+0.5)/10.0;
//			System.out.println("��: " + sum + ", ���: " + avg);
//		}
		
		// 2) ������ ������ �� �ִ� �޴�ȭ���� �����Ͻÿ�.
		//	EX) 1. �Է��ϱ�
		//		2. ����
		//		3. ����
		//		4. �μ�
		//	   99. ����
		//	   -----------------
		// 		���� ��ȣ ���� :
		// 1-4, 99�̿��� �ڷᰡ �ԷµǸ� "�߸��� �۾���ȣ �Դϴ�. �ٽ� �Է��ϼ���"
//		// ��� �� �޴� ���
//		while(true) {
//			init();
//			int choice = sc.nextInt();
//			if (choice == 99) {
//				System.out.println("�����մϴ�.");
//				System.exit(0);
//			} else if (choice == 1) {
//				System.out.println("�Է��۾�����!");
//				break;
//			} else if (choice == 2) {
//				System.out.println("�����۾�����!");
//				break;
//			} else if (choice == 3) {
//				System.out.println("�����۾�����!");
//				break;
//			} else if (choice == 4) {
//				System.out.println("�μ��۾�����!");
//				break;
//			}
//			else {
//				System.out.println("�߸��� �۾���ȣ �Դϴ�. �ٽ� �Է��ϼ���");
//			}
//		}
		
		
		
		// [���ϼ���]ù���� 100��, ��°�����ʹ� ������ 2�辿 ������ �� ���ʷ� 100������
		// �Ѵ� ���� �� ������ ������ �׼��� ���Ͻÿ�
//		int money = 100;
//		int sum = 0;
//		int day = 0;
//		while (money <= 1000000) {
//			day++;
//			sum += money;
//			money *= 2;
//		}
//		System.out.println(day + "�ϵ��� " + sum + "�� ����");	
		
//		int money = 100;
//		int sum = 0;
//		int day = 0;
//		while (true) {
//			day++;
//			sum += money;
//			if (money > 1000000) {
//				break;
//			} else {
//				money *= 2;
//			}
//		}
//		System.out.println("money: " + money);
//		System.out.println(day + "�ϵ��� " + sum + "�� ����");
		
		// [���ϼ���]��ǻ�Ϳ� ���������������� �����ϴ� ���α׷��� �ۼ��Ͻÿ�
		// 1-3������ ������ �߻�����(1: ����, 2: ����, 3: ��) ������ ��
		// ����ڷκ��� 1-3������ ������ �Է� �޾� ���������� ������ �� �� �ִ� ���α׷� �ۼ�
//		Random r = new Random();
//		int computer = r.nextInt(3) + 1;
//		System.out.print("�Է�(1: ����, 2: ����, 3: ��): ");
//		int choice = sc.nextInt();
//		// ��� ���
//		if (choice == computer) {
//			System.out.println("Draw");
//		} else { // ���ų� �̱�� ���
//			// ���� ���� �Ǻ�
//			int loose = (choice == 3) ? 1 : choice + 1;
//			if (loose == computer) {
//				System.out.println("You Loose~");
//			} else { // �̱���
//				System.out.println("You Win!");
//			}
//		}
		
		// [���ϼ���]��� ���ݰ����� �ܰ�(balance)�� �����ϰ� �۾�(�Ա�(deposit), ���(withdraw), �ھ���ȸ, ����)��
		// ������ �ݾ�(�Աݰ� ��ݽ�)�� Ű����� �Է� �޾� ó���ϴ� ���α׷� �ۼ�
//		int balance = 0;
//		while (true) {
//			System.out.println("=============================");
//			System.out.println(" 1.�Ա� 2.��� 3.�ܾ���ȸ 4.����");
//			System.out.println("=============================");
//			System.out.print("�۾���ȣ ����: ");
//			int input = sc.nextInt();
//			if (input == 1) {
//				System.out.print("�Աݱݾ�: ");
//				int amount = sc.nextInt();
//				balance += amount;
//				System.out.println("�Ա� �Ϸ�Ǿ����ϴ�. ���� �ܾ�: " + balance);
//			} else if (input == 2) {
//				System.out.print("��ݱݾ�: ");
//				int amount = sc.nextInt();
//				if (balance < amount) {
//					System.out.println("���� �� �ܾ��� �����մϴ�. ���� �ܾ�: " + balance);
//				} else {
//					balance -= amount;
//					System.out.println("��� �Ϸ�Ǿ����ϴ�. ���� �ܾ�: " + balance);
//				}
//			} else if (input == 3) {
//				System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�.");
//			} else if (input == 4) {
//				System.out.println("���񽺸� �����մϴ�. �̿����ּż� �����մϴ�.");
//				System.exit(0);
//			} else {
//				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
//			}
//		}
		
	}
	
	public static void init() {
		System.out.println("============================================");
		System.out.println(" 1. �Է��ϱ�, 2. ����, 3. ����, 4. �μ�, 99. ����");
		System.out.println("============================================");
		System.out.print("�۾� ��ȣ ���� : ");
	}
	
}
