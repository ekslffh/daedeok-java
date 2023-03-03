package sec07.send;

public abstract class ContentSender {
	protected String title;
	protected String name;
	
	ContentSender() {}
	
	ContentSender(String title, String name) {
		this.title = title;
		this.name = name;
	}
	
	protected abstract void sendMsg(String content);
}

class KakaoSender extends ContentSender {
	private String content;
	
	public KakaoSender(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}
	
	@Override
	protected void sendMsg(String recipient) {
		System.out.println("���� : " + title);
		System.out.println("������� : " + name);
		System.out.println("���� : " + this.content);
		System.out.println("�޴»�� : " + recipient);
	}	
}

class LetterSender extends ContentSender {
	private String recipient;
	
	public LetterSender(String title, String name, String recipient) {
		super(title, name);
		this.recipient = recipient;
	}
	
	@Override
	protected void sendMsg(String content) {
		System.out.println("���� : " + title);
		System.out.println("������� : " + name);
		System.out.println("���� : " + content);
		System.out.println("�޴»�� : " + this.recipient);
	}
}
