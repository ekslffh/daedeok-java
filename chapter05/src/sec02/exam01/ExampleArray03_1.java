package sec02.exam01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExampleArray03_1 {

	public static void main(String[] args) {
		Response r = new Response();
		// 문제1] 액수를 입력받아 500,100,50,10원짜리 동전을 가장 적게 사용하는 방법을 출력하시오(if문사용하지 말것/배열사용)
//		r.question1();
		// 문제2] 주사위를 50회 던졌을때 나오는 눈의 수를 측정하여 Histogram을 그리시오.
//		r.question2();
		// 문제3] 1-10사이의 난수 10개를 발생시켜 배열에 저장한 후 중복된 값을 제거한 배열을 만드시오.
		r.question03();
	}

}

class Response {
	
	Scanner sc = new Scanner(System.in);
	
	public void question1() {
		int[] coin = {500,100,50,10};
		System.out.print("돈의 액수를 입력: ");
		int amt = (int)(Integer.parseInt(sc.nextLine()));
		
		for (int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "원짜리 동전 : " + amt/coin[i] + "개");
			amt %= coin[i];
		}
	}
	
	public void question2() {
		int[] dice = new int[6];
		
		for (int i = 0; i < 50; i++) {
			int r = (int)(Math.random() * 6) + 1;
			dice[r-1]++;
		}
		
		for (int i = 0; i < dice.length; i++) {
			System.out.print((i + 1) + "| ");
			for (int j = 0; j < dice[i]; j++) {
				System.out.print("#");
			}
			System.out.println(dice[i]);
		}
		
		System.out.println("---------------------");
	}
	
	public void question03() {
		int[] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			num[i] = (int)(Math.random() * 10) + 1;
		}
		
		System.out.println(Arrays.toString(num)); // 배열자료 출력
		
		int[] temp = new int[num.length];
		int idx = 0; // temp에 사용될 인덱스
		
		for (int i = 0; i < num.length; i++) {
			boolean flag = false;
			for (int j = 0; j < temp.length; j++) {
				if (num[i] == temp[j]) {
					flag = true;
				}
			}
			if (!flag) {
				temp[idx++] = num[i];
			}
		}
		System.out.println(Arrays.toString(temp));	
		System.out.print("[");
		for (int t : temp) {
			if (t == 0) {
				System.out.println("]");
				break;
			}
			System.out.print(t + ", ");
		}
	}
	
}
