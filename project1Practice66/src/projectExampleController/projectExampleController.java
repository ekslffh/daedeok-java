package projectExampleController;

import java.util.Scanner;

import projectExamplaDTO.projectExampleDTO;
import projectExampleDao.projectExampleDAO;

public class projectExampleController {
	private static final String y = null;
	private static Scanner sc = new Scanner(System.in);
	private static projectExampleDAO dao = new projectExampleDAO();
	private static String mId;

	public static int getMenu() {
		int select = 0;
		StringBuffer sb = new StringBuffer();

		sb.append("--------------- ������ ���� ----------------------------\n");
		sb.append("\n");
		sb.append("-----------------------------------------------------\n");
		sb.append("1.�α��� | 2.ȸ������ | 3.ID/PW ã�� | 4.ȸ��Ż�� | 5.����\n");
		sb.append("-----------------------------------------------------\n");
		sb.append("���ǹ����� ���Ű� ȯ���մϴ� !\n");
		sb.append("���Ͻô� ��ȣ�� ������ �ּ��� 'u' : ");
		System.out.print(sb);

		select = Integer.parseInt(sc.nextLine());

		return select;
	}

	public static void main(String[] args) {
		int no = 0;
		
		do {
			no = getMenu();
			switch (no) {
			case 1:
				System.out.println("�α���");
				
				break;
			case 2:
				System.out.println("ȸ������");
				insert();
				break;
			case 3:
				System.out.println("ID/PW ã��");
				
				break;
			case 4:
				System.out.println("ȸ�� Ż��");
				delete();
				break;
			case 5:
				System.out.println("����");
				sc.close();
				break;
			}

		} while (no != 5);
	}
	
	public static void insert() {
		System.out.println("ȸ�������� �����մϴ�.");
		//do {
			System.out.print("���̵� �Է��Ͻÿ� : ");
			String mId = sc.nextLine();
		//}while(mId.length() > 5);
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		String mPw = sc.nextLine();
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String mName = sc.nextLine();
		System.out.print("��ȭ��ȣ�� �Է��Ͻÿ� :");
		String mTelno = sc.nextLine();
		System.out.print("�ּҸ� �Է��Ͻÿ� : ");
		String mAdd = sc.nextLine();
		
		projectExampleDTO dto = new projectExampleDTO(mId, mPw, mName, mTelno, mAdd);
		
		if(dao.insert(dto) > 0) {
			System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
		}else {
			System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
		}
		System.out.println(dto);
	}
	
	public static void delete() {
		System.out.print("���̵� �Է��Ͻÿ� : ");
		String mid = sc.nextLine();
		//System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		//String mpw = sc.nextLine();
		System.out.print("���� �����Ͻðڽ��ϱ�? (Y / N) : ");
		char yn =  sc.nextLine().charAt(0);	
		
		if(yn == 'y') {
			if(dao.delete(mid) > 0) {
				System.out.println("Ż���ϼ̽��ϴ�.");
				getMenu();
			}else {
				System.out.println("Ż�����.");
				getMenu();
			}
		}else{
			System.out.println("Ż�� ����ϼ̽��ϴ�.");
			getMenu();
		}
	}
}
