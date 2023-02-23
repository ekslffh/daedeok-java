package sec02.exam01;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// 아이디와 패스워드 입력 후 Customer의 아이디와
		// 패스워드를 비교하여 모두 일치하면 "로그인 성공"
		// 하나라도 불일치하면 "로그인 실패" 출력
		Scanner sc = new Scanner(System.in);
		InputData d = new InputData();
		System.out.print("아이디 : ");
		String ID = sc.nextLine();
		
		System.out.print("암 호 : ");
		String passWd = sc.nextLine();
		
		for (int i = 0; i < d.customer.length; i++) {
			if (ID.equals(d.customer[i].getID())) {
				if (passWd.equals(d.customer[i].getPassWd())) {
					System.out.println("로그인 성공");
					return;
				} else {
					System.out.println("암호가 일치하지 않음");
					return;
				}
			}
		}
		
		System.out.println("일치하는 아이디가 없습니다.");
		
	}

}
