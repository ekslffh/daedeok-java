package sec02.exam01;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// ���̵�� �н����� �Է� �� Customer�� ���̵��
		// �н����带 ���Ͽ� ��� ��ġ�ϸ� "�α��� ����"
		// �ϳ��� ����ġ�ϸ� "�α��� ����" ���
		Scanner sc = new Scanner(System.in);
		InputData d = new InputData();
		System.out.print("���̵� : ");
		String ID = sc.nextLine();
		
		System.out.print("�� ȣ : ");
		String passWd = sc.nextLine();
		
		for (int i = 0; i < d.customer.length; i++) {
			if (ID.equals(d.customer[i].getID())) {
				if (passWd.equals(d.customer[i].getPassWd())) {
					System.out.println("�α��� ����");
					return;
				} else {
					System.out.println("��ȣ�� ��ġ���� ����");
					return;
				}
			}
		}
		
		System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
		
	}

}
