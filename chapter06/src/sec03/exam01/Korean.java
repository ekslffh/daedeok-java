package sec03.exam01;

public class Korean {

	String nation = "���ѹα�";
	String name;
	String ssn;
	
	public Korean() {} // �⺻������
	
	public Korean(String nation, String name, String ssn) { // �Ϲݻ�����
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
	}
	
	public Korean(String nation) { // �Ϲݻ�����
		this("ȫ�浿", "abcdef@abc.com");
		this.nation = nation;
	}
	
	public Korean(String name, String ssn) { // �Ϲݻ�����
		this("���ѹα�", name, ssn);
	}
	
}
