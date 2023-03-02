package sec05;

public class Parent {
	int age = 53;
	String name = "홍길동";
	
	Parent() {}
	
	Parent(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void infoPrint() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
}

class Child extends Parent {	
	Child() {}

	Child(int age, String name) {
		super(age, name);
	}
	
	@Override
	public void infoPrint() {
		System.out.println("자식 클래스 메소드입니다.");
		System.out.println("자식의 나이는 " + (age-28) + "이고 이름은 " + name + "입니다.");
	}
}
