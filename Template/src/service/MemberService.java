package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import controller.Controller;
import dao.MemberDAO;
import util.Common;
import util.ScanUtil;
import util.SpaceUtil;
import util.View;



public class MemberService {
	
	private static MemberService instance = null;
	private MemberService () {}
	public static MemberService getInstance() {
		if(instance == null) instance = new MemberService();
		return instance;
	}
	
	MemberDAO memberDAO = MemberDAO.getInstance();
	
	
	public int logIn() {
		System.out.println("== 로그인 ==");
		System.out.print("ID >> ");
		String memId = ScanUtil.nextLine();
		System.out.print("비밀번호 >> ");
		String memPass = ScanUtil.nextLine();
		
		List<Object> param = new ArrayList<>();
		param.add(memId);
		param.add(memPass);
		
		Map<String, Object> memberInfo = memberDAO.login(param);
		
		if(memberInfo == null) {
			System.out.println("사용자 ID 혹은 비밀번호가 일치하지 않습니다");
			return View.HOME;
		} else {
			Controller.sessionStorage.put("loginInfo", memberInfo);
			System.out.println(memberInfo.get("MEM_NAME") + "님 환영합니다.");
			System.out.println("다음 화면으로 이동하려면 Enter 키를 입력하세요.");
			ScanUtil.nextLine();
			return View.HOME_MAIN;
		
		}
	
	}
	
	
	public int signUp() {
		System.out.println(" -- 회원 가입 --");
		System.out.print("ID >> ");
		String memId = ScanUtil.nextLine();
		System.out.print("이름 >> ");
		String memName = ScanUtil.nextLine();
		System.out.print("비밀번호 >> ");
		String memPass = ScanUtil.nextLine();
		
		List<Object> param = new ArrayList<Object>();
		param.add(memId);
		param.add(memName);
		param.add(memPass);
		
		int result = memberDAO.signUp(param);
		
		if(result > 0) {
			System.out.println("회원가입 성공");
			return View.MEMBER_LOGIN;
		}else {
			System.out.println("회원 가입이 정상적으로 되지 않았습니다.");
			return View.HOME;
		}
	
	}
	
	
	public int adminLogIn() {
		System.out.println("== 관리자 로그인 ==");
		System.out.print("관리자 ID >> ");
		String memId = ScanUtil.nextLine();
		System.out.print("관리자 비밀번호 >> ");
		String memPass = ScanUtil.nextLine();
		
		List<Object> param = new ArrayList<>();
		param.add(memId);
		param.add(memPass);
		
		Map<String, Object> memberInfo = memberDAO.adminLogin(param);
		
		if(memberInfo == null) {
			System.out.println("사용자 ID 혹은 비밀번호가 일치하지 않습니다");
			return View.HOME;
		} else {
			Controller.sessionStorage.put("adminLoginInfo", memberInfo);
			System.out.println(memberInfo.get("ADMIN_ID") + "님 환영합니다.");
			System.out.println("다음 화면으로 이동하려면 Enter 키를 입력하세요.");
			ScanUtil.nextLine();
			return View.HOME_MAIN;
		
		}
	}
	
	
	public int libMemModify() {
		if(! Common.isAdminLogin()) {
			System.out.println();
			System.out.println("                ┌-----------------------------------------┐");
			System.out.println("                │          !  잘못된 접근입니다  !        │");
			System.out.println("                └-----------------------------------------┘");
			System.out.println();
			System.out.println("                                                   (다음 이동 : enter키 입력)");
			ScanUtil.nextLine();
			return View.HOME_MAIN;}
		
		Map<String, Object> member;
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("변경할 회원의 ID를 입력하세요 >> ");
		String input = ScanUtil.nextLine();
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		member = memberDAO.getMemInfo(input);
		if(input == null) {
			System.out.println();
			System.out.println("                ┌-----------------------------------------┐");
			System.out.println("                │         !  잘못 입력되었습니다  !       │");
			System.out.println("                └-----------------------------------------┘");
			System.out.println();
			System.out.println("                                                   (다음 이동 : enter키 입력)");
			ScanUtil.nextLine();;
			return View.LIB_MEM_MODIFY;
		}
		
		
		else {			
			String columnName = "";
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃                 변경할 내용을 선택하세요                  ┃");
			System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
			System.out.println("┃    1. 회원ID  2. 회원이름  3. 회원비밀번호  0. 전 화면    ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.print(" 【  선택  】 ");
			switch(ScanUtil.nextInt()) {
			case 1: columnName = "MEM_ID"; break;
			case 2: columnName = "MEM_NAME"; break;
			case 3: columnName = "MEM_PASS"; break;
			case 0: default: return View.LIB_MEM_MANAGE;
			}
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.print(" 변경 내용을 입력하세요. >>");
			String value = ScanUtil.nextLine();
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			
			
			
			List<Object> param = new ArrayList<>();
			param.add(value);
			param.add(input);
			
			int result = memberDAO.modifyMember(columnName, param);
			
			if (result > 0) {
				System.out.println();
				System.out.println("                ┌-----------------------------------------┐");
				System.out.println("                │          ※   수정 되었습니다  ※         │");
				System.out.println("                └-----------------------------------------┘");
				System.out.println();
				System.out.println("                                                   (다음 이동 : enter키 입력)");
				ScanUtil.nextLine();
			}else {
				System.out.println();
				System.out.println("                ┌----------------------------------------------------------------┐");
				System.out.println("                │          ※   수정이 정상적으로 수행되지 않았습니다.  ※         │");
				System.out.println("                └----------------------------------------------------------------┘");
				System.out.println();
				System.out.println("                                                   (다음 이동 : enter키 입력)");
				ScanUtil.nextLine();
			}
			
		}
		return View.LIB_MEM_MANAGE;
		
	}
	
	
	public int libMemResign() {
		if(! Common.isAdminLogin()) {
			System.out.println();
			System.out.println("                ┌---------------------------------------------┐");
			System.out.println("                │          ※   잘못 입력하셨습니다  ※         │");
			System.out.println("                └---------------------------------------------┘");
			System.out.println();
			System.out.println("                                                   (다음 이동 : enter키 입력)");
			ScanUtil.nextLine();
			return View.HOME_MAIN;}
		
		Map<String, Object> member;
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("탈퇴할 회원의 ID를 입력하세요. >>");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		String input = ScanUtil.nextLine();
		member = memberDAO.getMemInfo(input);
		if(member == null) {
			System.out.println("회원이 존재하지 않습니다.");
		}	
		else {			
			int result = memberDAO.deleteMember(input);
			
			if (result > 0) {
				System.out.println();
				System.out.println("                ┌----------------------------------------┐");
				System.out.println("                │          ※   삭제되었습니다  ※         │");
				System.out.println("                └----------------------------------------┘");
				System.out.println();
				System.out.println("                                                   (다음 이동 : enter키 입력)");
				ScanUtil.nextLine();
			}else {
				System.out.println();
				System.out.println("                ┌---------------------------------------------------------------┐");
				System.out.println("                │          ※   삭제가 정상적으로 처리되지 않았습니다  ※         │");
				System.out.println("                └---------------------------------------------------------------┘");
				System.out.println();
				System.out.println("                                                   (다음 이동 : enter키 입력)");
				ScanUtil.nextLine();
			}
			
		}
		return View.LIB_MEM_MANAGE;
		
	}
	
	
	public int logOut() {
		if(Common.loginInfo() == null && 
				Common.adminLoginInfo() == null) {
			System.out.println("로그아웃 상태입니다.");
			return View.HOME_MAIN;
		} else {
			if(! Common.isAdminLogin()){
				Map <String, Object> memInfo = (Map<String, Object>) Controller.sessionStorage.get("loginInfo");
				System.out.println(memInfo.get("MEM_NAME") + "님 안녕히 가세요!");
				Controller.sessionStorage.remove("loginInfo");
			return View.HOME;
			} else {
				Map <String, Object> memInfo = (Map<String, Object>) Controller.sessionStorage.get("adminLoginInfo");
				System.out.println("관리자님 안녕히 가세요!");
				Controller.sessionStorage.remove("adminLoginInfo");
				return View.HOME;
			}
		} 
	}
	
	
	public int libMemManage() {
		if(! Common.isAdminLogin()) {
			System.out.println("잘못된 접근입니다.");
			return View.HOME_MAIN;
		}else {	
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃회원번호   회원 ID      회원 이름     비밀번호┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			
			List<Map<String, Object>> list = null;
			
			list = memberDAO.getListAll();
			
			if (list == null) {
				System.out.println("등록된 회원이 없습니다");
			} else {
				for (int i = 0; i < list.size(); i++) {
					Map<String, Object> row = list.get(i);

					String str = "";
					str += SpaceUtil.format(row.get("MEM_NUMBER") + " ", 10, 1);
					str += SpaceUtil.format(row.get("MEM_ID") + " ", 15, 0);
					str += SpaceUtil.format(row.get("MEM_NAME") + " ", 15, 0);
					str += SpaceUtil.format(row.get("MEM_PASS") + " ", 10, 0);
					System.out.println(str);
				}
			}	
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃   1. 회원정보수정  2. 회원탈퇴  0. 전 화면   ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.print("선택 >> ");
		switch(ScanUtil.nextInt()){
		case 1: return View.LIB_MEM_MODIFY;
		case 2: return View.LIB_MEM_RESIGN;
		case 0: return View.LIB_MANAGE;	
		default:
			System.out.println("잘못 입력하셨습니다.");
			return View.LIB_MEM_MANAGE;
		}
		}
	}
	
}
