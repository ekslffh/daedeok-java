package sec02.oper;

import java.io.IOException;
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) throws IOException {
		// ��������(AND, OR) : �������� ����(���ǽ�: ���迬����)�� ����, ���� ����
		// ������������(NOT) : ���׿����ڷ� ���(toggle) ���
		// -------------------------------
		// �Է� ���
		// -------------------------------
		// A B AND OR EX-OR
		// 0 0 0 0 0
		// 0 1 0 1 1
		// 1 0 0 1 1
		// 1 1 1 1 0

//		int ch1 = System.in.read();
//		if ((ch1 >= 65) && (ch1 <= 90)) {
//			System.out.println("�빮���Է�");
//		} else if ((ch1 >= 97) && (ch1 <= 122)) {
//			System.out.println("�ҹ����Է�");
//		} else if ((ch1 >= 48) && (ch1 <= 57)) {
//			System.out.println("���� �Է�");
//		}
		
		// �� ���ڸ� �Է� �޾� �빮�ڸ� �ҹ��ڷ�, �ҹ��ڸ� �빮�ڷ� ����Ͻÿ�.
//		int ch2 = System.in.read();
//		if ((ch2 >= 65) && (ch2 <= 90)) {
//			System.out.println((char)(ch2 + 32));
//		} else if ((ch2 >= 97) && (ch2 <= 122)) {
//			System.out.println((char)(ch2 - 32));
//		}
		
		// �� �ڸ� ���� 2���� �Է¹޾� ���� ���� ����Ͻÿ�.
//		int ch3 = System.in.read() - 48;
////		System.in.skip(2);
//		System.in.read(); // CR
//		System.in.read(); // LF
//		int ch4 = System.in.read() - 48;
//		System.out.println(ch3 + ch4);
		
		Scanner sc = new Scanner(System.in);
		
		// [����]Ű����� ������ ������ �Է� �޾� �� ���� ¦������ Ȧ�������� �Ǻ��Ͻÿ�.
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		// [����]Ű����� �Է� ���� ���ڿ��� ������ �����ͺ��̽� ����id�� ������
		// �ι�° ���ڿ��� �Է� �ް� �� ���� �ڽ��� DB���� ��ȣ�� ������
		// "�ݰ����ϴ�. ���������� Login �߽��ϴ�."�� ����ϰ� 
		// ����id�� Ʋ���� "����� ������ �����ϴ�"��
		// ��ȣ�� Ʋ���� "�߸��� ��ȣ�Դϴ�"�� ����ϴ� ���α׷� �ۼ�
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		if (id.equals("pc20")) {
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			if (password.equals("java")) {
				System.out.println("�ݰ����ϴ�. ���������� Login �߽��ϴ�.");
			} else {
				System.out.println("�߸��� ��ȣ�Դϴ�.");
			}
		} else {
			System.out.println("����� ������ �����ϴ�.");
		}
		
	}

}
