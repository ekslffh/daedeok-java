package sec07.send;

public class ContentSenderTest {

	public static void main(String[] args) {
		
		ContentSender cs1 = new KakaoSender("���� �ڹ� ����", "java����", "���� ����");
		cs1.sendMsg("403ȣ �����");
		
		ContentSender cs2 = new LetterSender("���� �ڹ� ����", "java����", "403ȣ �����");
		cs2.sendMsg("����̾����ϴ�. ������ ��ȹ���...");
		
	}

}
