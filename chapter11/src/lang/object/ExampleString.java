package lang.object;

public class ExampleString {

	public static void main(String[] args) {
		// String 클래스는 내용변경이 허용되지 않음
		// charAt(int idx) - idx위치의 문자(char) 반환
		// compareTo(String str) - str과 내용 비교(사전식 비교)
		// indexOf(char ch | String str) - 해당 문자나 문열의 시작 위치 반환
		// toCharArray() - 해당 문자열을 문자배열로 반환 (char배열)
		// substring(int sidx, int eidx)
		// - 주어진 문자열에서 sidx부터 eidx - 1번째 문자열을 새로운 문자열로 만들어 반환
		// trim() - 좌우에 존재하는 무효의 공백 제거
		String str1 = "대전시 중구 계룡로 846";
		String str2 = "Hello";
		
		System.out.println(str1.charAt(5));
		System.out.println(str2.compareTo("Hello"));
		System.out.println("Hello John");
		System.out.println(str2.compareTo("Hello!"));
		
		System.out.println("hello 주소 " + System.identityHashCode("Hello"));
		System.out.println("hello john 주소 " + System.identityHashCode("Hello" + "John"));

		System.out.println(str1.indexOf('룡'));
		System.out.println(str1.indexOf("계룡"));
		
		char[] addr = str1.toCharArray();
		for (char c : addr) {
			System.out.println(c);
		}
	}
	
}
