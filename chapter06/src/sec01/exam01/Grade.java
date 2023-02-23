package sec01.exam01;

import java.util.Scanner;

public class Grade {
	// 세과목점수 입력받아 멤버변수에 저장
	// 총점과 평균을 구하는 메서드
	// 출력메서드
	private int[] score = new int[3];
	private int sum;
	private double avg;
	
	public void setScore() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 과목 점수 : ");
			score[i] = Integer.parseInt(sc.nextLine());
		}
		setSumAvg();
	}
	
	public void setSumAvg() {
		for (int jum : score) {
			sum += jum;
		}
		avg = (double)sum / score.length; 
	}
	
	public void printScore() {
		System.out.println("과목1\t과목2\t과목3\t총점\t평균");
		System.out.println("===========================================");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t", score[i]);
		}
		System.out.printf("%d\t %f\n", sum, avg);
		System.out.println("===========================================");
	}
	
}
