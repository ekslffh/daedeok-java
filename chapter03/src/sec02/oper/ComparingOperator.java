package sec02.oper;

import java.util.Scanner;

class Student {
	
}

public class ComparingOperator {

	public static void main(String[] args) {
		// 비교연산자: 크기를 비교하여 true/false 값을 반환
		// >, <, ==, >=, <=, !=
		// 조건식에 사용
		// 객체 내용을 비교 : equals()사용
		// 객체비교시 '=='연산자는 주소 비교
		
		boolean b1 = 20 >= 15;
//		System.out.println(b1);
		// 정수 하나를 설정하고 키보드로 임의의 수를 입력 받아
		// 입력받은 수가 크면 "더 작은 값을 입력하세요"를 출력하고
		// 다시 수를 입력받는다. 입력 받은 수가 더 작으면 
		// "더 큰 수를 입력하세요"를 출력하고 다시 수를 입력 받는다.
		// 설정된 값과 같은 값을 몇번만에 맞추는지를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
//		
//		int question = 120; // 정답
//		int cnt = 0; // 시도횟수
//		while (true) {
//			System.out.print("정수 하나를 입력 하세요 : ");
//			int ans = Integer.parseInt(sc.nextLine());
//			cnt++;
//			
//			if (question > ans) {
//				System.out.println("더 큰 수를 입력하세요");
//			} else if(question < ans) {
//				System.out.println("더 작은 수를 입력하세요");
//			} else {
//				System.out.println("정답입니다 시도횟수 : " + cnt);
//				break;
//			}
//		}
		
//		String str1 = new String("홍길동");
//		String str2 = new String("홍길동");
//		
//		System.out.println(str1 == str2); // str1과 str2의 주소값을 비교
//		System.out.println(str1.equals(str2));
//		
//		Student student1 = new Student();
//		Student student2 = new Student();
//		Student student3 = student1;
//		
//		System.out.println(student1 == student2);
//		System.out.println(student1 == student3);

		int i = 10;
		double d = 10.0;
		
		System.out.println(i == d); // => true
		
		double d1 = 10.1;
		float f = 10.1f;
		
		System.out.println(d1 == f); // => false
		System.out.println((double)f);
		
		System.out.println((float)d1 == f);
		System.out.println((float)d1);
		
		
		Student student = new Student();
		System.out.println(student instanceof Student); // true
	}

}
