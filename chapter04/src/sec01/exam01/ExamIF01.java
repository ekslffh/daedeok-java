package sec01.exam01;

import java.util.Random;
import java.util.Scanner;

public class ExamIF01 {

	public static void main(String[] args) {
		// 정수 하나를 입력 받아 그 값이 50 이상의 수인지 판단하여
		// 50 이상이면 "you win"을 출력하시오.
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		if (num >= 50) {
//			System.out.println("you win");
//		}

		// 정수 하나를 입력 받아 그 값이 3의 배수인지를 판단하여 3의 배수이면
		// "3의 배수입니다"를 출력하시오.
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		if (num1 % 3 == 0) {
//			System.out.println("3의 배수입니다.");
//		}

//		System.out.println((num1 % 3 == 0) ? "3의 배수입니다." : "");

		// 정수 하나를 입력 받아 짝수인지 홀수인지를 판별하시오.
//		System.out.print("정수 입력 : ");
//		int num2 = sc.nextInt();
//		if (num2 % 2 == 0) {
//			System.out.println(num2 + "는 짝수입니다.");
//		} else {
//			System.out.println(num2 + "는 홀수입니다.");
//		}

		// 1. 숫자 세개를 입력받아 크기순으로 출력하시오. (오름차순)
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if (num1 < num2) {
//			System.out.println(num1 + " " + num2);
//		} else {
//			System.out.println(num2 + " " + num1);
//		}
		// 2. 어느 음료수의 개당 단가가 2000원이다. 또 10개 이상을 구입하면
		// 개당 1500원씩 판매한다고 할때 음료수의 개수를 입력 받아
		// 전체 지불 금액을 출력하시오.
//		int n = sc.nextInt();
//		if (n >= 10) {
//			System.out.println("지불하실 금액은 " + (n * 1500) + "원 입니다.");
//		} else {
//			System.out.println("지불하실 금액은 " + (n * 2000) + "원 입니다.");
//		}
		// 3. 1-50사이의 fibonacci number를 출력하시오.
		// fibonacci number는 첫 번째, 두번째 수는 1,1,로 주어지고
		// 3번째 수부터 전 두수의 합이 현재수가 되는 수열

//		int ppnum = 1;
//		int pnum = 1;
//		System.out.print(ppnum + " " + pnum + " ");
//		while (true) {
//			int cnum = ppnum + pnum;
//			if (cnum > 50) {
//				break;
//			}
//			System.out.print(cnum + " ");
//			ppnum = pnum;
//			pnum = cnum;
//		}

		// 커피자판기에서 350원 짜리 커피를 사려고 한다.
		// 5000원으로 구입 가능한 커피수와 잔돈을 출력하시오
//		int n = 5000 / 350;
//		int r = 5000 % 350;
//		System.out.println("커피: " + n + "잔, 잔돈: " + r + "원");

		// 세개의 정수를 입력받아 최대값, 최소값을 구하시오.
//		System.out.print("첫번째 수 : ");
//		int su1 = sc.nextInt();
//		System.out.print("두번째 수 : ");
//		int su2 = sc.nextInt();
//		System.out.print("세번째 수 : ");
//		int su3 = sc.nextInt();
//
//		if (su1 > su2) {
//			if (su1 > su3) {
//				System.out.println("가장 큰 수: " + su1);
//			} else {
//				System.out.println("가장 큰 수: " + su3);
//			}
//		} else {
//			if (su2 > su3) {
//				System.out.println("가장 큰 수: " + su2);
//			} else {
//				System.out.println("가장 큰 수: " + su3);
//			}
//		}
		
		// 키보드로 점수 하나를 입력받아 그 점수가 
		// 100-97 : A+
		// 96-94 : A0
		// 93-90 : A-
		// 89-87 : B+
		// 86-84 : B0
		// 83-80 : B-
		// 그 이하는 "과락"
		
//		String grade = "";
//		System.out.print("점수 입력 : ");
//		int score = sc.nextInt();
//		
//		if (score >= 90) {
//			grade = "A";
//			if (score >= 97) {
//				grade += "+";
//			} else if (score >= 94) {
//				grade += "0";
//			} else {
//				grade += "-";
//			}
//		} else if (score >= 80) {
//			grade = "B";
//			if (score >= 97) {
//				grade += "+";
//			} else if (score >= 94) {
//				grade += "0";
//			} else {
//				grade += "-";
//			}
//		} else {
//			grade = "과락";
//		}
		
//		if (score >= 97) {
//			grade = "A+";
//		} else if (score >= 94) {
//			grade = "A0";
//		} else if (score >= 90) {
//			grade = "A-";
//		} else if (score >= 87) {
//			grade = "B+";
//		} else if (score >= 84) {
//			grade = "B0";
//		} else if (score >= 80) {
//			grade = "B-";
//		} else {
//			grade = "과락";
//		}
		
//		System.out.println(score + " -→ " + grade);
		
		// 문제 : 점수를 1-100 사이의 난수를 생성하여 배정
		//		일의 자리가 0-3 이면 "-", 4-6 : "0", 7-9 : "+"를
		// 		등급에 추가
		// 		등급은 0-59 : F(F는 +, 0, -가 없다)
		// 			60-69 : D
		//			70-79 : C
		// 			80-89 : B
		// 			90-100: A
		Random random = new Random();
		int score = random.nextInt(99) + 1;
		String grade = "";
		if (score >= 90) {
			if (score == 100) {
				grade = "A+";
			}
			else {
				grade = "A";
			}
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		if ((score != 100) && ((grade != "F"))) {
			int n = score % 10;
			if (n >= 7) {
				grade += "+";
			} else if (n >= 4) {
				grade += "0";
			} else {
				grade += "-";
			}
		}
		
		System.out.println(score + " => " + grade);
	}
}
