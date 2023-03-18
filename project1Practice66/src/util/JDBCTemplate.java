package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	private static JDBCTemplate instance = null;
	public JDBCTemplate() {}
	
	public static JDBCTemplate getInstance() {
		if(instance == null) {
			instance = new JDBCTemplate();
		}
		return instance;
	}
	
	public Connection getConnection() {
		Connection conn=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//공식, try catch 블럭에 삽입
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
			e.printStackTrace();
		}
		String URL="jdbc:oracle:thin:@localhost:1521:xe";
		String USER="loop";
		String PASSWORD="java";
		
		try {
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//db종료
	public static void close(Statement stmt) {
		try{
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try{
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn) {
		try{
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection conn) {
		try{
			conn.commit();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try{
			conn.rollback();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
