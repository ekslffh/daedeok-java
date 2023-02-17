package sec02.exam01;

import java.io.IOException;

public class ExamInput {

	public static void main(String[] args) {

		// System.in.read() : 글자 한개 입력
		// . 정수(int)로 저장
		// . 예외처리안에서 사용
		int ch = 0;
		try {
			ch = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("ch = " + ch);
		System.out.println("ch = " + (char)ch);

	}

}