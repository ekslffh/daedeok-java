package homework3_2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		// 국어, 영어, 수학 점수와 이름을 입력 받아 총점과 평균을 구하여 출력하시오. 단, 평균은 소숫점1자리까지 출력하고 3명만 처리하시오.

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("국어점수: ");
			int korean = sc.nextInt();
			System.out.print("영어점수: ");
			int english = sc.nextInt();
			System.out.print("수학점수: ");
			int math = sc.nextInt();
			int sum = (korean + english + math) / 3;
			double average = sum / 3.0;
			System.out.printf("%s의 총점은 %d점이고 평균은 %.1f점입니다.\n", name, sum, average);
		}
		
		sc.close();
		
	}

}
