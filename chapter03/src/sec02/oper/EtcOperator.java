package sec02.oper;

import java.util.Scanner;

public class EtcOperator {

	public static void main(String[] args) {
		// ���׿�����
		// -�Ϻ� if���� ����� �� ����(ȿ������ ���)
		// (���ǽ�) ? ��ɹ�1 : ��ɹ�2
		// -���ǽ��� ���Ͽ� ���̸� ��ɹ�1�� �����ϰ� �����̸� ��ɹ�2�� ����

//		Scanner sc = new Scanner(System.in);
//		System.out.print("�ֹι�ȣ ���ڸ� ���ڸ� �Է� : ");
//		int regno2 = sc.nextInt();
//		String gender = (regno2 == 1 || regno2 == 3) ? "����" : "����";
//		System.out.println(gender);

		// Ű����� 0-100������ �����ϳ��� �Է��Ͽ�
		// 1-59 : F
		// 60-69 : D
		// 70-79 : C
		// 80-89 : B
		// 90 �̻� : A�� ����Ͻÿ�
//		System.out.print("���� �Է�(0-100) : ");
//		int score = sc.nextInt();
//		char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
//
//		System.out.println(score + " => " + grade);
		
		// ��Ʈ ������
		// &, |, ^, ~
		// - ��Ʈ���� ���� ��ġ�� �����ϴ� 2������ ���� ����
		// 1) & : ��Ʈ�� and ����
		// 2) | : ��Ʈ�� or ����
		// 3) ^ : ��Ʈ�� ex-or ����
		// 4) ~ : 1�� ���� ����
		
		int num1 = 10;
		int num2 = 6;
		
		System.out.println("num1 & num2 = " + (num1 & num2));
		// 10 : 1010
		//  6 : 0110
		//-----------
		//		0010 => 2
		System.out.println("num1 | num2 = " + (num1 | num2));
		// 10 : 1010
		//  6 : 0110
		//-----------
		//		1110 => 14
		System.out.println("num1 ^ num2 = " + (num1 ^ num2));
		// 10 : 1010
		//  6 : 0110
		//-----------
		//		1100 => 12
		System.out.println("~num1 = " + (~num1));
		
		// shift operator
		// >>, <<, >>>
		// ���� >> ���� => '����'�� ������ŭ ���������� �����̵�( �̵� ��
		// �߻��Ǵ� �������� ������� ��ȣ�� Ȯ��Ǿ� padding
		// => '����'�� 2^(����)�� ���� ���� ��
		System.out.println("12>>2 : " + (12 >> 2));
		System.out.println("12<<2 : " + (12 << 2));
		System.out.println("-12>>>2 : " + (-12 >>> 2));
		
		byte temp = 10;
		System.out.println(~temp);
		
	}

}
