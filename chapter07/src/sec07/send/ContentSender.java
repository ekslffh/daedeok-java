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
		System.out.println("제목 : " + title);
		System.out.println("보낸사람 : " + name);
		System.out.println("내용 : " + this.content);
		System.out.println("받는사람 : " + recipient);
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
		System.out.println("제목 : " + title);
		System.out.println("보낸사람 : " + name);
		System.out.println("내용 : " + content);
		System.out.println("받는사람 : " + this.recipient);
	}
}
