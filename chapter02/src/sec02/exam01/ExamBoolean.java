package sec02.exam01;

/**
 * @author PC-20
 * boolean
 * true / false �� �ϳ� ǥ��
 * ���ǹ��� �ַ� ���
 * �ڵ� �ʱ� ���� false
 * ����ȯ�� ����� �� �� ����
 */

public class ExamBoolean {

	public static void main(String[] args) {
		
		boolean flag = false;
		int age = 25;
		
		flag = (age >= 18);
		if (flag) {
			System.out.println("�����Դϴ�!");
		} else {
			System.out.println("�̼������Դϴ�.");
		}
		
		while(flag) {
			System.out.println("������ ���̸� �ݺ����� ����˴ϴ�");
		}
		
	}

}
