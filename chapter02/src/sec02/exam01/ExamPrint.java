package sec02.exam01;

public class ExamPrint {

	public static void main(String[] args) {

		System.out.print("ȫ�浿");
		System.out.print("34061");
		System.out.println("������ �߱� ���� 846");
		System.out.println();
		System.out.print("ȫ���");
		System.out.print("34061");
		System.out.println("������ �߱� ���� 846");

		// System.out.printf("�����������ڿ�", ����list)
		// "�����������ڿ�"
		// "%[[-|0]n]d" : 10�� ����
		// - : ��������
		// 0 : ���� ���� ������� 0 ä��
//		System.out.printf("%d, %5d, %-5d, %05d", 1000, 1000, 1000, 1000);
		System.out.printf("%d\n", 1000);
		System.out.printf("%8d\n", 1000);
		System.out.printf("%-8d\n", 1000);
		System.out.printf("%08d\n", 1000);

		// "%[[-|0]n].pf" : 10�� �Ǽ�
		// n : ��ü�ڸ��� (�Ҽ��� ����)
		// p : �Ҽ��� ������ �ڸ���
		// n-p-1 : �����κ� �ڸ���

		System.out.println("123456789 + 12345");
		System.out.printf("%8.2f \n", 234.5678); // �ݿø�
		System.out.printf("%-8.2f \n", 5678234.5678);
		System.out.printf("%08.2f \n", 5678234.5678);

		// "%[[-|0]n]s" : ���ڿ� ���
		System.out.println("123456789 + 12345");
		System.out.printf("%s \n", "������");
		System.out.printf("%15s \n", "������");
		System.out.printf("%-15s \n", "������");

	}

}
