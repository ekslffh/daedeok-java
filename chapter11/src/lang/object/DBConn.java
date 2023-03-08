package lang.object;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	// 1) private ���������ڷ� �ڱ� ��ü���� ������ �������� ����
	private static Connection conn = null;

	// 2) �����ڸ� private Ÿ������ ����
	private DBConn() {
		
	}
	// 3) �ܺο��� ȣ���� public ���������ڸ� ���� ���� �޼���(getInstance())����
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
