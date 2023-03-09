package lang.object;

import java.util.Calendar;

public class ExampleCalendar {

	public static void main(String[] args) {
		/**
		 * Calendar
		 * �ڹٿ��� ����ϴ� ��¥�� �ð������� �����ϰ� �����ϴ� ����� �����ϴ� class
		 * Singleton pattern���� ���ǵǾ� �������� ��ü ������ �Ұ���
		 * 1) add() : ���޵� �ð������� Ư���ð��� ���ϰų� ���ҽ�Ű�� �޼ҵ�
		 * 2) get() : Calendar class�� ���(�ʵ�)�� ����� ���� ��ȯ
		 * 3) set() : Calendar class�� ������ ���� �Ҵ�
		 */
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.print(cal.get(Calendar.YEAR));
		System.out.print("�� " + cal.get(cal.get(Calendar.MONTH) + 1) + "�� ");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "�� ");
	}
	
}
