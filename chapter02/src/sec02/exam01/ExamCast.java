package sec02.exam01;

public class ExamCast {

	public static void main(String[] args) {
		
		int intValue = 44032;
		char ch = (char) intValue;
		System.out.println(ch);
		
		double pi = 3.141592;
		intValue = (int) pi;
		System.out.println(intValue);
		
		// ����(random number)
		System.out.println(Math.random());
		
//		0.0 <= ���� < 1.0
//		0~100 ������ ����
//		1.0 <= ����*100 + 1 < 101.0
		
		// 10 ~ 50\\ 50 ������ ����
		System.out.println((int)(Math.random()*40 + 10));
		
		int num1 = 1;
		int num2 = 2;
		
		double res = (double)num1 / num2;
		System.out.println(res);
		
//		String Ÿ���� ����ȯ
//		String Ÿ�� + any type => String type promotion
//		String str = "7";
		
		// �ش� wrapper class.parse�⺻Ÿ�Ը�(���ڿ�����)
		String s1 = "200";
		int i1 = Integer.parseInt(s1);
		System.out.println(i1 + 10);
		
		short s2 = Short.parseShort(s1);
		System.out.println(s2 - 10);
		
		String flag = "false";
		boolean value = Boolean.parseBoolean(flag);
		System.out.println(value);
		
		// �⺻Ÿ���� ���ڿ��� ��ȯ
		String str2 = s2 + "";
		String str3 = value + "";
		
		String str4 = String.valueOf(s2);
		
		String ss1 = "ȫ�浿";
		String ss2 = "ȫ�浿";
		
		// ���ͷ� Ǯ�� ���� �����ּ� �׽�Ʈ
		if (ss1 == ss2) {
			System.out.println("���� �ּҰ� ����");
		} else {
			System.out.println("���� �ּҰ� �ٸ�");
		}
		
		String ss3 = new String("����ġ");
		String ss4 = new String("����ġ");
		if (ss3 == ss4) {
			System.out.println("���� �ּҰ� ����");
		} else {
			System.out.println("���� �ּҰ� �ٸ�");
		}
		
		
		
	}

}
