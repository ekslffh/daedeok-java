package sec02.oper;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// ���������
		// ���׿�����-��ȣ������(+,-), ����������(++,--)
		// ���׿�����-��Ģ������(+,-,*,/,%)
		// ��ȣ������ : ���(plus)�� ���� ����
		short sh = 100;

		short res1 = (short) -sh;
		int res2 = -sh; // -������ �Ͼ sh�� int�� promotion

		// ���� ����-> ++����(prefix), ����++(postfix)

		int i = 10;
		int j = 10;
		// i++ => 11, ++i => 11
		// int r1 = i++; r1�� i���� ������ �� i���� 1����
		// (r1=10, i=11)
		// int r2 = ++i; i���� 1 ������Ų �� �� ����� r2�� ����
		// (r2=11, j=11)
		i++;
		++j;

		System.out.println("i++ : " + i);
		System.out.println("++j : " + j);

		System.out.println(i++);

		int r1 = i++;
		int r2 = ++j;
		System.out.println("i = " + i + ", r1 : " + r1);
		System.out.println("j = " + j + ", r2 : " + r2);

		int[] arr = new int[10];

		for (int idx = 0;; idx++) {
			if (idx >= 10) {
				break;
			} else {
				arr[idx++] = idx * 100;
			}
		}
		
		// ��Ģ������ : +,-,/,*,%
		// 1-100������ ¦���հ� Ȧ������ ���Ͻÿ�
		int even = 0;
		int odd = 0;
		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				even = even + num;
			} else {
				odd = odd + num;
			}
		}
		
		System.out.println("¦���� �� = " + even);
		System.out.println("Ȧ���� �� = " + odd);
		
		int su1 = 10;
		int su2 = 5;
		
		System.out.println("���� : " + (su1 + su2));
		System.out.println("���� : " + (su1 - su2));
		System.out.println("���� : " + (su1 * su2));
		System.out.println("������ : " + (su2 / (double)su1));

	}

}
