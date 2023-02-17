package sec02.exam01;

import java.util.Random;

public class ExampleArray01 {
	public static void main(String[] args) {
		// 정수 10개를 저장할 수 있는 배열
		// 배열 초기화
		Array01 ar01 = new Array01();
		ar01.initArr();
		ar01.arrInt();
		
		// 배열의 합과 평균을 구하여 출력하시오
		ar01.sumArr();
		// 최대값 구하기
		ar01.maxNum();
	}
}

class Array01 {
	
	int[] arr = new int[10]; // 생성
	int[] num = {35, 67, 88, 56, 90}; // new int[]가 생략되었고 컴파일러가 넣어줌!
//	int[] num1 = new int[]{35, 67, 88, 56, 90};
	
	public void initArr() {
		Random rnd = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(100) + 1;
		}
	}
	
	public void arrInt() {		
		// 배열참조
		for (int i : arr) {
			System.out.print(i + ", ");
		}		
	}
	
	// 합과 평균
	public void sumArr() {
		int sum = 0;
		double avg = 0.0;
		
		for (int number : arr) {
			sum += number;
		}
		avg = (double)sum / arr.length;
		System.out.println("\n합계: " + sum);
		System.out.println("평균: " + avg);
	}
	
	public void maxNum() {
		// 최대값
		int tempMax = arr[0]; // 임시최대값
		int tempMin = arr[0]; // 임시최소값
		for (int i = 1; i < arr.length; i++) {
			if (tempMax < arr[i]) {
				tempMax = arr[i];
			}
			if (tempMin > arr[i]) {
				tempMin = arr[i];
			}
		}
		System.out.println("최대값 = " + tempMax);
		System.out.println("최소값 = " + tempMin);
	}
	
}