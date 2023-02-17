// 변수사용 : 1년은 365.2422일이다. 이것을 일 시간 분 초로 나타내라
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
		System.out.println("1년은 " + day + "일" + hour + "시간" + minute + "분" + second + "초 입니다.");
		 
	}

}
