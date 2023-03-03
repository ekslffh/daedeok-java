package sec07.send;

public class ContentSenderTest {

	public static void main(String[] args) {
		
		ContentSender cs1 = new KakaoSender("오늘 자바 보강", "java선생", "보강 없음");
		cs1.sendMsg("403호 모든이");
		
		ContentSender cs2 = new LetterSender("오늘 자바 보강", "java선생", "403호 모든이");
		cs2.sendMsg("농담이었습니다. 보강은 계획대로...");
		
	}

}
