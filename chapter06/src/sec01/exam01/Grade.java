package sec01.exam01;

import java.util.Scanner;

public class Grade {
	// ���������� �Է¹޾� ��������� ����
	// ������ ����� ���ϴ� �޼���
	// ��¸޼���
	private int[] score = new int[3];
	private int sum;
	private double avg;
	
	public void setScore() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "��° ���� ���� : ");
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
		System.out.println("����1\t����2\t����3\t����\t���");
		System.out.println("===========================================");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t", score[i]);
		}
		System.out.printf("%d\t %f\n", sum, avg);
		System.out.println("===========================================");
	}
	
}
