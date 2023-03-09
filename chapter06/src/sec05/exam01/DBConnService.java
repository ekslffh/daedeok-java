package sec05.exam01;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBConnService {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	public void selectAll() {
		try {
			conn();
			String sql = "SELECT mem_id, mem_name, mem_add1||' '|| ";
			sql = sql + " mem_add2 as addr FROM member ORDER BY 3";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String mid=rs.getString("mem_id");
				String mname=rs.getString("mem_name");
				String addr=rs.getString("addr");
				
				System.out.printf("%s\t %s\t %s\n",mid,mname,addr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {rs.close();}
				if(stmt!=null) {stmt.close();}
				if(conn!=null) {conn.close();}
			}catch(Exception e) {}
		}
	}

	public void conn() {
		try {
			conn = DBConn.getConnection();
			if (conn == null) {
				System.out.println("DB 연결 실패");
			} else {
				System.out.println("DB 연결 성공");
			}
		} catch (Exception e) {

		}

	}
}