package sec01.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	// java와 oracle 연동
	/*
	 * 1) JDBC 드라이버파일(ojdbc6.jar)등록 - '프로젝트'에서 마우스 우클릭 후 'properties' 선택 - 우측에서
	 * 'Java Build Path' 선택 - 오른쪽에서 'libraries' 선택 - 'Add External JARs' 선택 후
	 * ojdbc.jar파일을 찾아 선택
	 * 
	 * 2) connection 객체 - URL, (사용자 ID, 암호 => db) => URL :
	 * "jdbc:oracle:thin:@ipv4 address | localhost(127.0.0.1):1521:xe" -
	 * DriverManager class의 getInstance메서드 사용 DriverManager.getInstance(URL, 사용자 ID,
	 * 암호)
	 * 
	 * 3) 명령어 객체 생성 - Statement - 고정된 값을 처리하는 쿼리 수행 -
	 * Statement참조변수=connection참조변수.createStatement();
	 * 
	 * 4) 쿼리수행 - ResultSet객체(결과객체) - ResultSet객체참조변수=명령어객체.executeQuery(sql문); =>
	 * select문 - ResultSet개체참조변수=명령어객체.updatQuery(sql문); => DML문
	 */

	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "basicjava";
	private final String PASSWORD = "java";

	private Connection conn = null;
	private ResultSet rs = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;

	public void selectList(String sql) {
//		sql = "SELECT * FROM LIB_MEMBER"
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int num = rs.getInt("mem_number");
				String id = rs.getString(2);
				String pass = rs.getString("mem_pass");

				System.out.printf("%5d   %8s %s \n", num, id, pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
		} finally {
			if (rs != null) {try {rs.close();} catch (Exception e) {}}
			if (stmt != null) {try {stmt.close();} catch (Exception e) {}}
			if (conn != null) {try {conn.close();} catch (Exception e) {}}
		}
	}
	
	public int update(String sql) {
		// "INSERT INTO ~"
		// "UPDATE ~ SET ~"
		// "DELETE FROM ~"
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql); // insert, update, delete 쿼리 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {try {rs.close();} catch (Exception e) {}}
			if (stmt != null) {try {stmt.close();} catch (Exception e) {}}
			if (conn != null) {try {conn.close();} catch (Exception e) {}}
		}
		return result;
	}
	
	public int update(String sql, String[] param) {
		// "INSERT INTO ~"
		// "UPDATE ~ SET ~"
		// "DELETE FROM ~"
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, param[0]);
			pstmt.setString(2, param[1]);
			result = pstmt.executeUpdate(); // insert, update, delete 쿼리 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {try {rs.close();} catch (Exception e) {}}
			if (stmt != null) {try {stmt.close();} catch (Exception e) {}}
			if (conn != null) {try {conn.close();} catch (Exception e) {}}
		}
		return result;
	}
	
	public void selectOne(String sql, int param) {
		// "SELECT * FROM LIB_MEMBER WHERE MEM_NUMBER = ? "
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, param);
			rs = pstmt.executeQuery();
			rs.next();
			System.out.println("회원번호 : " + rs.getInt("mem_number"));
			System.out.println("회원ID : " + rs.getString("mem_id"));
			System.out.println("암호 : " + rs.getString("mem_pass"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {try {rs.close();} catch (Exception e) {}}
			if (stmt != null) {try {stmt.close();} catch (Exception e) {}}
			if (conn != null) {try {conn.close();} catch (Exception e) {}}
		}
		
	}

}
