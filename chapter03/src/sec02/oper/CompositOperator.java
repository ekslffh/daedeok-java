package sec02.oper;

import java.util.Random;
import java.util.Scanner;

public class CompositOperator {

	public static void main(String[] args) {
		// 복합연산(+=, -=. %=, /=, *=): 변수에 저장되어 있는 값에 별도의 연산을 수행할 때 사용
		// 대입연산자(=과 수행할 연산자를 결합
		// int i = 10; i = i * 5 => i *= 5, i=i/(j*2) => i /= (j * 2)
		// i = j * 3 (X)

		// 키보드로 정수 5개를 입력받아 모두 더한 값을 출력
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		for (int i = 0; i < 5; i++) {
//			System.out.print((i + 1) + "번째 숫자 : ");
//			int num = Integer.parseInt(sc.nextLine());
//			sum += num; // sum = sum + num;
//		}
//
//		System.out.println("결과 : " + sum);
		
		// 반올림하기와 난수 만들기
		// 반올림 : Math.round(실수) 사용
		// 자리버림 : Math.floor(실수)
		// 올림 : Math.ceil(실수)
		
//		double pi = 3.5415;
//		System.out.println(Math.round(pi));
		
		
//		r *= 10;
//		r = Math.round(r);
//		r /= 10;
//		System.out.println(r);
		// r을 소수점 2째자리에서 반올림하시오
//		double r = 23.65803;
//		System.out.println(Math.round(r * 10) / 10.0);
		// r을 소수점 3째자리에서 반올림하시오
//		double res = (int)(r*100+0.5)/100.0;
		
		// 난수(random number)
		// 1) Math.random() 이용
		// 0.0 <= 난수 < 1.0 의 실수형 난수 반환
		// 0 ~ 100사이의 난수
		// 0.0*100 <= Math.random()*100 < 1.0*101
		// (int)(0.0*101) <= (int)Math.random()<(int)(1.0*101)
		// 0 <= (int)Math.random()*100+1 < 101
		
		/*
		int rnd = (int)(Math.random()*100+1);
//		System.out.println(rnd);
		// 2) Random class 이용(java.util패키지의 class)
		Random r1 = new Random();
		// r1.nextInt(): 정수형 난수
		// r1.nextInt(n): 0 ~ (n-1) 사이의 정수형 난수
		System.out.println((r1.nextInt(46))); // 0 ~ 45
		System.out.println(r1.nextInt(45) + 1); // 1 ~ 45
		// 10 ~ 50 사이의 난수
		System.out.println(r1.nextInt(41) + 10);
		// r.nextInt(상한값 - 하한값 + 1) + 하한값
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
		
		// 주사위를 100만번 던져 나온 각 눈의 수를 조사하시오
		int[] dice = new int[6];
		for (int i = 0; i < 1000000; i++) {
			dice[r.nextInt(6)]++;
		}
		for (int i = 0; i < dice.length; i++) {
			System.out.println((i + 1) + " 눈의 수: " + dice[i]);
		}
		
	}

}
