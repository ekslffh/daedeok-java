package lang.object;

public class ExampleStringBuffer {

	public static void main(String[] args) {
		// StringBuffer�� StringBuilder�� String�� ����ϳ�
		// ����� ���ڿ��� ������ �� ����
		// StringBuffer : ������ �̿�� �߻��� �� �ִ� ����ȭ ������
		// �ذ�� ������ ��밡��
		// StringBuilder : ���� Ŭ������ �����ϳ� �����忡�� �������� ����
		// StringBuffer �ֿ�޼���
		// 1) append(����Ÿ�� ������) - ����� ���ڿ��� �߰�
		// 2) delete(int start, int end) - start���� end-1������ ���� ����
		// 3) deleteCharAt(int idx) - idx ��° ���� ����
		// 4) insert(int offset, ������) - offset ��ġ�� '������' ����
		// 5) reverse() - ����� ���ڿ��� ���ڸ� �������� ��ȯ
		// 6) toString() - String Ÿ������ ��ȯ
		
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
