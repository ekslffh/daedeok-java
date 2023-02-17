package sec02.oper;

import java.util.Scanner;

public class EtcOperator {

	public static void main(String[] args) {
		// 삼항연산자
		// -일부 if문을 대신할 수 있음(효율성이 우수)
		// (조건식) ? 명령문1 : 명령문2
		// -조건식을 평가하여 참이면 명령문1을 수행하고 거짓이면 명령문2를 수행

//		Scanner sc = new Scanner(System.in);
//		System.out.print("주민번호 뒷자리 한자리 입력 : ");
//		int regno2 = sc.nextInt();
//		String gender = (regno2 == 1 || regno2 == 3) ? "남성" : "여성";
//		System.out.println(gender);

		// 키보드로 0-100사이의 점수하나를 입력하여
		// 1-59 : F
		// 60-69 : D
		// 70-79 : C
		// 80-89 : B
		// 90 이상 : A를 출력하시오
//		System.out.print("점수 입력(0-100) : ");
//		int score = sc.nextInt();
//		char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
//
//		System.out.println(score + " => " + grade);
		
		// 비트 연산자
		// &, |, ^, ~
		// - 비트별로 같은 위치에 존재하는 2진수에 대한 연산
		// 1) & : 비트별 and 연산
		// 2) | : 비트별 or 연산
		// 3) ^ : 비트별 ex-or 연산
		// 4) ~ : 1의 보수 연산
		
		int num1 = 10;
		int num2 = 6;
		
		System.out.println("num1 & num2 = " + (num1 & num2));
		// 10 : 1010
		//  6 : 0110
		//-----------
		//		0010 => 2
		System.out.println("num1 | num2 = " + (num1 | num2));
		// 10 : 1010
		//  6 : 0110
		//-----------
		//		1110 => 14
		System.out.println("num1 ^ num2 = " + (num1 ^ num2));
		// 10 : 1010
		//  6 : 0110
		//-----------
		//		1100 => 12
		System.out.println("~num1 = " + (~num1));
		
		// shift operator
		// >>, <<, >>>
		// 숫자 >> 정수 => '숫자'를 정수만큼 오른쪽으로 평행이동( 이동 후
		// 발생되는 오른쪽의 빈공간은 부호가 확장되어 padding
		// => '숫자'를 2^(정수)로 나눈 몫이 됨
		System.out.println("12>>2 : " + (12 >> 2));
		System.out.println("12<<2 : " + (12 << 2));
		System.out.println("-12>>>2 : " + (-12 >>> 2));
		
		byte temp = 10;
		System.out.println(~temp);
		
	}

}
