package lang.object;

import java.util.Date;

public class ExampleDate {

	public static void main(String[] args) {
		/**
		 * Date class
		 * �ð�����(����ú���)�� �и��� ������ �������
		 * DateFormat Ŭ������ �̿��Ͽ� ��¥�� �������Ͽ� ���
		 * 1) getTime() -> 1970.01.01���� ���� ���� ��¥�� longŸ���� �и��� ������ ��ȯ
		 * 2) setTime(long time) - �Էµ� 'time'���� 1970.01.01
		 * 	  GMT ������ Date �ð��� �и��ʷ� ��Ÿ���� �ν��Ͻ� ����
		 * 3) toString() : ���� Ÿ���� �������� Date�� �ڷḦ ���
		 * 	  dow mon dd hh : mm : ss zzz yyyy
		 */
		Date now = new Date();
		System.out.println("����ð� : " + now.getTime());
		
		Date d1 = new Date(1678339033850L);
		System.out.println(d1);
		System.out.println(d1.getMonth() + 1);
		
	}

}
