package sec01.dbconn;

import java.util.Scanner;

public class DBConnectionTest {

	public static void main(String[] args) {
		DBConnection db1 = new DBConnection();
//		String sql = "SELECT * FROM LIB_MEMBER";
//		db1.selectList(sql);
		
//		String sql = "INSERT INTO LIB_MEMBER(MEM_NUMBER, MEM_ID, MEM_PASS) "
//				+ "VALUES(1, 'a001', '12345')";
		
//		String sql = "INSERT INTO LIB_MEMBER(MEM_NUMBER, MEM_ID, MEM_PASS) "
//				+ "VALUES(2, 'b001', '**!213')";
		
//		String sql = "INSERT INTO LIB_MEMBER(MEM_NUMBER, MEM_ID, MEM_PASS) "
//				+ "VALUES(seq_num.nextVal, 'b001', '**!213')";
		
//		StringBuffer sql = new StringBuffer();
//		sql.append("UPDATE LIB_MEMBER ");
//		sql.append("SET MEM_ID='c001', ");
//		sql.append("MEM_PASS='d1234!' ");
//		sql.append("WHERE MEM_NUMBER=3");
		
//		String[] param = new String[2];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int param = Integer.parseInt(sc.nextLine()); 
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM LIB_MEMBER ");
		sql.append("WHERE MEM_NUMBER = ?");
		db1.selectOne(sql.toString(), param);
		
//		System.out.print("아이디 입력 : ");
//		param[0] = sc.nextLine();
//		System.out.print("암호 입력 : ");
//		param[1] = sc.nextLine();
//		
//		StringBuffer sql = new StringBuffer();
//		sql.append("INSERT INTO LIB_MEMBER(MEM_NUMBER, MEM_ID, MEM_PASS) ");
//		sql.append("VALUES(seq_num.nextval, ?, ?)");
//		
//		int res = db1.update(sql.toString(), param);
//		if (res == 1) {
//			System.out.println("수행 성공");
//		} else {
//			System.out.println("수행 실패");
//		}
		
	}

}
