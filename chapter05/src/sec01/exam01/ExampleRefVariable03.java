package sec01.exam01;

public class ExampleRefVariable03 {

	public static void main(String[] args) {
		// String class
		// �������
		// 1. ���� literal ����
		// - ���� �� �������� scan �Ͽ� ���� �ڷ��̸� �ش� �ּҸ� ����
		// - �������� Ȱ���� ȿ�����̳� ó���ӵ��� �ټ� ����
		// 2. new ������ ���
		// - new �� ���� Ƚ�� ��ŭ ���� ���� Ȯ��
		// - ó���ӵ��� ������ �����ڷ� ����� ������ ���� ������

		// ���ڿ��ڷ�� ����Ǹ� ���ʺ��� 0~n���� ������ �ο���
		// **���ڿ� Ŭ������ �ֿ� �޼���
		// equals(Object) => �����
		// charAt(int idx) => idx��ġ�� ���� ��ȯ
		// contains(charsequence ch) => ch���ڿ��� ���ԵǾ� �ִ��� ����
		// length() => ���ڿ� ���� ������ ��
		// toCharArray() => ���ڹ迭�� ��ȯ
		// toString() => �����ȯ(������)
		// valueOf() => �⺻�� �ڷḦ ���ڿ� �ڷ�� ����ȯ
		Triangle t1 = new Triangle();
		String h1 = "Hi! java.";
		String h2 = new String("Hi! java.");
		
		if (h1 == h2) { // �ּ� ��
			System.out.println("���� ������ ���");
		} else {
			System.out.println("�ٸ� ������ ���");
		}
		
		if (h1.equals(h2)) { // ����
			System.out.println("���� ������ ���ڿ�");
		} else {
			System.out.println("���� �ٸ� ���ڿ�");
		}
		
		System.out.println(h1);
		System.out.println(t1);
		
		char[] arrCh = h1.toCharArray();
		
		for (int i = 0; i < arrCh.length; i++) {
			System.out.print((char)(arrCh[i] + 1));
		}
		
		System.out.println("\n" + h1.contains("ja"));
		
		Temp temp = new Temp();
		
		// ������� h3�� ���� null�̾ null pointer exception�߻�!
		if (temp.h3.substring(0, 1).equals("1") || temp.h3.substring(0, 1).equals("3")) {
			System.out.println("����ȸ���Դϴ�.");
		} else {
			System.out.println("����ȸ���Դϴ�.");
		}
		
//		for (int i = 0; i < h1.length(); i++) {
//			System.out.println(h1.charAt(i));
//		}
		
	}

}

class Temp {
	String h3="213"; // �������
	
	public Temp() {
		int t3; // ��������
	}
}
