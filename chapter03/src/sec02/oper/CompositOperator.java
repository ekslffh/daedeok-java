package sec02.oper;

import java.util.Random;
import java.util.Scanner;

public class CompositOperator {

	public static void main(String[] args) {
		// ���տ���(+=, -=. %=, /=, *=): ������ ����Ǿ� �ִ� ���� ������ ������ ������ �� ���
		// ���Կ�����(=�� ������ �����ڸ� ����
		// int i = 10; i = i * 5 => i *= 5, i=i/(j*2) => i /= (j * 2)
		// i = j * 3 (X)

		// Ű����� ���� 5���� �Է¹޾� ��� ���� ���� ���
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		for (int i = 0; i < 5; i++) {
//			System.out.print((i + 1) + "��° ���� : ");
//			int num = Integer.parseInt(sc.nextLine());
//			sum += num; // sum = sum + num;
//		}
//
//		System.out.println("��� : " + sum);
		
		// �ݿø��ϱ�� ���� �����
		// �ݿø� : Math.round(�Ǽ�) ���
		// �ڸ����� : Math.floor(�Ǽ�)
		// �ø� : Math.ceil(�Ǽ�)
		
//		double pi = 3.5415;
//		System.out.println(Math.round(pi));
		
		
//		r *= 10;
//		r = Math.round(r);
//		r /= 10;
//		System.out.println(r);
		// r�� �Ҽ��� 2°�ڸ����� �ݿø��Ͻÿ�
//		double r = 23.65803;
//		System.out.println(Math.round(r * 10) / 10.0);
		// r�� �Ҽ��� 3°�ڸ����� �ݿø��Ͻÿ�
//		double res = (int)(r*100+0.5)/100.0;
		
		// ����(random number)
		// 1) Math.random() �̿�
		// 0.0 <= ���� < 1.0 �� �Ǽ��� ���� ��ȯ
		// 0 ~ 100������ ����
		// 0.0*100 <= Math.random()*100 < 1.0*101
		// (int)(0.0*101) <= (int)Math.random()<(int)(1.0*101)
		// 0 <= (int)Math.random()*100+1 < 101
		
		/*
		int rnd = (int)(Math.random()*100+1);
//		System.out.println(rnd);
		// 2) Random class �̿�(java.util��Ű���� class)
		Random r1 = new Random();
		// r1.nextInt(): ������ ����
		// r1.nextInt(n): 0 ~ (n-1) ������ ������ ����
		System.out.println((r1.nextInt(46))); // 0 ~ 45
		System.out.println(r1.nextInt(45) + 1); // 1 ~ 45
		// 10 ~ 50 ������ ����
		System.out.println(r1.nextInt(41) + 10);
		// r.nextInt(���Ѱ� - ���Ѱ� + 1) + ���Ѱ�
		*/
		
		Random r = new Random();
//		String word = "script";
//		char[] ch = word.toCharArray();
//				
//		for (int i = 0; i <= 100000; i++) {
//			int rnd = r.nextInt(word.length());
//			char t = ch[0];
//			ch[0] = ch[rnd];
//			ch[rnd] = t;
//		}
//		
//		String question = new String(ch);
//		
//		System.out.println(question);
		
		// �ֻ����� 100���� ���� ���� �� ���� ���� �����Ͻÿ�
		int[] dice = new int[6];
		for (int i = 0; i < 1000000; i++) {
			dice[r.nextInt(6)]++;
		}
		for (int i = 0; i < dice.length; i++) {
			System.out.println((i + 1) + " ���� ��: " + dice[i]);
		}
		
	}

}
