package sec01.exam01;

import java.util.Random;
import java.util.Scanner;

public class ExamIF01 {

	public static void main(String[] args) {
		// ���� �ϳ��� �Է� �޾� �� ���� 50 �̻��� ������ �Ǵ��Ͽ�
		// 50 �̻��̸� "you win"�� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int num = sc.nextInt();
//		
//		if (num >= 50) {
//			System.out.println("you win");
//		}

		// ���� �ϳ��� �Է� �޾� �� ���� 3�� ��������� �Ǵ��Ͽ� 3�� ����̸�
		// "3�� ����Դϴ�"�� ����Ͻÿ�.
//		System.out.print("���� �Է� : ");
//		int num1 = sc.nextInt();
//		if (num1 % 3 == 0) {
//			System.out.println("3�� ����Դϴ�.");
//		}

//		System.out.println((num1 % 3 == 0) ? "3�� ����Դϴ�." : "");

		// ���� �ϳ��� �Է� �޾� ¦������ Ȧ�������� �Ǻ��Ͻÿ�.
//		System.out.print("���� �Է� : ");
//		int num2 = sc.nextInt();
//		if (num2 % 2 == 0) {
//			System.out.println(num2 + "�� ¦���Դϴ�.");
//		} else {
//			System.out.println(num2 + "�� Ȧ���Դϴ�.");
//		}

		// 1. ���� ������ �Է¹޾� ũ������� ����Ͻÿ�. (��������)
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if (num1 < num2) {
//			System.out.println(num1 + " " + num2);
//		} else {
//			System.out.println(num2 + " " + num1);
//		}
		// 2. ��� ������� ���� �ܰ��� 2000���̴�. �� 10�� �̻��� �����ϸ�
		// ���� 1500���� �Ǹ��Ѵٰ� �Ҷ� ������� ������ �Է� �޾�
		// ��ü ���� �ݾ��� ����Ͻÿ�.
//		int n = sc.nextInt();
//		if (n >= 10) {
//			System.out.println("�����Ͻ� �ݾ��� " + (n * 1500) + "�� �Դϴ�.");
//		} else {
//			System.out.println("�����Ͻ� �ݾ��� " + (n * 2000) + "�� �Դϴ�.");
//		}
		// 3. 1-50������ fibonacci number�� ����Ͻÿ�.
		// fibonacci number�� ù ��°, �ι�° ���� 1,1,�� �־�����
		// 3��° ������ �� �μ��� ���� ������� �Ǵ� ����

//		int ppnum = 1;
//		int pnum = 1;
//		System.out.print(ppnum + " " + pnum + " ");
//		while (true) {
//			int cnum = ppnum + pnum;
//			if (cnum > 50) {
//				break;
//			}
//			System.out.print(cnum + " ");
//			ppnum = pnum;
//			pnum = cnum;
//		}

		// Ŀ�����Ǳ⿡�� 350�� ¥�� Ŀ�Ǹ� ����� �Ѵ�.
		// 5000������ ���� ������ Ŀ�Ǽ��� �ܵ��� ����Ͻÿ�
//		int n = 5000 / 350;
//		int r = 5000 % 350;
//		System.out.println("Ŀ��: " + n + "��, �ܵ�: " + r + "��");

		// ������ ������ �Է¹޾� �ִ밪, �ּҰ��� ���Ͻÿ�.
//		System.out.print("ù��° �� : ");
//		int su1 = sc.nextInt();
//		System.out.print("�ι�° �� : ");
//		int su2 = sc.nextInt();
//		System.out.print("����° �� : ");
//		int su3 = sc.nextInt();
//
//		if (su1 > su2) {
//			if (su1 > su3) {
//				System.out.println("���� ū ��: " + su1);
//			} else {
//				System.out.println("���� ū ��: " + su3);
//			}
//		} else {
//			if (su2 > su3) {
//				System.out.println("���� ū ��: " + su2);
//			} else {
//				System.out.println("���� ū ��: " + su3);
//			}
//		}
		
		// Ű����� ���� �ϳ��� �Է¹޾� �� ������ 
		// 100-97 : A+
		// 96-94 : A0
		// 93-90 : A-
		// 89-87 : B+
		// 86-84 : B0
		// 83-80 : B-
		// �� ���ϴ� "����"
		
//		String grade = "";
//		System.out.print("���� �Է� : ");
//		int score = sc.nextInt();
//		
//		if (score >= 90) {
//			grade = "A";
//			if (score >= 97) {
//				grade += "+";
//			} else if (score >= 94) {
//				grade += "0";
//			} else {
//				grade += "-";
//			}
//		} else if (score >= 80) {
//			grade = "B";
//			if (score >= 97) {
//				grade += "+";
//			} else if (score >= 94) {
//				grade += "0";
//			} else {
//				grade += "-";
//			}
//		} else {
//			grade = "����";
//		}
		
//		if (score >= 97) {
//			grade = "A+";
//		} else if (score >= 94) {
//			grade = "A0";
//		} else if (score >= 90) {
//			grade = "A-";
//		} else if (score >= 87) {
//			grade = "B+";
//		} else if (score >= 84) {
//			grade = "B0";
//		} else if (score >= 80) {
//			grade = "B-";
//		} else {
//			grade = "����";
//		}
		
//		System.out.println(score + " -�� " + grade);
		
		// ���� : ������ 1-100 ������ ������ �����Ͽ� ����
		//		���� �ڸ��� 0-3 �̸� "-", 4-6 : "0", 7-9 : "+"��
		// 		��޿� �߰�
		// 		����� 0-59 : F(F�� +, 0, -�� ����)
		// 			60-69 : D
		//			70-79 : C
		// 			80-89 : B
		// 			90-100: A
		Random random = new Random();
		int score = random.nextInt(99) + 1;
		String grade = "";
		if (score >= 90) {
			if (score == 100) {
				grade = "A+";
			}
			else {
				grade = "A";
			}
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		if ((score != 100) && ((grade != "F"))) {
			int n = score % 10;
			if (n >= 7) {
				grade += "+";
			} else if (n >= 4) {
				grade += "0";
			} else {
				grade += "-";
			}
		}
		
		System.out.println(score + " => " + grade);
	}
}
