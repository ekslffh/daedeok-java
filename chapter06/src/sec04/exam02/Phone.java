package sec04.exam02;

public class Phone {
	/* �̸��� ��ȭ��ȣ �Ӽ��� ���� Phone class�� �����Ͻÿ�
	 * �޼���� �ʱ�ȭ�� ���� ������, ������ ��ȭ��ȣ ������ ���� �޼���(setPhone) ��
	 * ��ȭ��ȣ�� �̸��� ����ϴ� �޼���(printPhoneNum)�� �ۼ��Ͻÿ�
	 * ����Ŭ���� ����  
	 */
	private String name;
	private String phone;
	
	public Phone(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printPhoneNum() {
		System.out.println(name + ": " + phone);
	}
	
}
