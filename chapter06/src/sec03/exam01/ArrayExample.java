package sec03.exam01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {

		// ���� 1. ������ ������ 10���� ������ �� �迭�� �����Ͽ� �հ� ����� ���Ͻÿ�.
//		int[] score = new int[10];
//		Random rnd = new Random();
//		// 10���� ������ �����ϱ�
//		for (int i = 0; i < score.length; i++) {
//			// 1���� 100������ �� �߿� �������� �Է�
//			score[i] = rnd.nextInt(100) + 1;
//		}
//		// �հ� ��� ���ϱ�
//		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		double avg = (double)sum / score.length;
//		System.out.println("��: " + sum + ", ���: " + avg);
		
		// ���� 2. ���� 26���� �����ϴ� �迭�� �����ϰ� ���ĺ� �빮�ڷ� �ʱ�ȭ�ϸ�, �ε��� 10���� 20�� �����͸� ���� �ٲپ� ����Ͻÿ�.
//		char[] arr = new char[26];
//		Random rnd = new Random();
//		// �빮�� A ~ B ���̿� �� �������� �ֱ� (�ƽ�Ű�ڵ� 65~90)
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (char)(rnd.nextInt(26) + 65); 
//		}
//		System.out.println("���� ������");
//		System.out.println(Arrays.toString(arr));
//		// 10�� �ε����� 20�� �ε��� �� ���� �ٲٱ�
//		char temp = arr[10];
//		arr[10] = arr[20];
//		arr[20] = temp;
//		System.out.println("�ٲ� ������");
//		System.out.println(Arrays.toString(arr));
		
		// ���� 3. 10���� ������ ������ �� �ִ� �迭�� �����ϰ� �ʱ�ȭ ��Ų �� �ִ밪�� �ּҰ��� �� �ִ�/�ּ� ���� ��ġ�� ����Ͻÿ�.
//		int[] arr = new int[10];
//		Random rnd = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			// 1 ~ 100 ���̿� ������ �������� �ֱ�
//			arr[i] = rnd.nextInt(100) + 1;
//		}
//		// �ִ밪, �ּҰ� �� �ִ�/�ּ� ���� ��ġ ���ϱ�
//		int maxIdx = 0;
//		int minIdx = 0;
//		for (int i = 1; i < arr.length; i++) {
//			// �ִ밪 ���ϱ�
//			if (arr[maxIdx] < arr[i]) {
//				maxIdx = i;
//			}
//			// �ּҰ� ���ϱ�
//			if (arr[minIdx] > arr[i]) {
//				minIdx = i;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println("�ִ밪: " + arr[maxIdx] + " (��ġ: " + maxIdx + "�� �ε���)");
//		System.out.println("�ּҰ�: " + arr[minIdx] + " (��ġ: " + minIdx + "�� �ε���)");

		
		// ���� 4. 5���� ������ {95, 75, 85, 100, 50}�� �ʱ�ȭ�ϰ� ������������ �����ϴ� ���α׷�
//		int[] arr = {95, 75, 85, 100, 50};
//		System.out.println("���� �迭");
//		System.out.print(Arrays.toString(arr));
//		// [��� 1] ��������
//		for (int i = 0; i < arr.length; i++) {
//			int minIdx = i;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[minIdx] > arr[j]) {
//					minIdx = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[minIdx];
//			arr[minIdx] = temp;
//		}
//		// [��� 2] ��������
////		for (int i = 0; i < arr.length - 1; i++) {
////			for (int j = 0; j < arr.length - i - 1; j++) {
////				if (arr[j] > arr[j + 1]) {
////					int temp = arr[j];
////					arr[j] = arr[j + 1];
////					arr[j + 1] = temp;
////				}
////			}
////		}
//		System.out.println("\n������������ ���� �迭");
//		System.out.print(Arrays.toString(arr));
		
		// ���� 5. 4�������� ������ ������ "1 2 3 4 4 3 2 1 1 2"�̰� 5���� ����� �Ʒ��� ���� �� ä���Ͽ� ������ ����Ͻÿ�.
//		int[] answer = {1, 2, 3, 4, 4, 3, 2, 1, 1, 2};
//		String[] student = {"ȫ�浿", "�̼���", "����ȣ", "�ڽ���", "�̹���"};
//		int[][] sheet = {{1,3,2,4,3,1,4,2,2,1},{2,3,2,4,2,2,1,1,3,4},{3,2,4,3,2,1,2,1,3,3},{2,3,3,1,1,3,2,2,4,4},{3,1,1,2,4,1,2,3,1,3}};
//		// �� �л� ���� �����ű��
//		int[] score = new int[student.length];
//		for (int i = 0; i < sheet.length; i++) {
//			for (int j = 0; j < sheet[i].length; j++) {
//				if (answer[j] == sheet[i][j]) {
//					score[i] += 10;
//				}
//			}
//		}
//		// �л����� ���� ���
//		for (int i = 0; i < student.length; i++) {
//			System.out.println(student[i] + " �л��� ����: " + score[i]);
//		}
		
		// ���� 6. �� ������ ä���Ͽ� �л��� ����� ������ 0, Ʋ���� X�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		int[] answer = {1, 2, 3, 4, 4, 3, 2, 1, 1, 2};
//		String[] student = {"ȫ�浿", "�̼���", "����ȣ", "�ڽ���", "�̹���"};
//		int[][] sheet = {{1,3,2,4,3,1,4,2,2,1},{2,3,2,4,2,2,1,1,3,4},{3,2,4,3,2,1,2,1,3,3},{2,3,3,1,1,3,2,2,4,4},{3,1,1,2,4,1,2,3,1,3}};
//		// �� �л� ���� O,X ����ϱ�
//		int[] score = new int[student.length];
//		for (int i = 0; i < sheet.length; i++) {
//			System.out.print(student[i] + "�л� ä�����: ");
//			for (int j = 0; j < sheet[i].length; j++) {
//				// �� ��� ����� ���Ͽ� ������ O, Ʋ���� X�� ���
//				if (answer[j] == sheet[i][j]) {
//					System.out.print("O ");
//				} else {
//					System.out.print("X ");
//				}
//			}
//			System.out.println();
//		}
		
		// ���� 7. ���� ä������� ����� ����Ͻÿ�.
//		int[] answer = {1, 2, 3, 4, 4, 3, 2, 1, 1, 2};
//		String[] student = {"ȫ�浿", "�̼���", "����ȣ", "�ڽ���", "�̹���"};
//		int[][] sheet = {{1,3,2,4,3,1,4,2,2,1},{2,3,2,4,2,2,1,1,3,4},{3,2,4,3,2,1,2,1,3,3},{2,3,3,1,1,3,2,2,4,4},{3,1,1,2,4,1,2,3,1,3}};
//		// �� �л� ���� �����ű��
//		int[] score = new int[student.length];
//		for (int i = 0; i < sheet.length; i++) {
//			for (int j = 0; j < sheet[i].length; j++) {
//				if (answer[j] == sheet[i][j]) {
//					score[i] += 10;
//				} 
//			}
//		}
//		// �л��� ��� �ű��
//		int[] rank = new int[student.length];
//		for (int i = 0; i < rank.length; i++) {
//			rank[i] = 1;
//		}
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score.length; j++) {
//				// �ڽź��� �� ���� ������ ������ rank++
//				if (score[i] < score[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		// �л��̸�, ����, ��� ���
//		for (int i = 0; i < student.length; i++) {
//			System.out.println(student[i] + "�л��� ����: " + score[i] + ", " + rank[i] + "��");
//		}
//		System.out.println();
//		
//		// ���� 8. ��������� ����Ͻÿ�.
//		for (int i = 1; i <= student.length; i++) {
//			for (int j = 0; j < student.length; j++) {
//				if (rank[j] == i) {
//					System.out.println(student[j] + "�л��� ����: " + score[j] + ", " + rank[j] + "��");
//				}
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�Է��� Ƚ��: ");
//		int num = Integer.parseInt(sc.nextLine());
//		String[] arr = new String[num];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "��° �Է�: ");
//			arr[i] = sc.nextLine();
//		}
//		// ���� 9. ���ڿ��� ������ �� �ִ� 1���� �迭�� STACK�� �����ϰ� ����� ������ �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
//		System.out.println("=== STACK ===");
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}
//		// ���� 10. ���ڿ��� ������ �� �ִ� 1���� �迭�� QUEUE�� �����ϰ� ����� ������ �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
//		System.out.println("=== QUEUE ===");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
	}

}
