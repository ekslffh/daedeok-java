package sec02.exam02;

import java.util.Scanner;

public class ExampleTwoDim02 {

	public static void main(String[] args) {
		// 5�� �̸��� 3���� ������ ����� �迭�� �����ϰ� �ʱ�ȭ �Ͻÿ�
		// �̸� �迭 : stdName�̰� �ڷ��
		// "ȫ�浿","�̼���","������","�̼���","������"
		// �����迭 : score�̰� �ڷ��
		/* ����	����	����
		 * 80	75	65
		 * 90	70	85
		 * 95	85	90
		 * 70	60	50
		 * 90	90	90
		 */
		String[] stdName = {"ȫ�浿","�̼���","������","�̼���","������"};
		int[][] score = {{80,75,65,0,0,1},{90,70,85,0,0,1},{95,85,90,0,0,1},{70,60,50,0,0,1},{90,90,90,0,0,1}};
		// ����, ��հ� ����� ���Ͻÿ�. ��, ����� ������, ����� ������ ��������
		// �ο��ϵ� ���� ������ ���� ����� �ο��ϰ� �� ���� ����� ������ ���� ����
		// ������ �Ѵ�. (ex 90,85,85,75,65 �̸� 1,2,2,4,5)
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
		
		
		
		// ��������� ����Ͻÿ�.....
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
		for (int i = 0; i < temp.length; i++) { // ��
			for (int j = 0; j < 3; j++) { // ��
				temp[i][3] += temp[i][j];
			}
			temp[i][4] = temp[i][3] / 3;
		}
	}
	// �������� ó������
	public void rank(int[][] score) {
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
		}
	}
	
	public void swap(int[][] score) { // �� ��ġ �ٲ�
		
	}
	
}
