package sec04.exam02;

public class Stocks {
	// ��ǰ�� ��� �����ϴ� ���Ŭ������ �����Ͻÿ�.
	// �Ӽ��� ��ǰ�ڵ�(prodID), �԰����(incomeQty), �Ǹż���(saleQty), ������(stockQty)�̰�
	// ����ó��(buy)�� �Ǹ�ó��(sale)�� �����ϴ� �޼���� ��ǰ������ ����ϴ� �޼���(informProd)�� �����Ͻÿ�.
	private String prodID;
	private int incomeQty; // �԰����
	private int saleQty; // �Ǹż���
	private int stockQty; // ������
	
	public Stocks() {}
	
	public Stocks(String prodID) {
		this.prodID = prodID;
	}
	
	public void buy(int quantity) { // ���� -> ���Լ��� ����, ������ ����
		incomeQty += quantity;
		stockQty += quantity;
	}
	
	public void sale(int quantity) { // ���� -> ������� ����, ������ ���� 
		saleQty += quantity;
		stockQty -= quantity;
	}
	
	public void informProd() {
		System.out.println("��ǰ�ڵ�: " + prodID);
		System.out.println("�԰����: " + incomeQty);
		System.out.println("�Ǹż���: " + saleQty);
		System.out.println("������: " + stockQty);
		System.out.println("-----------------");
	}
	
}
