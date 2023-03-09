package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class MemberDAO {
	private static MemberDAO instance = null;
	private MemberDAO () {}
	public static MemberDAO getInstance() {
		if(instance == null) instance = new MemberDAO();
		return instance;
	}
	
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	
	public Map<String, Object> login(List<Object> param) {
		String sql = "SELECT * FROM LIB_MEMBER "
				+ "WHERE MEM_ID = ? AND MEM_PASS = ?";	
		return jdbc.selectOne(sql, param);
	}
	
	
	public int signUp(List<Object> param) {
		String sql = "INSERT INTO LIB_MEMBER "
				+ " (MEM_NUMBER, MEM_ID, MEM_NAME, MEM_PASS) "
				+ " VALUES "
				+ " (SEQ_LIB_MEMBER.NEXTVAL, ?, ?, ?) ";
		return jdbc.update(sql, param);
		
	}
	
	
	public Map<String, Object> adminLogin(List<Object> param) {
		String sql = "SELECT * FROM ADMIN "
				+ "WHERE ADMIN_ID = ? AND ADMIN_PASS = ?";	
		return jdbc.selectOne(sql, param);
	}
	
	
	public List<Map<String, Object>> getListAll() {
		String sql = "SELECT * FROM LIB_MEMBER ORDER BY MEM_NUMBER ASC";
		return jdbc.selectList(sql);
	}
	
	
	public int modifyMember(String columnName, List<Object> param) {
		String sql = "UPDATE LIB_MEMBER SET " + columnName + "= ? WHERE MEM_ID = ?";
		return jdbc.update(sql, param);
	}
	
	
	public Map<String, Object> getMemInfo(String i) {
		String sql = "SELECT * FROM LIB_MEMBER WHERE MEM_ID ='" + i + "'";
		return jdbc.selectOne(sql);
	}
	
	
	public int deleteMember(String input) {
		String sql = "DELETE FROM LIB_MEMBER WHERE MEM_ID ='" + input + "'";
		return jdbc.update(sql);
	}
	
	
	public Map<String, Object> rentalCheck(String memInfo) {
		String sql = "SELECT * FROM RENTAL WHERE MEM_ID = '" + memInfo + "'";
		return jdbc.selectOne(sql);
	}
	
	
	
}
