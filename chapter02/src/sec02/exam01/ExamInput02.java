package sec02.exam01;

import java.util.Scanner;

public class ExamInput02 {

	public static void main(String[] args) {
		// Scanner: �پ��� �ڷḦ Ű����� �Է� �ް��� �ϴ� ��� ���
		// java.util ��Ű���� ����
		// next(): ���ڿ� �Է�
		// nextInt(), nextByte(), nextShort(), nextLong(): ���� �Է�
		// nextDouble, nextFloat(): �Ǽ� �Է�
		// nextLine(): �ٴ����� �Է¹޾� ���ڿ��� ����
		
		// Scanner class�� ����ϱ� ���� ����
		// 1) import java.util.Scanner
		// 2) ��ü����: Scanner ��ü�� = new Scanner(System.in);
		// 3) Ÿ�Ը� ������ = ��ü��.nextInt();
		// �ڽ��� �̸��� ���̸� Ű����� �Է� �޾� ������ �����ϰ� ����ϴ� ���α׷� �ۼ�
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("�̸��� �Է��ϼ��� : ");
//		String name = sc.nextLine();
//		System.out.print("���̸� �Է��ϼ��� : ");
//		int age = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("=================");
//		System.out.println("�̸� : " + name);
//		System.out.println("���� : " + age);
		
		// ������(�Ǽ�)�� �Է� �޾� ���ѷ��� ���� ���̸� ���Ͽ� ���
		final double PI = 3.1415926;
		System.out.print("������ : ");
		double radius = sc.nextDouble();
		
		double round = 2 * PI * radius;
		double area = PI * radius * radius;
		System.out.printf("���ѷ� : %.2f\n", round);
		System.out.printf("���� ���� : %.2f", area);
				
	}

}
