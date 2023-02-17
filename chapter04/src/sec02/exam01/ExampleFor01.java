package sec02.exam01;

public class ExampleFor01 {

	public static void main(String[] args) {

		// 1~10사이의 정수를 출력하시오
		// 1~10사이의 정수의 합을 출력하시오
		// 1~10사이의 짝수의 합과 홀수의 합을 출력하시오
		int sum = 0;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + " ");
			sum += (i + 1);
			if ((i + 1) % 2 == 0) {
				even += (i + 1);
			} else {
				odd += (i + 1);
			}
		}
		System.out.println("\n전체 합: " + sum);
		System.out.println("짝수의 합: " + even + ", 홀수의 합: " + odd);
	}

}
