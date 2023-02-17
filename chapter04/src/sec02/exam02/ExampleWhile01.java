package sec02.exam02;

import java.util.Random;
import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		// while 예제
		// 1~10까지의 합
//		int sum = 0; // 결과
//		int ins = 1; // 1,2,3,...,10까지의 숫자 생성
//		while (ins <= 10) {
//			sum += ins++;
//		}
//		System.out.println("sum = " + sum);
//	}

		// 구구단 출력
//		int i = 2; // 단
//		while (i < 10) {
//			int j = 1;
//			while (j < 10) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 1) 키보드로 1~100점 사이의 점수를 입력받아 합과 평균을 구하는
		// 프로그램을 작성하시오. 단, 0점을 입력하면 입력을 멈추고 합과 평균을 출력하시오.
		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int count = 0;
//		while (true) {
//			System.out.print("점수 입력: ");
//			int score = sc.nextInt();
//			if (score == 0) {
//				break;
//			}
//			sum += score;
//			count++;
//		}
//		if (count != 0) {
//			double avg = sum / (double)count;
//			avg = (int)(avg*10+0.5)/10.0;
//			System.out.println("합: " + sum + ", 평균: " + avg);
//		}
		
		// 2) 직업을 선택할 수 있는 메뉴화면을 구성하시오.
		//	EX) 1. 입력하기
		//		2. 수정
		//		3. 삭제
		//		4. 인쇄
		//	   99. 종료
		//	   -----------------
		// 		직업 번호 선택 :
		// 1-4, 99이외의 자료가 입력되면 "잘못된 작업번호 입니다. 다시 입력하세요"
//		// 출력 후 메뉴 출력
//		while(true) {
//			init();
//			int choice = sc.nextInt();
//			if (choice == 99) {
//				System.out.println("종료합니다.");
//				System.exit(0);
//			} else if (choice == 1) {
//				System.out.println("입력작업수행!");
//				break;
//			} else if (choice == 2) {
//				System.out.println("수정작업수행!");
//				break;
//			} else if (choice == 3) {
//				System.out.println("삭제작업수행!");
//				break;
//			} else if (choice == 4) {
//				System.out.println("인쇄작업수행!");
//				break;
//			}
//			else {
//				System.out.println("잘못된 작업번호 입니다. 다시 입력하세요");
//			}
//		}
		
		
		
		// [내일숙제]첫날에 100원, 둘째날부터는 전날에 2배씩 저축할 때 최초로 100만원을
		// 넘는 날과 그 날까지 저축한 액수를 구하시오
//		int money = 100;
//		int sum = 0;
//		int day = 0;
//		while (money <= 1000000) {
//			day++;
//			sum += money;
//			money *= 2;
//		}
//		System.out.println(day + "일동안 " + sum + "원 저축");	
		
//		int money = 100;
//		int sum = 0;
//		int day = 0;
//		while (true) {
//			day++;
//			sum += money;
//			if (money > 1000000) {
//				break;
//			} else {
//				money *= 2;
//			}
//		}
//		System.out.println("money: " + money);
//		System.out.println(day + "일동안 " + sum + "원 저축");
		
		// [내일숙제]컴퓨터와 가위바위보게임을 수행하는 프로그램을 작성하시오
		// 1-3사이의 난수를 발생시켜(1: 가위, 2: 바위, 3: 보) 저장한 후
		// 사용자로부터 1-3사이의 정수를 입력 받아 가위바위보 게임을 할 수 있는 프로그램 작성
//		Random r = new Random();
//		int computer = r.nextInt(3) + 1;
//		System.out.print("입력(1: 가위, 2: 바위, 3: 보): ");
//		int choice = sc.nextInt();
//		// 비긴 경우
//		if (choice == computer) {
//			System.out.println("Draw");
//		} else { // 지거나 이기는 경우
//			// 지는 조건 판별
//			int loose = (choice == 3) ? 1 : choice + 1;
//			if (loose == computer) {
//				System.out.println("You Loose~");
//			} else { // 이긴경우
//				System.out.println("You Win!");
//			}
//		}
		
		// [내일숙제]어느 예금계좌의 잔고(balance)를 정의하고 작업(입금(deposit), 출금(withdraw), 자액조회, 종료)의
		// 종류와 금액(입금과 출금시)을 키보드로 입력 받아 처리하는 프로그램 작성
//		int balance = 0;
//		while (true) {
//			System.out.println("=============================");
//			System.out.println(" 1.입금 2.출금 3.잔액조회 4.종료");
//			System.out.println("=============================");
//			System.out.print("작업번호 선택: ");
//			int input = sc.nextInt();
//			if (input == 1) {
//				System.out.print("입금금액: ");
//				int amount = sc.nextInt();
//				balance += amount;
//				System.out.println("입금 완료되었습니다. 현재 잔액: " + balance);
//			} else if (input == 2) {
//				System.out.print("출금금액: ");
//				int amount = sc.nextInt();
//				if (balance < amount) {
//					System.out.println("계좌 내 잔액이 부족합니다. 현재 잔액: " + balance);
//				} else {
//					balance -= amount;
//					System.out.println("출금 완료되었습니다. 현재 잔액: " + balance);
//				}
//			} else if (input == 3) {
//				System.out.println("현재 잔액은 " + balance + "원 입니다.");
//			} else if (input == 4) {
//				System.out.println("서비스를 종료합니다. 이용해주셔서 감사합니다.");
//				System.exit(0);
//			} else {
//				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
//			}
//		}
		
	}
	
	public static void init() {
		System.out.println("============================================");
		System.out.println(" 1. 입력하기, 2. 수정, 3. 삭제, 4. 인쇄, 99. 종료");
		System.out.println("============================================");
		System.out.print("작업 번호 선택 : ");
	}
	
}
