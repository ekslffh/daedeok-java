package sec02.oper;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {

		// 8��
//		int top = 5;
//		int bottom = 10;
//		int height = 7;
//		double area = (top + bottom) * height * 0.5;
//		System.out.println(area);
		
		// 9��
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ù ��° ��: ");
//		double dnum1 = Double.parseDouble(sc.next());
//		System.out.print("�� ��° ��: ");
//		double dnum2 = Double.parseDouble(sc.next());
//		System.out.println("----------------");
//		String result = "���:";
//		result += (dnum2 == 0) ? "���Ѵ�" : (dnum1 / dnum2);
//		System.out.println(result);
		
		// 10��
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("���� ����:" + var4);
		
		// 11��
//		String a = "heloo";
//		System.out.println(a.equals("heloo"));
//		int b = 3;
//		System.out.println(b > 2);
		
		float b = 3.2f;
		double da = 3.2;
		System.out.println(b == (float)da);
		
	}
}
