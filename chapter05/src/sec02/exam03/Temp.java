package sec02.exam03;

import java.util.Random;

public class Temp {

	public static void main(String[] args) {
		
		int[] dice = new int[6];
		Random rnd = new Random();
		for (int i = 0; i < 50; i++) {
			int r = rnd.nextInt(6) + 1;
			dice[r - 1]++;
		}
		for (int i = 0; i < dice.length; i++) {
			System.out.print(dice[i] + " ");
		}
		System.out.println();
		int maxVal = dice[0];
		for (int i = 1; i < dice.length; i++) {
			if (maxVal < dice[i]) {
				maxVal = dice[i];
			}
		}
		char[][] histogram = new char[maxVal][6];
		for (int i = 0; i < dice.length; i++) {
			for (int j = 0; j < dice[i]; j++) {
				histogram[j][i] = '*';
			}
		}
		for (int i = histogram.length - 1; i >= 0; i--) {
			for (int j = 0; j < histogram[i].length; j++) {
				System.out.print("  " + histogram[i][j]);
			}
			System.out.println();
		}
	}

}
