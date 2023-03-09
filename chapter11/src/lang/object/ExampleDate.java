package lang.object;

import java.util.Date;

public class ExampleDate {

	public static void main(String[] args) {
		/**
		 * Date class
		 * 시각정보(년월시분초)를 밀리초 단위로 저장관리
		 * DateFormat 클래스를 이용하여 날짜를 포맷팅하여 출력
		 * 1) getTime() -> 1970.01.01이후 부터 계산된 날짜를 long타입의 밀리초 단위로 반환
		 * 2) setTime(long time) - 입력된 'time'값을 1970.01.01
		 * 	  GMT 이후의 Date 시간을 밀리초로 나타내는 인스턴스 생성
		 * 3) toString() : 다음 타입의 형식으로 Date의 자료를 출력
		 * 	  dow mon dd hh : mm : ss zzz yyyy
		 */
		Date now = new Date();
		System.out.println("현재시각 : " + now.getTime());
		
		Date d1 = new Date(1678339033850L);
		System.out.println(d1);
		System.out.println(d1.getMonth() + 1);
		
	}

}
