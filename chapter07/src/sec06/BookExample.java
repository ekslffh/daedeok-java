package sec06;

public class BookExample {

	public static void main(String[] args) {
//		Book b1 = new Book();
//		System.out.println(b1.name);
//		b1.print();
//		b1.setPrice(5000);
		
		Book b2 = new Novel("�Ƴ����� �ִ� ����", "������");
		System.out.println(b2.name);
		System.out.println(((Novel)b2).name); // �ڽ�Ŭ������ ���� ȣ�� : �ٿ�ĳ����
		
		b2.print();
		b2.setPrice(1000);
		((Novel)b2).infoNovel();
	}

}
