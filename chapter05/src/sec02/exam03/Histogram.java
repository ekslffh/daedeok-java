package sec02.exam03;

public class Histogram {

	public static void main(String[] args) {
		DiceExample d = new DiceExample();
		// ����2] �ֻ����� 50ȸ �������� ������ ���� ���� �����Ͽ� 
		//		 1���� Histogram�� �׸��� ������׷��� -90��
		//		 ȸ����Ų ����� ����Ͻÿ�.
		// 1) �ֻ����� 50ȸ ������ �� ������ ���� ���� �����Ͽ� �迭�� ����
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
	
	public void oneDim(int[] dice) { // 1���� ������׷� ���
		for (int i = 0; i < dice.length; i++) {
			System.out.print((i + 1) + "| ");
			for (int j = 0; j < dice[i]; j++) {
				System.out.print("*");
			}
			System.out.println(dice[i]);
		}
	}
	
	public char[][] convertDim(int[] dice) {
		// �ֻ��� ���� �� �߿��� �ִ밪 ���ϱ�
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
