package sec01.exam01;

import java.util.Random;
import java.util.Scanner;

public class ExamSwitch01 {

	public static void main(String[] args) {

		// switch
		// �����ϳ��� �Է��Ͽ� �� ���� 
		// 0-59 : �ſ����
		// 60-69 : ����
		// 70-79 : ����
		// 80-89 : ���
		// 90-100 : �ſ����� ����Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("���� �Է� : ");
//		int score = sc.nextInt();
		
//		switch(score/10) {
//		case 10:
//		case 9:
//			System.out.println("�ſ���");
//			break;
//		case 8:
//			System.out.println("���");
//			break;
//		case 7: 
//			System.out.println("����");
//		case 6:
//			System.out.println("����");
//			break;
//		default:
//			System.out.println("�ſ����");
//		}
		
		// ������ �Է¹޾�
		// 0-59 : F
		// 60-69 : D
		// 70-79 : C
		// 80-89 : B
		// 90-100 : A
		// 1�� �ڸ��� 0-3 : "-"
//					4-6 : "0"
//					7-9 : "+"�� �߰�
		
//		System.out.print("���� �Է� : ");
//		int score = sc.nextInt();
//		String grade = "";
//		switch(score/10) {
//		case 10: case 9: grade = "A"; break;
//		case 8: grade = "B"; break;
//		case 7: grade = "C"; break;
//		case 6: grade = "D"; break;
//		default: grade = "F";	
//		}
//		switch(score%10) {
//		case 0: case 1: case 2: case 3:
//			if (score == 100) {
//				grade += "+";
//			} else {
//				grade += "-"; break;
//			}
//			break;
//		case 4: case 5: case 6: grade += "0"; break;
//		case 7: case 8: case 9: grade += "+"; break;
//		}
//		
//		System.out.println(score + "=>" + grade);
		
		// ��������� ����Ͻÿ�
		// ��뷮		��� �ܰ�
		//  1-10		500
		// 11-20		750
		// 21-30		1150
		// 31-40		1650
		// �� �̻�		2400
		// �ϼ��� ���� : ��� 350��
		// ���=����� + �ϼ��� ����
		// ��)27�� ���� ��ݰ��
		// 	 -10�� : 10 * 500 = 5000
		//	11-20�� : 10 * 750 = 7500
		//		7�� : 7 * 1150 = 8050
		//-------------------------------
		//						20550
		// �ϼ������ : 27 * 350 = 9450
		// -----------------------------
		//						30000
		
//		System.out.print("��뷮: ");
//		int t = sc.nextInt();
//		int m = 0;
//		switch((int)((t / 10.0) - 0.1)) {
//		case 0:
//			m = 500 * t;
//			break;
//		case 1:
//			m = (500 * 10) + (750 * (t - 10));
//			break;
//		case 2:
//			m = (1250 * 10) + (1150 * (t - 20));
//			break;
//		case 3:
//			m = (2400 * 10) + (1650 * (t - 30));
//			break;
//		default:		
//			m = (4050 * 10) + (2400 * (t - 40));
//		}
//		m += t * 350;
//		System.out.println("�ϼ��� ����� : " + m);
//		
//		int m1 = 0;
//		switch(t/10) {
//		case 0:
//			m1 = 500 * t;
//			break;
//		case 1:
//			m1 = (500 * 9) + (750 * (t - 9));
//			break;
//		case 2:
//			m1 = ((500 * 9) + (750 * 10) + (1150 * (t - 19)));
//			break;
//		case 3:
//			m1 = ((500 * 9) + (750 * 10) + (1150 * 10)) + (1650 * (t - 29));
//			break;
//		default:		
//			m1 = ((500 * 9) + (750 * 10) + (1150 * 10) + (1650 * 10) + (2400 * (t - 39)));
//		}
//		m1 += t * 350;
//		System.out.println("�ϼ��� ����� : " + m1);
		
		// 1-12�� �� �ϳ��� �Է¹޾� ������ ����Ͻÿ�. 
		System.out.print("���� �Է�(1-12) : ");
		int mon = sc.nextInt();
		
		switch(mon) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("������ 31�ϱ��� �����ϴ� ���Դϴ�.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("������ 30�ϱ��� �����ϴ� ���Դϴ�.");
			break;
		case 2:
			System.out.println("������ 29�� �Ǵ� 28�ϱ��� �����ϴ� ���Դϴ�.");
		}
		
		// ��ǰ�� �з��ڵ庰 ���η��� �ڵ� �����Ͽ� ���ϰ����� å���Ϸ��Ѵ�.
		
		
	}
}
