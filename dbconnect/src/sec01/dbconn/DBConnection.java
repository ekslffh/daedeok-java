package sec01.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

public class DBConnection {
	// java와 oracle 연동
		/* 1) JDBC 드라이버파일(ojdbc6.jar)등록
		 * 	  - '프로젝트'에서 마우스 우클릭 후 'properties' 선택
		 * 	  - 우측에서 'Java Build Path' 선택
		 * 	  - 오른쪽에서 'libraries' 선택
		 * 	  - 'Add External JARs' 선택 후 ojdbc.jar파일을 찾아 선택
		 * 
		 * 2) connection 객체
		 * 	  - URL, (사용자 ID, 암호 => db)
		 * 		=> URL : "jdbc:oracle:thin:@ipv4 address | localhost(127.0.0.1):1521:xe"
		 * 	  - DriverManager class의 getInstance메서드 사용
		 * 	  	DriverManager.getInstance(URL, 사용자 ID, 암호)
		 * 
		 * 3) 명령어 객체 생성
		 * 	 - Statement 
		 * 	 - 고정된 값을 처리하는 쿼리 수행
		 * 	 - Statement참조변수=connection참조변수.createStatement();
		 * 
		 * 4) 쿼리수행
		 * 	 - ResultSet객체(결과객체)
		 * 	 - ResultSet객체참조변수=명령어객체.executeQuery(sql문); => select문
		 * 	 - ResultSet개체참조변수=명령어객체.updatQuery(sql문); => DML문
		 */
	
	private final String URL = "jdbc:oracle:thin:@localhost(127.0.0.1):1521:xe";
	private final String USER = "basicjava";
	private final String PASSWORD = "java";
	
	private Connection conn = null;
	private ResultSet rs = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	
	public List<Map<String, Object>> seletList(String sql) {
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return null;
	}
	
	
}
