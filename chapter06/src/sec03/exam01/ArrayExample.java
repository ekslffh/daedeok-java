package sec03.exam01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {

		// 문제 1. 정수형 데이터 10개를 저장할 수 배열을 생성하여 합과 평균을 구하시오.
//		int[] score = new int[10];
//		Random rnd = new Random();
//		// 10개의 데이터 저장하기
//		for (int i = 0; i < score.length; i++) {
//			// 1부터 100까지의 수 중에 랜덤으로 입력
//			score[i] = rnd.nextInt(100) + 1;
//		}
//		// 합과 평균 구하기
//		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		double avg = (double)sum / score.length;
//		System.out.println("합: " + sum + ", 평균: " + avg);
		
		// 문제 2. 문자 26개를 저장하는 배열을 생성하고 알파벳 대문자로 초기화하며, 인덱스 10번과 20번 데이터를 서로 바꾸어 출력하시오.
//		char[] arr = new char[26];
//		Random rnd = new Random();
//		// 대문자 A ~ B 사이에 값 랜덤으로 넣기 (아스키코드 65~90)
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (char)(rnd.nextInt(26) + 65); 
//		}
//		System.out.println("기존 데이터");
//		System.out.println(Arrays.toString(arr));
//		// 10번 인덱스와 20번 인덱스 값 서로 바꾸기
//		char temp = arr[10];
//		arr[10] = arr[20];
//		arr[20] = temp;
//		System.out.println("바꾼 데이터");
//		System.out.println(Arrays.toString(arr));
		
		// 문제 3. 10개의 정수를 저장할 수 있는 배열을 생성하고 초기화 시킨 후 최대값과 최소값을 및 최대/최소 값의 위치를 출력하시오.
//		int[] arr = new int[10];
//		Random rnd = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			// 1 ~ 100 사이에 정수값 랜덤으로 넣기
//			arr[i] = rnd.nextInt(100) + 1;
//		}
//		// 최대값, 최소값 및 최대/최소 값의 위치 구하기
//		int maxIdx = 0;
//		int minIdx = 0;
//		for (int i = 1; i < arr.length; i++) {
//			// 최대값 구하기
//			if (arr[maxIdx] < arr[i]) {
//				maxIdx = i;
//			}
//			// 최소값 구하기
//			if (arr[minIdx] > arr[i]) {
//				minIdx = i;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println("최대값: " + arr[maxIdx] + " (위치: " + maxIdx + "번 인덱스)");
//		System.out.println("최소값: " + arr[minIdx] + " (위치: " + minIdx + "번 인덱스)");

		
		// 문제 4. 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하는 프로그램
//		int[] arr = {95, 75, 85, 100, 50};
//		System.out.println("기존 배열");
//		System.out.print(Arrays.toString(arr));
//		// [방법 1] 선택정렬
//		for (int i = 0; i < arr.length; i++) {
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
//		// [방법 2] 버블정렬
////		for (int i = 0; i < arr.length - 1; i++) {
////			for (int j = 0; j < arr.length - i - 1; j++) {
////				if (arr[j] > arr[j + 1]) {
////					int temp = arr[j];
////					arr[j] = arr[j + 1];
////					arr[j + 1] = temp;
////				}
////			}
////		}
//		System.out.println("\n오름차순정렬 이후 배열");
//		System.out.print(Arrays.toString(arr));
		
		// 문제 5. 4지선다형 문제의 정답이 "1 2 3 4 4 3 2 1 1 2"이고 5명의 답안이 아래와 같을 때 채점하여 점수를 출력하시오.
//		int[] answer = {1, 2, 3, 4, 4, 3, 2, 1, 1, 2};
//		String[] student = {"홍길동", "이순신", "정순호", "박슬기", "이민희"};
//		int[][] sheet = {{1,3,2,4,3,1,4,2,2,1},{2,3,2,4,2,2,1,1,3,4},{3,2,4,3,2,1,2,1,3,3},{2,3,3,1,1,3,2,2,4,4},{3,1,1,2,4,1,2,3,1,3}};
//		// 각 학생 별로 점수매기기
//		int[] score = new int[student.length];
//		for (int i = 0; i < sheet.length; i++) {
//			for (int j = 0; j < sheet[i].length; j++) {
//				if (answer[j] == sheet[i][j]) {
//					score[i] += 10;
//				}
//			}
//		}
//		// 학생별로 점수 출력
//		for (int i = 0; i < student.length; i++) {
//			System.out.println(student[i] + " 학생의 점수: " + score[i]);
//		}
		
		// 문제 6. 위 문제를 채점하여 학생의 답안이 맞으면 0, 틀리면 X를 출력하는 프로그램을 작성하시오.
//		int[] answer = {1, 2, 3, 4, 4, 3, 2, 1, 1, 2};
//		String[] student = {"홍길동", "이순신", "정순호", "박슬기", "이민희"};
//		int[][] sheet = {{1,3,2,4,3,1,4,2,2,1},{2,3,2,4,2,2,1,1,3,4},{3,2,4,3,2,1,2,1,3,3},{2,3,3,1,1,3,2,2,4,4},{3,1,1,2,4,1,2,3,1,3}};
//		// 각 학생 별로 O,X 출력하기
//		int[] score = new int[student.length];
//		for (int i = 0; i < sheet.length; i++) {
//			System.out.print(student[i] + "학생 채점결과: ");
//			for (int j = 0; j < sheet[i].length; j++) {
//				// 각 답안 정답과 비교하여 맞으면 O, 틀리면 X를 출력
//				if (answer[j] == sheet[i][j]) {
//					System.out.print("O ");
//				} else {
//					System.out.print("X ");
//				}
//			}
//			System.out.println();
//		}
		
		// 문제 7. 위의 채점결과로 등수를 출력하시오.
//		int[] answer = {1, 2, 3, 4, 4, 3, 2, 1, 1, 2};
//		String[] student = {"홍길동", "이순신", "정순호", "박슬기", "이민희"};
//		int[][] sheet = {{1,3,2,4,3,1,4,2,2,1},{2,3,2,4,2,2,1,1,3,4},{3,2,4,3,2,1,2,1,3,3},{2,3,3,1,1,3,2,2,4,4},{3,1,1,2,4,1,2,3,1,3}};
//		// 각 학생 별로 점수매기기
//		int[] score = new int[student.length];
//		for (int i = 0; i < sheet.length; i++) {
//			for (int j = 0; j < sheet[i].length; j++) {
//				if (answer[j] == sheet[i][j]) {
//					score[i] += 10;
//				} 
//			}
//		}
//		// 학생들 등수 매기기
//		int[] rank = new int[student.length];
//		for (int i = 0; i < rank.length; i++) {
//			rank[i] = 1;
//		}
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score.length; j++) {
//				// 자신보다 더 높은 점수가 있으면 rank++
//				if (score[i] < score[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		// 학생이름, 점수, 등수 출력
//		for (int i = 0; i < student.length; i++) {
//			System.out.println(student[i] + "학생의 점수: " + score[i] + ", " + rank[i] + "등");
//		}
//		System.out.println();
//		
//		// 문제 8. 등수순으로 출력하시오.
//		for (int i = 1; i <= student.length; i++) {
//			for (int j = 0; j < student.length; j++) {
//				if (rank[j] == i) {
//					System.out.println(student[j] + "학생의 점수: " + score[j] + ", " + rank[j] + "등");
//				}
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력할 횟수: ");
//		int num = Integer.parseInt(sc.nextLine());
//		String[] arr = new String[num];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "번째 입력: ");
//			arr[i] = sc.nextLine();
//		}
//		// 문제 9. 문자열을 저장할 수 있는 1차원 배열로 STACK을 구현하고 입출력 동작을 수행하는 코드를 작성하시오.
//		System.out.println("=== STACK ===");
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}
//		// 문제 10. 문자열을 저장할 수 있는 1차원 배열로 QUEUE를 구현하고 입출력 동작을 수행하는 코드를 작성하시오.
//		System.out.println("=== QUEUE ===");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
	}

}
