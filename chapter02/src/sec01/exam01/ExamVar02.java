// ������� : 1���� 365.2422���̴�. �̰��� �� �ð� �� �ʷ� ��Ÿ����
package sec01.exam01;

public class ExamVar02 {

	public static void main(String[] args) {
		
		double days = 365.2422;
		int day = (int)days;
		
		double hours = (days - day) * 24;
		int hour = (int)hours;
		
		double minutes = (hours - hour) * 60;
		int minute = (int)minutes;
		
		double seconds = (minutes - minute) * 60;
		int second = (int)seconds;
		System.out.println("1���� " + day + "��" + hour + "�ð�" + minute + "��" + second + "�� �Դϴ�.");
		 
	}

}
