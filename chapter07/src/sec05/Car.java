package sec05;

// ����] ������ Car class�̴�. �� Ŭ������ Bus Ŭ������ ��ӹް�,
//	 	Bus Ŭ�������� run�޼��带 �������̵� �Ͻÿ�.
//		Bus Ŭ�������� run�޼���� "���� �����ϸ鼭 ���� ������������
//		����մϴ�"�� ����ϵ��� �����Ͻÿ�
public class Car {
	public void run() {
		System.out.println("car Ŭ������ run�޼ҵ�");
	}
}

class Bus extends Car {
	@Override
	public void run() {
		System.out.println("���� �����ϸ鼭 ���� ������������ ����մϴ�");
	}
}
