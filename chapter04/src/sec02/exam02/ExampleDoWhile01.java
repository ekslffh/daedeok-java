package sec02.exam02;

public class ExampleDoWhile01 {

	public static void main(String[] args) {

		// 50��, 100��, 500�� �������� 2300���� ����� ����� ����
		// ����Ͻÿ�. ��, ��� ������ ������ �ϳ� �̻� ����� ��
		
		int b1 = 1; // 500��
		int c1 = 1; // 100��
		int d1 = 1; // 50��
		
		System.out.println("500�� 100�� 50��");
		System.out.println("=================");
		do {
			c1 = 1;
			do {
				d1 = 1;
				do {
					if ((d1 * 50 + c1 * 100 + b1 * 500) == 2300) {
						System.out.printf("%5d %5d %5d%n", b1, c1, d1);
						break;
					}
					d1++;
				} while (d1 < 35);
				c1++;
			} while (c1 < 18);
			b1++;
		} while (b1 < 5);
		
	}

}
