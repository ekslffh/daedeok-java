package sec02.exam01;

public class ExampleArray02 {

	public static void main(String[] args) {
		// ������ ����(0-100) 5���� �����ϴ� �迭 score ����
		// 5���� �л��̸��� �迭�� ����
		int[] score = {60, 85, 70, 95, 55};
		String[] name = {"ȫ�浿", "�̼���", "ȫ���", "������", "�̼���"};
		
		// ���� ū ������ ���� �л��� ��ȸ�Ͻÿ�.
//		int maxIdx = 0;
//		for (int i = 1; i < score.length; i++) {
//			if (score[maxIdx] < score[i]) {
//				maxIdx = i;
//			}
//		}
//		System.out.println(name[maxIdx] + " " + score[maxIdx] + "��");
		
		// ������ ���� ������ ū�� ������ ����
		// 1) ��������: ������ 2���� �ڷḦ ���Ͽ� �ڸ� �ٲ�
		//	  �ݺ��� ������ ���� ū ���� �������� �̵��ϰ� �ȴ�.
//		for (int i = 0; i < score.length - 1; i++) {
//			for (int j = 0; j < score.length - i - 1; j++) {
//				if (score[j] > score[j + 1]) {
//					int t = score[j];
//					score[j] = score[j + 1];
//					score[j + 1] = t;
//				}
//			}
//			for (int j = 0; j < score.length; j++) {
//				System.out.print(score[j] + ", ");
//			}
//			System.out.println();
//		}
		// 2) ��������: ���ʺ��� ���ذ��� �����Ͽ� ������ ���� ����
		//	  ������ �ڷᰡ �񱳵�
		//    �� ȸ������ �����̾��� ���� ���� ȸ�������� �񱳿��� ����
		//	  �� ȸ������ �ڸ���ȯ�� �߻����ο� ���� ���Ŀ��θ� �Ǵ��Ͽ�
		// 	  ������ �����ų���� ����(������ �������� �˰���)
		for (int i = 0; i < score.length - 1; i++) {
			boolean flag = false;
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {
					int t = score[i];
					score[i] = score[j];
					score[j] = t;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
		
		for (int num : score) {
			System.out.print(num + ", ");
		}
			
	}

}
