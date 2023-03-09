package lang.object;

public class ExampleStringBuffer {

	public static void main(String[] args) {
		// StringBuffer와 StringBuilder는 String과 비슷하나
		// 저장된 문자열을 수정할 수 있음
		// StringBuffer : 스레드 이용시 발생될 수 있는 동기화 문제도
		// 해결된 안전한 사용가능
		// StringBuilder : 단일 클래스에 적합하나 스레드에는 안전하지 않음
		// StringBuffer 주요메서드
		// 1) append(여러타입 데이터) - 저장된 문자열에 추가
		// 2) delete(int start, int end) - start부터 end-1번까지 문자 삭제
		// 3) deleteCharAt(int idx) - idx 번째 문자 삭제
		// 4) insert(int offset, 데이터) - offset 위치에 '데이터' 저장
		// 5) reverse() - 저장된 문자열의 문자를 역순으로 반환
		// 6) toString() - String 타입으로 변환
		
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM member ");
		sql.append("where mem_id = 'a001';");
		
		sql.deleteCharAt(7);
		sql.insert(7, '*');
		String sqlStr = sql.toString();
		
		StringBuilder sb = new StringBuilder(sqlStr);
		
		System.out.println(sql);
		System.out.println(sql.reverse());
		
		System.out.println(sb);
		
		DBConnService dbConnService = new DBConnService();
//		dbConnService.select(sqlStr);
		dbConnService.selectAll();
		
	}

}
