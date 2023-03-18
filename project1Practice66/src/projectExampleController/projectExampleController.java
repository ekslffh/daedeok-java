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

		sb.append("--------------- 루피의 버스 ----------------------------\n");
		sb.append("\n");
		sb.append("-----------------------------------------------------\n");
		sb.append("1.로그인 | 2.회원가입 | 3.ID/PW 찾기 | 4.회원탈퇴 | 5.종료\n");
		sb.append("-----------------------------------------------------\n");
		sb.append("루피버스에 오신걸 환영합니다 !\n");
		sb.append("원하시는 번호를 선택해 주세요 'u' : ");
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
				System.out.println("로그인");
				
				break;
			case 2:
				System.out.println("회원가입");
				insert();
				break;
			case 3:
				System.out.println("ID/PW 찾기");
				
				break;
			case 4:
				System.out.println("회원 탈퇴");
				delete();
				break;
			case 5:
				System.out.println("종료");
				sc.close();
				break;
			}

		} while (no != 5);
	}
	
	public static void insert() {
		System.out.println("회원가입을 시작합니다.");
		//do {
			System.out.print("아이디를 입력하시오 : ");
			String mId = sc.nextLine();
		//}while(mId.length() > 5);
		System.out.print("비밀번호를 입력하시오 : ");
		String mPw = sc.nextLine();
		System.out.print("이름을 입력하시오 : ");
		String mName = sc.nextLine();
		System.out.print("전화번호를 입력하시오 :");
		String mTelno = sc.nextLine();
		System.out.print("주소를 입력하시오 : ");
		String mAdd = sc.nextLine();
		
		projectExampleDTO dto = new projectExampleDTO(mId, mPw, mName, mTelno, mAdd);
		
		if(dao.insert(dto) > 0) {
			System.out.println("회원가입에 성공하였습니다.");
		}else {
			System.out.println("회원가입에 실패하였습니다.");
		}
		System.out.println(dto);
	}
	
	public static void delete() {
		System.out.print("아이디를 입력하시오 : ");
		String mid = sc.nextLine();
		//System.out.print("비밀번호를 입력하시오 : ");
		//String mpw = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까? (Y / N) : ");
		char yn =  sc.nextLine().charAt(0);	
		
		if(yn == 'y') {
			if(dao.delete(mid) > 0) {
				System.out.println("탈퇴하셨습니다.");
				getMenu();
			}else {
				System.out.println("탈퇴실패.");
				getMenu();
			}
		}else{
			System.out.println("탈퇴를 취소하셨습니다.");
			getMenu();
		}
	}
}
