package sec01.exam01;

import java.util.Random;
import java.util.Scanner;

public class ExamSwitch01 {

	public static void main(String[] args) {

		// switch
		// 점수하나를 입력하여 그 값이 
		// 0-59 : 매우미흡
		// 60-69 : 미흡
		// 70-79 : 보통
		// 80-89 : 우수
		// 90-100 : 매우우수를 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("점수 입력 : ");
//		int score = sc.nextInt();
		
//		switch(score/10) {
//		case 10:
//		case 9:
//			System.out.println("매우우수");
//			break;
//		case 8:
//			System.out.println("우수");
//			break;
//		case 7: 
//			System.out.println("보통");
//		case 6:
//			System.out.println("미흡");
//			break;
//		default:
//			System.out.println("매우미흡");
//		}
		
		// 점수를 입력받아
		// 0-59 : F
		// 60-69 : D
		// 70-79 : C
		// 80-89 : B
		// 90-100 : A
		// 1의 자리가 0-3 : "-"
//					4-6 : "0"
//					7-9 : "+"를 추가
		
//		System.out.print("점수 입력 : ");
//		int score = sc.nextInt();
//		String grade = "";
//		switch(score/10) {
//		case 10: case 9: grade = "A"; break;
//		case 8: grade = "B"; break;
//		case 7: grade = "C"; break;
//		case 6: grade = "D"; break;
//		default: grade = "F";	
//		}
//		switch(score%10) {
//		case 0: case 1: case 2: case 3:
//			if (score == 100) {
//				grade += "+";
//			} else {
//				grade += "-"; break;
//			}
//			break;
//		case 4: case 5: case 6: grade += "0"; break;
//		case 7: case 8: case 9: grade += "+"; break;
//		}
//		
//		System.out.println(score + "=>" + grade);
		
		// 수도요금을 계산하시오
		// 사용량		톤당 단가
		//  1-10		500
		// 11-20		750
		// 21-30		1150
		// 31-40		1650
		// 그 이상		2400
		// 하수도 사용료 : 톤당 350원
		// 요금=사용요금 + 하수도 사용료
		// 예)27톤 사용시 요금계산
		// 	 -10톤 : 10 * 500 = 5000
		//	11-20톤 : 10 * 750 = 7500
		//		7톤 : 7 * 1150 = 8050
		//-------------------------------
		//						20550
		// 하수도요금 : 27 * 350 = 9450
		// -----------------------------
		//						30000
		
//		System.out.print("사용량: ");
//		int t = sc.nextInt();
//		int m = 0;
//		switch((int)((t / 10.0) - 0.1)) {
//		case 0:
//			m = 500 * t;
//			break;
//		case 1:
//			m = (500 * 10) + (750 * (t - 10));
//			break;
//		case 2:
//			m = (1250 * 10) + (1150 * (t - 20));
//			break;
//		case 3:
//			m = (2400 * 10) + (1650 * (t - 30));
//			break;
//		default:		
//			m = (4050 * 10) + (2400 * (t - 40));
//		}
//		m += t * 350;
//		System.out.println("하수도 요금은 : " + m);
//		
//		int m1 = 0;
//		switch(t/10) {
//		case 0:
//			m1 = 500 * t;
//			break;
//		case 1:
//			m1 = (500 * 9) + (750 * (t - 9));
//			break;
//		case 2:
//			m1 = ((500 * 9) + (750 * 10) + (1150 * (t - 19)));
//			break;
//		case 3:
//			m1 = ((500 * 9) + (750 * 10) + (1150 * 10)) + (1650 * (t - 29));
//			break;
//		default:		
//			m1 = ((500 * 9) + (750 * 10) + (1150 * 10) + (1650 * 10) + (2400 * (t - 39)));
//		}
//		m1 += t * 350;
//		System.out.println("하수도 요금은 : " + m1);
		
		// 1-12월 중 하나를 입력받아 날수를 출력하시오. 
		System.out.print("월을 입력(1-12) : ");
		int mon = sc.nextInt();
		
		switch(mon) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("말일이 31일까지 존재하는 월입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("말일이 30일까지 존재하는 날입니다.");
			break;
		case 2:
			System.out.println("말일이 29일 또는 28일까지 존재하는 월입니다.");
		}
		
		// 상품의 분류코드별 할인률을 자동 적용하여 세일가격을 책정하려한다.
		
		
	}
}
