package sec02.exam01;

/**
 * 
 * @author PC-20
 *
 * char
 * 부호 없는 2byte 정수(0~65535) : 2의 16승까지
 * 한 글자만 저장
 * ' '안에 표현
 */

public class ExamChar {
	static char ch;
	public static void main(String[] args) {
		char c1 = ' ';
		c1 = 'a';
		short s = 100;
		byte b = 100;
		char c2 = '대';
//		char c3 = s; // char타입은 음수표현이 불가능
//		char c4 = b;
		System.out.println("c1=" + c1);
		System.out.println("c1=" + (char)(c1 + 5));
		System.out.println((int)c2);
	}

}
