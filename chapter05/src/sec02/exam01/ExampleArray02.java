package sec02.exam01;

public class ExampleArray02 {

	public static void main(String[] args) {
		// 임의의 점수(0-100) 5개를 저장하는 배열 score 생성
		// 5명의 학생이름을 배열로 저장
		int[] score = {60, 85, 70, 95, 55};
		String[] name = {"홍길동", "이순신", "홍길순", "강감찬", "이성계"};
		
		// 제일 큰 점수를 받은 학생을 조회하시오.
//		int maxIdx = 0;
//		for (int i = 1; i < score.length; i++) {
//			if (score[maxIdx] < score[i]) {
//				maxIdx = i;
//			}
//		}
//		System.out.println(name[maxIdx] + " " + score[maxIdx] + "점");
		
		// 점수가 작은 값에서 큰값 순으로 정렬
		// 1) 버블정렬: 인접된 2개의 자료를 비교하여 자리 바꿈
		//	  반복될 때마다 가장 큰 값이 뒤쪽으로 이동하게 된다.
//		for (int i = 0; i < score.length - 1; i++) {
//			for (int j = 0; j < score.length - i - 1; j++) {
//				if (score[j] > score[j + 1]) {
//					int t = score[j];
//					score[j] = score[j + 1];
//					score[j + 1] = t;
//				}
//			}
//			for (int j = 0; j < score.length; j++) {
//				System.out.print(score[j] + ", ");
//			}
//			System.out.println();
//		}
		// 2) 선택정렬: 왼쪽부터 기준값을 설정하여 설정된 기준 값과
		//	  나머지 자료가 비교됨
		//    각 회전마다 기준이었던 값은 다음 회전에서는 비교에서 제외
		//	  각 회전마다 자리교환의 발생여부에 따라 정렬여부를 판단하여
		// 	  수행을 종료시킬수도 있음(개선된 선택정렬 알고리즘)
		for (int i = 0; i < score.length - 1; i++) {
			boolean flag = false;
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {
					int t = score[i];
					score[i] = score[j];
					score[j] = t;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
		
		for (int num : score) {
			System.out.print(num + ", ");
		}
			
	}

}
