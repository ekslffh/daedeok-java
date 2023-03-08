package util;
import java.util.Map;

import controller.Controller;

public class Common {
	
	
	public static boolean isLogin() {
		if(Controller.sessionStorage.get("loginInfo") == null) {
			return false;
		}else {
			return true;
		}
	}

	public static boolean isAdminLogin() {
		if(Controller.sessionStorage.get("adminLoginInfo") == null) {
			
			return false;
		}else {
			return true;
		}
	}
	
	
	public static Map<String, Object> loginInfo() {
		Object o = Controller.sessionStorage.get("loginInfo");

		Map<String, Object> loginInfo = (Map<String, Object>) o;
		return loginInfo;
	}
	
	
	public static Map<String, Object> adminLoginInfo(){
		Object o = Controller.sessionStorage.get("adminLoginInfo");

		Map<String, Object> adminLoginInfo = (Map<String, Object>) o;
		return adminLoginInfo;
		
	}
	
	
	
}
