package sec02.exam01;

public class ExampleFor01 {

	public static void main(String[] args) {

		// 1~10������ ������ ����Ͻÿ�
		// 1~10������ ������ ���� ����Ͻÿ�
		// 1~10������ ¦���� �հ� Ȧ���� ���� ����Ͻÿ�
		int sum = 0;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + " ");
			sum += (i + 1);
			if ((i + 1) % 2 == 0) {
				even += (i + 1);
			} else {
				odd += (i + 1);
			}
		}
		System.out.println("\n��ü ��: " + sum);
		System.out.println("¦���� ��: " + even + ", Ȧ���� ��: " + odd);
	}

}
