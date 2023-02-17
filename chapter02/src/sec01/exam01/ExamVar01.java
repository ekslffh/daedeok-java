package sec01.exam01;

/**
 * 1. 변수 : 기억장소 이름 - 기본형 : 실제 자료 byte,short,int,long, float,double,char,boolean
 * - 참조형 : 주소 (class타입,배열,열거형) - 변수의 사용 . 선언 : 데이터 타입과 변수명 결정 (선언 형식) 타입명 변수명;
 * ex) int num; int age; int height;
 * 
 * int num, age, height; char ch; double dnum;
 * 
 * ExamVar01 ex01; int[] num; enum . 변수명 : 첫 글자는 영문자, $, _ 중 하나 두번째 글자는 영문자, 숫자,
 * $, _ 영소문자를 사용하고 두 단어 이상 결합시 단어 시작글자만 대문자 (camelCase) taxRate, korScore
 * 예약어(명령문)는 사용 금지 . 변수는 선언위치에 따라 멤버변수-class 내부 method 밖의 영역에서 선언된 변수 -사용자가 초기화
 * 하지 않으면 자동초기화 지역변수-메서드 내부, { }안에 선언된 변수: 초기화 X -> 직접 초기화 해야한다. . 초기화 변수명=값; --
 * 변수가 선언된 후 타입명 변수명 = 값; 변수선언과 초기화를 동시
 */ 

public class ExamVar01 {
	public static void main(String[] args) {
		VarSample1 vs1 = new VarSample1();
		System.out.println("결과 = " + vs1.myMethod());
		System.out.println("멤버변수 num 값 = " + (vs1.num + 20));
	}
}

class VarSample1 {
	// 멤버변수
	long num = 200L;

	public int myMethod() {
		// 지역변수
		int num1 = 100;
		long res1 = this.num + 10;
		int res2 = num1 + 10;
		if (num > 0) {
			int sum = 0; 
			return (int) num;
		} else {
			return res2;
		}
	}
	
}
