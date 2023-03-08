package lang.object;

public class ExampleObject {
	
	public static void main(String[] args) {
		/**
		 * �ڹ��� ���� Ŭ����
		 * 11���� �޼���� ����(clone(), equals(), finalize(), getClass(),
		 * hashCode(), notify(), notifyAll(), toString(), wait(),
		 * wait(), wait()
		 * 1) clone() - ��ü�� �����Ͽ� ��ü��ȯ
		 * 2) equals() - ��ü�� ��ü�� ���� ����� ��ȯ (true, false)
		 * 3) finalize() - ��ü����� ����Ǿ��� �� ������ ������ ���� ȣ��
		 * 4) getClass() - ���� ��ü������ Class Ÿ������ ��ȯ
		 * 5) hashCode() - ��ü�� �����ּ�(�ؽ��Լ����) ��ȯ
		 * 6) notify(), notifyAll() - ��� ���� �����带 Ȱ��ȭ ��Ŵ
		 * 7) wait() - �������� ������ �����带 ��� ���·� ��ȯ
		 * 8) toString() - ��ü ������ ���ڿ��� ��ȯ
		 */
		// toString() - ��ü ������ ���ڿ��� ��ȯ
		// return Ŭ�����̸� + "@" + ��ü�ּ�
		// return getClass().getName() + '@' + Integer.toHexString(hashCode())

		// equals() - �Ű������� ���޹��� ��ü�� �ڽ��� ���Ͽ� �� �Ǵ� 
		// 			  ������ ��ȯ
		Person p1 = new Person("690115-1388763", "PARK");
		Person p2 = new Person("690115-1388763", "park");
		Person p3 = p1; // ���� ����
		
//		System.out.println(p1);
//		System.out.println(p2.equals(p1));
//		System.out.println(p1.equals(p3));
		
		Person p4 = p1.clone();
		System.out.println(p1 == p3);
		System.out.println(p1 == p4);
		System.out.println(p1.equals(p4));
		System.out.println(p4);
		
	}
	
}

class Person implements Cloneable {
	private String id;
	private String name;
	
	Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ", " + name;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = null;
		if (obj instanceof Person) {
			p = (Person) obj;
		}
		
		if (p != null && this.id.equals(p.id)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public Person clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Person) obj;
	}
	
}
