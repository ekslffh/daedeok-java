package sec02.exam01;

/**
 * 
 * @author PC-20
 *
 * char
 * ��ȣ ���� 2byte ����(0~65535) : 2�� 16�±���
 * �� ���ڸ� ����
 * ' '�ȿ� ǥ��
 */

public class ExamChar {
	static char ch;
	public static void main(String[] args) {
		char c1 = ' ';
		c1 = 'a';
		short s = 100;
		byte b = 100;
		char c2 = '��';
//		char c3 = s; // charŸ���� ����ǥ���� �Ұ���
//		char c4 = b;
		System.out.println("c1=" + c1);
		System.out.println("c1=" + (char)(c1 + 5));
		System.out.println((int)c2);
	}

}
