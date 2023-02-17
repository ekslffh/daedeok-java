package sec02.exam02;

public class ExampleDoWhile01 {

	public static void main(String[] args) {

		// 50원, 100원, 500원 동전으로 2300원을 만드는 경우의 수를
		// 출력하시오. 단, 모든 종류의 동전은 하나 이상 사용할 것
		
		int b1 = 1; // 500원
		int c1 = 1; // 100원
		int d1 = 1; // 50원
		
		System.out.println("500원 100원 50원");
		System.out.println("=================");
		do {
			c1 = 1;
			do {
				d1 = 1;
				do {
					if ((d1 * 50 + c1 * 100 + b1 * 500) == 2300) {
						System.out.printf("%5d %5d %5d%n", b1, c1, d1);
						break;
					}
					d1++;
				} while (d1 < 35);
				c1++;
			} while (c1 < 18);
			b1++;
		} while (b1 < 5);
		
	}

}
