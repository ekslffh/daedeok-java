package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dto.LibMemberDTO;
import util.JDBCTemplate;

// db자료에 대한 단일 작업(비지니스 로직) 구현
// 결과를 DTO(VO)에 담아 반환
// db 연결은 util패키지 template class등에서 설정
public class LibMemberDAO {
	private JDBCTemplate util = JDBCTemplate.getInstance();
	
	public List<LibMemberDTO> selectList() {
		List<LibMemberDTO> list = new ArrayList<>();
		// 드라이버 연결
		Connection conn = util.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT MEM_NUM, MEM_ID, MEM_NAME FROM LIB_MEMBER ";
//		stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery(sql);
			rs.last();      

			System.out.println("row : " + rs.getRow());
	        rs.beforeFirst();

			while (rs.next()) {
				LibMemberDTO dto = new LibMemberDTO();
				dto.setMem_num(rs.getInt("MEM_NUM"));
				dto.setMem_id(rs.getString("MEM_ID"));
				dto.setMem_name(rs.getString("MEM_NAME"));
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
	
	public LibMemberDTO selectOne(int num) {
		LibMemberDTO dto = new LibMemberDTO();
		
		Connection conn = util.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT MEM_NUM, MEM_ID, MEM_NAME FROM LIB_MEMBER "
				+ "WHERE MEM_NUM = " + num;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				dto.setMem_num(rs.getInt("MEM_NUM"));
				dto.setMem_id(rs.getString("MEM_ID"));
				dto.setMem_name(rs.getString("MEM_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(rs);
			util.close(stmt);
			util.close(conn);
		}
		return dto;
	}
	
	// 추가
	public int insert(LibMemberDTO dto) {
		Connection conn = util.getConnection();
		PreparedStatement pstmt = null;
		int res = 0;
		
		String sql = "INSERT INTO LIB_MEMBER(MEM_NUM, MEM_ID, MEM_NAME) VALUES(seq_num.nextval, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMem_id());
			pstmt.setString(2, dto.getMem_name());
			
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(pstmt);
			util.close(conn);
		}
		return res;
	}

	// 수정
	public int update(LibMemberDTO dto) {
		Connection conn = util.getConnection();
		PreparedStatement pstmt = null;
		int res = 0;
		
		String sql1 = "UPDATE LIB_MEMBER "
				+    " SET MEM_ID = ?,"
				+        " MEM_NAME = ? "
				+ 	 " WHERE MEM_NUM = ?";
		
		String sql2 = "UPDATE LIB_MEMBER "
				+    " SET MEM_ID = ? "
				+ 	 " WHERE MEM_NUM = ?";
		
		String sql3 = "UPDATE LIB_MEMBER "
				+    " SET MEM_NAME = ? "
				+ 	 " WHERE MEM_NUM = ?";
		
		try {
			if (dto.getMem_id() != null && dto.getMem_name() != null ) {
				pstmt = conn.prepareStatement(sql1);
				pstmt.setString(1, dto.getMem_id());
				pstmt.setString(2, dto.getMem_name());
				pstmt.setInt(3, dto.getMem_num());
			} else if (dto.getMem_id() != null) {
				pstmt = conn.prepareStatement(sql2);
				pstmt.setString(1, dto.getMem_id());
				pstmt.setInt(2, dto.getMem_num());

			} else {
				pstmt = conn.prepareStatement(sql3);
				pstmt.setString(1, dto.getMem_name());
				pstmt.setInt(2, dto.getMem_num());
			}
			
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(pstmt);
			util.close(conn);
		}
		return res;
	}

	// 삭제
	public int delete(int num) {
		Connection conn = util.getConnection();
		PreparedStatement pstmt = null;
		int res = 0;
		
		String sql = "DELETE FROM LIB_MEMBER WHERE MEM_NUM = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			res = pstmt.executeUpdate();
			if (res > 0) {
				util.commit(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(pstmt);
			util.close(conn);
		}
		return res;
	}

}
