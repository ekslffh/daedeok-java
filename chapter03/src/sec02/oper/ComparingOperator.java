package sec02.oper;

import java.util.Scanner;

class Student {
	
}

public class ComparingOperator {

	public static void main(String[] args) {
		// �񱳿�����: ũ�⸦ ���Ͽ� true/false ���� ��ȯ
		// >, <, ==, >=, <=, !=
		// ���ǽĿ� ���
		// ��ü ������ �� : equals()���
		// ��ü�񱳽� '=='�����ڴ� �ּ� ��
		
		boolean b1 = 20 >= 15;
//		System.out.println(b1);
		// ���� �ϳ��� �����ϰ� Ű����� ������ ���� �Է� �޾�
		// �Է¹��� ���� ũ�� "�� ���� ���� �Է��ϼ���"�� ����ϰ�
		// �ٽ� ���� �Է¹޴´�. �Է� ���� ���� �� ������ 
		// "�� ū ���� �Է��ϼ���"�� ����ϰ� �ٽ� ���� �Է� �޴´�.
		// ������ ���� ���� ���� ������� ���ߴ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
//		
//		int question = 120; // ����
//		int cnt = 0; // �õ�Ƚ��
//		while (true) {
//			System.out.print("���� �ϳ��� �Է� �ϼ��� : ");
//			int ans = Integer.parseInt(sc.nextLine());
//			cnt++;
//			
//			if (question > ans) {
//				System.out.println("�� ū ���� �Է��ϼ���");
//			} else if(question < ans) {
//				System.out.println("�� ���� ���� �Է��ϼ���");
//			} else {
//				System.out.println("�����Դϴ� �õ�Ƚ�� : " + cnt);
//				break;
//			}
//		}
		
//		String str1 = new String("ȫ�浿");
//		String str2 = new String("ȫ�浿");
//		
//		System.out.println(str1 == str2); // str1�� str2�� �ּҰ��� ��
//		System.out.println(str1.equals(str2));
//		
//		Student student1 = new Student();
//		Student student2 = new Student();
//		Student student3 = student1;
//		
//		System.out.println(student1 == student2);
//		System.out.println(student1 == student3);

		int i = 10;
		double d = 10.0;
		
		System.out.println(i == d); // => true
		
		double d1 = 10.1;
		float f = 10.1f;
		
		System.out.println(d1 == f); // => false
		System.out.println((double)f);
		
		System.out.println((float)d1 == f);
		System.out.println((float)d1);
		
		
		Student student = new Student();
		System.out.println(student instanceof Student); // true
	}

}
