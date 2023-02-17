package sec02.oper;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 산술연산자
		// 단항연산자-부호연산자(+,-), 증감연산자(++,--)
		// 이항연산자-사칙연산자(+,-,*,/,%)
		// 부호연산자 : 양수(plus)는 보통 생략
		short sh = 100;

		short res1 = (short) -sh;
		int res2 = -sh; // -연산이 일어나 sh가 int로 promotion

		// 증감 연산-> ++변수(prefix), 변수++(postfix)

		int i = 10;
		int j = 10;
		// i++ => 11, ++i => 11
		// int r1 = i++; r1에 i값을 배정한 후 i값에 1증가
		// (r1=10, i=11)
		// int r2 = ++i; i값을 1 증가시킨 후 그 결과를 r2에 배정
		// (r2=11, j=11)
		i++;
		++j;

		System.out.println("i++ : " + i);
		System.out.println("++j : " + j);

		System.out.println(i++);

		int r1 = i++;
		int r2 = ++j;
		System.out.println("i = " + i + ", r1 : " + r1);
		System.out.println("j = " + j + ", r2 : " + r2);

		int[] arr = new int[10];

		for (int idx = 0;; idx++) {
			if (idx >= 10) {
				break;
			} else {
				arr[idx++] = idx * 100;
			}
		}
		
		// 사칙연산자 : +,-,/,*,%
		// 1-100사이의 짝수합과 홀수합을 구하시오
		int even = 0;
		int odd = 0;
		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				even = even + num;
			} else {
				odd = odd + num;
			}
		}
		
		System.out.println("짝수의 합 = " + even);
		System.out.println("홀수의 합 = " + odd);
		
		int su1 = 10;
		int su2 = 5;
		
		System.out.println("덧셈 : " + (su1 + su2));
		System.out.println("뺄셈 : " + (su1 - su2));
		System.out.println("곱셈 : " + (su1 * su2));
		System.out.println("나눗셈 : " + (su2 / (double)su1));

	}

}
