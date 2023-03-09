package lang.object;

import java.util.Calendar;

public class ExampleCalendar {

	public static void main(String[] args) {
		/**
		 * Calendar
		 * 자바에서 사용하는 날짜와 시각정보를 관리하고 조작하는 기능을 제공하는 class
		 * Singleton pattern으로 정의되어 복수개의 개체 생성이 불가능
		 * 1) add() : 전달된 시각정보에 특정시간을 더하거나 감소시키는 메소드
		 * 2) get() : Calendar class의 상수(필드)에 저장된 값을 반환
		 * 3) set() : Calendar class의 변수에 값을 할당
		 */
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.print(cal.get(Calendar.YEAR));
		System.out.print("년 " + cal.get(cal.get(Calendar.MONTH) + 1) + "월 ");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일 ");
	}
	
}
