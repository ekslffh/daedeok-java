package projectExampleDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import projectExamplaDTO.projectExampleDTO;
import util.JDBCTemplate;

public class projectExampleDAO extends JDBCTemplate {
	private JDBCTemplate util = JDBCTemplate.getInstance();

	public int insert(projectExampleDTO dto) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int res = 0;
		String sql = " insert into member values(?, ?, ?, ?, ?, 0) ";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getM_id());
			pstmt.setString(2, dto.getM_pw());
			pstmt.setString(3, dto.getM_name());
			pstmt.setString(4, dto.getM_telno());
			pstmt.setString(5, dto.getM_add());

			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return res;
	}

	public int delete(String mid) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int res = 0;

		String sql = "delete from member where m_id = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);

			res = pstmt.executeUpdate();
			if (res > 0) {
				commit(conn);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return res;
	}
}
