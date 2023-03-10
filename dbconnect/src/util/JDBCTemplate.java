package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {
	// 싱글톤 패턴으로 연결객체 생성
	private static JDBCTemplate instance = null;
	private JDBCTemplate() {}
	public static JDBCTemplate getInstance() {
		if (instance == null) instance = new JDBCTemplate();
		return instance;
	}
	
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "basicjava";
	private final String PASSWORD = "java";
	
	Connection conn = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
