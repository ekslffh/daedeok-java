package sec06;

public class Book {
	public String name = "ȥ���ڹ�";
	public String publisher = "�Ѻ��̵��";
	int price;
	
	Book() {}

	Book(String name, String publisher) {
		this.name = name;
		this.publisher = publisher;
	}

	void print() {
		System.out.println("print : Book");
	}
	
	void setPrice(int price) {
		this.price = price;
	}
}

class Novel extends Book {
	public String name;
	public String publisher;

	Novel(String name, String publisher) {
		this.name = name;
		this.publisher = publisher;
	}

	@Override
	void print() {
		System.out.println("print : Novel");
	}
	
	void infoNovel() {
		System.out.println("���� �ֱٿ� ���� �Ҽ�");
	}
}

class SF extends Book {
	public String name;
	public String publisher;

	SF(String name, String publisher) {
		super(name, publisher);
	}

	@Override
	void print() {
		System.out.println("print : SF");
	}
}
