package sec02.exam01;

/**
 * @author PC-20
 * String
 * class 타입
 * 문자열을 저장(""안에 포현된 데이터)
 * 문자열은 문자의 집합체로 각 문자가 위치한 위치값을 가지고 있음
 * 다른 타입의 자료와 연산될때 다른 타입의 자료가 문자열로 형변환 후 연산 수행
 */

public class ExamString {

	public static void main(String[] args) {

		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		
//		\t : tab키의 기능
		System.out.println(name + "\t" + job);
		
//		\n : (개행문자)줄바꿈
		System.out.println("\n" + name + "\n\n\n\n\n" + job);
		
//		\r : return 키
		System.out.println(name + "\r" + job);
		
//		\" : "출력
		System.out.println(name + "\"" + job + "\"");
		
		
	}

}
