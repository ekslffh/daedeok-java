package sec02.exam01;

/**
 * @author PC-20
 * String
 * class Ÿ��
 * ���ڿ��� ����(""�ȿ� ������ ������)
 * ���ڿ��� ������ ����ü�� �� ���ڰ� ��ġ�� ��ġ���� ������ ����
 * �ٸ� Ÿ���� �ڷ�� ����ɶ� �ٸ� Ÿ���� �ڷᰡ ���ڿ��� ����ȯ �� ���� ����
 */

public class ExamString {

	public static void main(String[] args) {

		String name = "ȫ�浿";
		String job = "���α׷���";
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + job);
		
//		\t : tabŰ�� ���
		System.out.println(name + "\t" + job);
		
//		\n : (���๮��)�ٹٲ�
		System.out.println("\n" + name + "\n\n\n\n\n" + job);
		
//		\r : return Ű
		System.out.println(name + "\r" + job);
		
//		\" : "���
		System.out.println(name + "\"" + job + "\"");
		
		
	}

}
