package controller;

import java.util.HashMap;
import java.util.Map;


import service.MemberService;
import util.ScanUtil;
import util.View;

public class Controller {

	public static Map<String, Object> sessionStorage = new HashMap<>();

	MemberService memberservice = MemberService.getInstance();


	public static void main(String[] args) {
		new Controller().start();
	}

	private void start() {
		int view = View.HOME;
		while (true) {
			switch (view) {
			case View.HOME:
				view = home();
				break;
			case View.MEMBER_LOGIN:
				view = memberservice.logIn();
				break;
			case View.MEMBER_SIGNUP:
				view = memberservice.signUp();
				break;
			case View.ADMIN_LOGIN:
				view = memberservice.adminLogIn();
				break;
			case View.MEMBER_LOGOUT:
				view = memberservice.logOut();
				break;
			}
		}
	}

	private int home() {

		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━〔 회원관리 〕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃                ① 로그인          ② 회원 가입          ③ 관리자 접속           ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.print(" 【  선택  】 ");
		switch (ScanUtil.nextInt()) {
		case 1:
			return View.MEMBER_LOGIN;
		case 2:
			return View.MEMBER_SIGNUP;
		case 3:
			return View.ADMIN_LOGIN;
		default:
			return View.HOME;
		}

	}

}