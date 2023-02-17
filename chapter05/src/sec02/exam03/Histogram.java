package sec02.exam03;

public class Histogram {

	public static void main(String[] args) {
		DiceExample d = new DiceExample();
		// 문제2] 주사위를 50회 던졌을때 나오는 눈의 수를 측정하여 
		//		 1차원 Histogram을 그리고 히스토그램을 -90도
		//		 회전시킨 결과를 출력하시오.
		// 1) 주사위를 50회 던졌을 때 나오는 눈의 수를 측정하여 배열에 저장
		int[] dice = new int[6];
		for (int i = 0; i < 50; i++) {
			int r = (int)(Math.random() * 6) + 1;
			dice[r - 1]++;
		}
//		d.oneDim(dice);
		
		char[][] histo = d.convertDim(dice);
		

		
		for (int i = histo.length - 1; i >= 0; i--) {
			System.out.print("| ");
			for (int j = 0; j < histo[i].length; j++) {
				System.out.print("  " + histo[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------");
	}
}

class DiceExample {
	
	public void oneDim(int[] dice) { // 1차원 히스토그램 출력
		for (int i = 0; i < dice.length; i++) {
			System.out.print((i + 1) + "| ");
			for (int j = 0; j < dice[i]; j++) {
				System.out.print("*");
			}
			System.out.println(dice[i]);
		}
	}
	
	public char[][] convertDim(int[] dice) {
		// 주사위 눈의 수 중에서 최대값 구하기
		int maxVal = dice[0];
		for (int i = 1; i < dice.length; i++) {
			if (maxVal < dice[i]) {
				maxVal = dice[i];
			}
		} 
		
		char[][] histo = new char[maxVal][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < dice[i]; j++) {
				histo[j][i] = '*';
			}
		}
		return histo;
	}
	
}
