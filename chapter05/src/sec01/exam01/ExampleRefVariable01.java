package sec01.exam01;

public class ExampleRefVariable01 {

	public static void main(String[] args) {
		// �迭, ����Ÿ��, ��ü����(class�� ��ü����)
		// �ּҸ� ����
		Emp e1 = new Emp();
		Emp e2 = new Emp("a001", "ȫ�浿");
		int i = 100;
		
		Emp[] arr = new Emp[10];
		
		System.out.println("e1="+e1);
		System.out.println("e2="+e2);
		System.out.println("arr="+arr);
		
		System.out.println("i=" + i);
	}

}

class Emp{
	private String emp_id;
	private String emp_name;
	
	public Emp() {}
	public Emp(String emp_id, String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
}
