package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class ExampleArray03 {

	public static void main(String[] args) {
		// 문제1] 액수를 입력받아 500,100,50,10원짜리 동전을 가장 적게 사용하는 방법을 출력하시오(if문사용하지 말것/배열사용)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("액수입력: ");
//		int money = sc.nextInt();
//		int[] coins = {500, 100, 50, 10};
//		int count = 0;
//		for (int coin : coins) {
//			System.out.println(coin + "원 " + (money / coin) + "개 사용");
//			count += money / coin;
//			money %= coin;
//		}
//		System.out.println("총 사용한 동전의 개수는 " + count + "개 입니다.");
		
		// 문제2] 주사위를 50회 던졌을때 나오는 눈의 수를 측정하여 Histogram을 그리시오.
		// 방법1] 가로방향
//		int[] dice = new int[6];
//		Random rnd = new Random();
//		for (int i = 0; i < 50; i++) {
//			dice[rnd.nextInt(6)]++;
//		}
//		for (int i = 0; i < dice.length; i++) {
//			System.out.print(i + 1 + " ");
//			for (int j = 0; j < dice[i]; j++) {
//				System.out.print("■");
//			}
//			System.out.println("\n");
//		} 

		// 방법2] 세로방향
//		int[] dice = new int[6];
//		Random rnd = new Random();
//		// 주사위 입력받으면서 주사위 개수 최대값 구하기
//		int maxCount = 0;
//		for (int i = 0; i < 50; i++) {
//			int value = rnd.nextInt(6);
//			if (++dice[value] > maxCount) {
//				maxCount = dice[value];
//			}
//		}
//		for (int i = 0; i < dice.length; i++) {
//			System.out.print(dice[i] + " ");
//		}
//		System.out.println();
//		// 최대수부터 내려오면서 각 눈의 수와 비교해서 이상이면 그래프출력
//		for (int i = maxCount; i > 0; i--) {
//		// 세로축 그리기
//			if (i >= 10) {
//				System.out.print(i + " ");
//			} else {
//				System.out.print(i + "  ");
//			}
//		// 도표 출력
//			for (int j = 0; j < dice.length; j++) {
//				if (dice[j] >= i) {
//					System.out.print("|  ");
//				} else {
//					System.out.print("   ");
//				}
//			}
//			System.out.println();
//		}
//		// 가로축 그리기
//		for (int i = 0; i <= 6; i++) {
//			System.out.print(i + "  ");
//		}
		
		// 문제3] 1-10사이의 난수 10개를 발생시켜 배열에 저장한 후 중복된 값을 제거한 배열을 만드시오.
		// 방법1]
//		int[] arr = new int[10];
//		Random rnd = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = rnd.nextInt(10) + 1;
//		}
//		System.out.println("======기존배열======");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		// 해당 원소 개수 카운트해서 1~10인덱스에 +1
//		int[] countArr = new int[11];
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (countArr[arr[i]]++ == 0) {
//				count++;
//			} 
//		}
//		// 중복되지 않은 count만큼 배열생성
//		int[] copyArr = new int[count];
//		int idx = 0;
//		for (int i = 1; i < countArr.length; i++) {
//			if (countArr[i] != 0) {
//				copyArr[idx++] = i;
//			}
//		}
//		System.out.println("======새로운배열======");
//		for (int i = 0; i < copyArr.length; i++) {
//			System.out.print(copyArr[i] + " ");
//		}
		
		// 방법2]
//		int[] arr = new int[10];
//		Random rnd = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = rnd.nextInt(10) + 1;
//		}
//		System.out.println("======기존배열======");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		
//		// 배열 정렬 (선택정렬)
//		for (int i = 0; i < arr.length - 1; i++) {
//			int minIdx = i;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[minIdx] > arr[j]) {
//					minIdx = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[minIdx];
//			arr[minIdx] = temp;
//		}
//		// 중복되지 않는 요소의 개수 구하기
//		int count = 1;
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] != arr[i-1]) {
//				count++;
//			}
//		}
//		// 중복되지 않는 요소 copyArr에 삽입
//		int[] copyArr = new int[count];
//		copyArr[0] = arr[0];
//		int idx = 1;
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] != arr[i-1]) {
//				copyArr[idx++] = arr[i];
//			}
//		}
//		System.out.println("======새로운배열======");
//		for (int c : copyArr) {
//			System.out.print(c + " ");
//		}
		
		
		
	}

}
