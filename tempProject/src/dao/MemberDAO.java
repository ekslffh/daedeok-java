package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dto.MemberDTO;
import util.JDBCTemplate;

public class MemberDAO {
	
private JDBCTemplate util = JDBCTemplate.getInstance();
	
	public List<MemberDTO> selectList() {
		List<MemberDTO> list = new ArrayList<>();
		// 드라이버 연결
		Connection conn = util.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
//		String sql = "SELECT M_ID, M_PW, M_NAME, M_TELNO, M_ADD, M_MILEAGE FROM MEMBER ";
		String sql = "SELECT * FROM MEMBER ";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			//M_ID, M_PW, M_NAME, M_TELNO, M_ADD
			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("M_ID"));
				dto.setPw(rs.getString("M_PW"));
				dto.setName(rs.getString("M_NAME"));
				dto.setTel(rs.getString("M_TELNO"));
				dto.setAddress(rs.getString("M_ADD"));
				dto.setMileage(rs.getInt("M_MILEAGE"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(rs);
			util.close(stmt);
			util.close(conn);
		}

		return list;
	}

}
