package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {
	// 싱글톤 패턴
	private static JDBCUtil instance = null;
	private JDBCUtil() {}
	
	public static JDBCUtil getInstance() {
		if (instance == null) {
			instance = new JDBCUtil();
		}
		return instance;
	}
	
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "pc20";
	private final String PASSWORD = "java";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public List<Map<String, Object>> selectList(String sql, List<Object> param) {
		List<Map<String, Object>> result = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				pstmt.setObject(i + 1, param.get(i));
			}
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			while (rs.next()) {
				if (result == null) {
					result = new ArrayList<>();
					Map<String, Object> row = new HashMap<>();
					for (int i = 0; i <= columnCount; i++) {
						String key = rsmd.getColumnLabel(i);
						Object value = rs.getObject(i);
						row.put(key, value);
					}
					result.add(row);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {}
			}
		}
		return result;
	}

}
