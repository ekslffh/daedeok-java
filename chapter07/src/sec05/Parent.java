package sec05;

public class Parent {
	int age = 53;
	String name = "ȫ�浿";
	
	Parent() {}
	
	Parent(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void infoPrint() {
		System.out.println("�̸� : " + name + ", ���� : " + age);
	}
}

class Child extends Parent {	
	Child() {}

	Child(int age, String name) {
		super(age, name);
	}
	
	@Override
	public void infoPrint() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ��Դϴ�.");
		System.out.println("�ڽ��� ���̴� " + (age-28) + "�̰� �̸��� " + name + "�Դϴ�.");
	}
}
