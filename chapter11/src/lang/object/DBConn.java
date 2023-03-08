package lang.object;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	// 1) private 접근지정자로 자기 객체참조 변수를 정적으로 선언
	private static Connection conn = null;

	// 2) 생성자를 private 타입으로 생성
	private DBConn() {
		
	}
	// 3) 외부에서 호출할 public 접근지정자를 갖는 정적 메서드(getInstance())생성
	public static Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc20";
		String pwd = "java";
		
		try {
			if (conn == null) {
				DBConn d = new DBConn();
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url,user,pwd);
			} 
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	
}
