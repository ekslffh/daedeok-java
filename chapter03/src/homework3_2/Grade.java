package homework3_2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		// ����, ����, ���� ������ �̸��� �Է� �޾� ������ ����� ���Ͽ� ����Ͻÿ�. ��, ����� �Ҽ���1�ڸ����� ����ϰ� 3�� ó���Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("��������: ");
			int korean = sc.nextInt();
			System.out.print("��������: ");
			int english = sc.nextInt();
			System.out.print("��������: ");
			int math = sc.nextInt();
			int sum = (korean + english + math) / 3;
			double average = sum / 3.0;
			System.out.printf("%s�� ������ %d���̰� ����� %.1f���Դϴ�.\n", name, sum, average);
		}
		
		sc.close();
		
	}

}
