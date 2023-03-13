package controller;

import java.util.List;
import java.util.Scanner;

import dao.LibMemberDAO;
import dto.LibMemberDTO;

public class LibMemberController {
	private static Scanner sc = new Scanner(System.in);
	private static LibMemberDAO dao = new LibMemberDAO();
	
	public static int getMenu() {
		int select = 0;
		StringBuffer sb = new StringBuffer();
		
		sb.append("1. 전체출력\n");
		sb.append("2. 선택출력\n");
		sb.append("3. 추   가\n");
		sb.append("4. 수   정\n");
		sb.append("5. 삭   제\n");
		sb.append("6. 종   료");
		System.out.println(sb);
		System.out.println("=======================");
		System.out.print("작업번호 입력 : ");
		select = Integer.parseInt(sc.nextLine());
		
		return select;
	}
	
	public static void main(String[] args) {
		int no = 0;
		
		do {
			no = getMenu();
			switch (no) {
			case 1:
				System.out.println("전체출력");
				selectList();
				break;
			case 2:
				System.out.println("선택출력");
				selectOne();
				break;
			case 3:
				System.out.println("추   가");
				insert();
				break;
			case 4:
				System.out.println("수   정");
				update();
				break;
			case 5:
				System.out.println("삭   제");
				delete();
				break;
			case 6:
				System.out.println("종   료");
				sc.close();
				System.exit(1);
			}
		} while (true);
		
	}
	
	private static void selectList() {
		List<LibMemberDTO> list = dao.selectList();
		for (LibMemberDTO dto : list) {
			System.out.println(dto);
		}
	}
	
	private static void selectOne() {
		System.out.print("검색할 회원번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		LibMemberDTO dto = dao.selectOne(num);
		System.out.println(dto);
	}
	
	private static void insert() {
		System.out.print("아이디 : ");
		String mid = sc.nextLine();
		System.out.print("이름 : ");
		String mname = sc.nextLine();
		
		LibMemberDTO dto = new LibMemberDTO(0, mid, mname);
		
		if (dao.insert(dto) > 0) {
			System.out.println("삽입 성공");
		} else {
			System.out.println("삽입 실패");
		}
		System.out.println(dto);
	}
	
	private static void update() {
		System.out.print("수정할 회원번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		String mid = null;
		String mname = null;
		System.out.print("아이디 수정[i], 이름수정[n], 모두수정[a] : ");
		String choice = sc.nextLine();
		
		if (choice.equals("i")) {
			System.out.print(" 아이디 : ");
			mid = sc.nextLine();
		} else if (choice.equals("n")) {
			System.out.print(" 이  름 : ");
			mname = sc.nextLine();
		} else if (choice.equals("a")) {
			System.out.print(" 아이디 : ");
			mid = sc.nextLine();
			System.out.print(" 이  름 : ");
			mname = sc.nextLine();
		}
		
		LibMemberDTO dto = new LibMemberDTO(num, mid, mname);
		
		if (dao.update(dto) > 0) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
		System.out.println(dto);
	}

	private static void delete() {
		System.out.print("삭제할 회원번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (dao.delete(num) > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}
	
}
