package sec01.exam01;

/**
 * 1. ���� : ������ �̸� - �⺻�� : ���� �ڷ� byte,short,int,long, float,double,char,boolean
 * - ������ : �ּ� (classŸ��,�迭,������) - ������ ��� . ���� : ������ Ÿ�԰� ������ ���� (���� ����) Ÿ�Ը� ������;
 * ex) int num; int age; int height;
 * 
 * int num, age, height; char ch; double dnum;
 * 
 * ExamVar01 ex01; int[] num; enum . ������ : ù ���ڴ� ������, $, _ �� �ϳ� �ι�° ���ڴ� ������, ����,
 * $, _ ���ҹ��ڸ� ����ϰ� �� �ܾ� �̻� ���ս� �ܾ� ���۱��ڸ� �빮�� (camelCase) taxRate, korScore
 * �����(��ɹ�)�� ��� ���� . ������ ������ġ�� ���� �������-class ���� method ���� �������� ����� ���� -����ڰ� �ʱ�ȭ
 * ���� ������ �ڵ��ʱ�ȭ ��������-�޼��� ����, { }�ȿ� ����� ����: �ʱ�ȭ X -> ���� �ʱ�ȭ �ؾ��Ѵ�. . �ʱ�ȭ ������=��; --
 * ������ ����� �� Ÿ�Ը� ������ = ��; ��������� �ʱ�ȭ�� ����
 */ 

public class ExamVar01 {
	public static void main(String[] args) {
		VarSample1 vs1 = new VarSample1();
		System.out.println("��� = " + vs1.myMethod());
		System.out.println("������� num �� = " + (vs1.num + 20));
	}
}

class VarSample1 {
	// �������
	long num = 200L;

	public int myMethod() {
		// ��������
		int num1 = 100;
		long res1 = this.num + 10;
		int res2 = num1 + 10;
		if (num > 0) {
			int sum = 0; 
			return (int) num;
		} else {
			return res2;
		}
	}
	
}
