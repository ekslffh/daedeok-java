package sec01.exam01;

public class ExampleRefVariable02 {

	public static void main(String[] args) {
		// ��ü �������� : class Ÿ��
		// �������
		// class�� ������ = new class��([�Ű�����list]); -->�����ڸ޼���
		Triangle tr1 = new Triangle();
		Triangle tr2 = tr1;

		System.out.println("tr1=" + tr1);
		System.out.println(tr2 == tr1);
		
		Triangle tr3 = new Triangle(10, 15);
		Triangle tr4 = new Triangle(50, 30);
		
		if (tr3.equals(tr4)) {
			System.out.println(" ���� �ﰢ�� ��ü");
		} else {
			System.out.println("���� �ٸ� �ﰢ�� ��ü");
		}
	}

}

//class Triangle {
//	int width;
//	int height;
//
//	public Triangle() {}
//
//	public Triangle(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
//}
