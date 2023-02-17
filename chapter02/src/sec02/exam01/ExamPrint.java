package sec02.exam01;

public class ExamPrint {

	public static void main(String[] args) {

		System.out.print("홍길동");
		System.out.print("34061");
		System.out.println("대전시 중구 계룡료 846");
		System.out.println();
		System.out.print("홍길순");
		System.out.print("34061");
		System.out.println("대전시 중구 계룡료 846");

		// System.out.printf("형식지정문자열", 변수list)
		// "형식지정문자열"
		// "%[[-|0]n]d" : 10진 정수
		// - : 왼쪽정렬
		// 0 : 남는 왼쪽 빈공간에 0 채움
//		System.out.printf("%d, %5d, %-5d, %05d", 1000, 1000, 1000, 1000);
		System.out.printf("%d\n", 1000);
		System.out.printf("%8d\n", 1000);
		System.out.printf("%-8d\n", 1000);
		System.out.printf("%08d\n", 1000);

		// "%[[-|0]n].pf" : 10진 실수
		// n : 전체자리수 (소수점 포함)
		// p : 소수점 이하의 자리수
		// n-p-1 : 정수부분 자리수

		System.out.println("123456789 + 12345");
		System.out.printf("%8.2f \n", 234.5678); // 반올림
		System.out.printf("%-8.2f \n", 5678234.5678);
		System.out.printf("%08.2f \n", 5678234.5678);

		// "%[[-|0]n]s" : 문자열 출력
		System.out.println("123456789 + 12345");
		System.out.printf("%s \n", "대전시");
		System.out.printf("%15s \n", "대전시");
		System.out.printf("%-15s \n", "대전시");

	}

}
