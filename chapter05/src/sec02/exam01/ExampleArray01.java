package sec02.exam01;

import java.util.Random;

public class ExampleArray01 {
	public static void main(String[] args) {
		// ���� 10���� ������ �� �ִ� �迭
		// �迭 �ʱ�ȭ
		Array01 ar01 = new Array01();
		ar01.initArr();
		ar01.arrInt();
		
		// �迭�� �հ� ����� ���Ͽ� ����Ͻÿ�
		ar01.sumArr();
		// �ִ밪 ���ϱ�
		ar01.maxNum();
	}
}

class Array01 {
	
	int[] arr = new int[10]; // ����
	int[] num = {35, 67, 88, 56, 90}; // new int[]�� �����Ǿ��� �����Ϸ��� �־���!
//	int[] num1 = new int[]{35, 67, 88, 56, 90};
	
	public void initArr() {
		Random rnd = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(100) + 1;
		}
	}
	
	public void arrInt() {		
		// �迭����
		for (int i : arr) {
			System.out.print(i + ", ");
		}		
	}
	
	// �հ� ���
	public void sumArr() {
		int sum = 0;
		double avg = 0.0;
		
		for (int number : arr) {
			sum += number;
		}
		avg = (double)sum / arr.length;
		System.out.println("\n�հ�: " + sum);
		System.out.println("���: " + avg);
	}
	
	public void maxNum() {
		// �ִ밪
		int tempMax = arr[0]; // �ӽ��ִ밪
		int tempMin = arr[0]; // �ӽ��ּҰ�
		for (int i = 1; i < arr.length; i++) {
			if (tempMax < arr[i]) {
				tempMax = arr[i];
			}
			if (tempMin > arr[i]) {
				tempMin = arr[i];
			}
		}
		System.out.println("�ִ밪 = " + tempMax);
		System.out.println("�ּҰ� = " + tempMin);
	}
	
}