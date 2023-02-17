package sec02.exam02;

import java.util.Scanner;

public class ExampleTwoDim02 {

	public static void main(String[] args) {
		// 5의 이름과 3과목 점수가 저장될 배열을 생성하고 초기화 하시오
		// 이름 배열 : stdName이고 자료는
		// "홍길동","이순신","강감찬","이성계","정몽주"
		// 성적배열 : score이고 자료는
		/* 국어	영어	수학
		 * 80	75	65
		 * 90	70	85
		 * 95	85	90
		 * 70	60	50
		 * 90	90	90
		 */
		String[] stdName = {"홍길동","이순신","강감찬","이성계","정몽주"};
		int[][] score = {{80,75,65,0,0,1},{90,70,85,0,0,1},{95,85,90,0,0,1},{70,60,50,0,0,1},{90,90,90,0,0,1}};
		// 총점, 평균과 등수를 구하시오. 단, 평균은 정수로, 등수는 총점을 기준으로
		// 부여하되 같은 점수는 같은 등수를 부여하고 그 다음 등수는 동점자 수를 더한
		// 값으로 한다. (ex 90,85,85,75,65 이면 1,2,2,4,5)
		ExamScore s = new ExamScore();
		s.sum(score);
		s.rank(score);
		for (int i = 0; i < score.length; i++) {
			System.out.print(stdName[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		// 등수순으로 출력하시오.....
		for (int rank = 1; rank <= stdName.length; rank++) {
			for (int i = 0; i < score.length; i++) {
				if (score[i][5] == rank) {
					System.out.print(stdName[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.println();
				}
			}
		}
//		for (int i = 0; i < score.length - 1; i++) {
//			for (int j = 0; j < score.length - i - 1; j++) {
//				if (score[j][5] > score[j + 1][5]) {
//					int[] temp = score[j];
//					score[j] = score[j + 1];
//					score[j + 1] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(stdName[i] + "\t");
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
	}
}

class ExamScore {
	public void sum(int[][] temp) {
		for (int i = 0; i < temp.length; i++) { // 행
			for (int j = 0; j < 3; j++) { // 열
				temp[i][3] += temp[i][j];
			}
			temp[i][4] = temp[i][3] / 3;
		}
	}
	// 동점까지 처리가능
	public void rank(int[][] score) {
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
		}
	}
	
	public void swap(int[][] score) { // 행 위치 바꿈
		
	}
	
}
