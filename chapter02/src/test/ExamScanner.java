package test;

import java.util.Scanner;

public class ExamScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		// 입력
		System.out.print("1. 이름: ");
		String name = sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String secretNumber = sc.nextLine();
		System.out.print("3. 전화번호: ");
		String phoneNumber = sc.nextLine();
		System.out.println();
		// 출력
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(secretNumber);
		System.out.println(phoneNumber);
		
//		long var = 50000000000;
		
	}

}
