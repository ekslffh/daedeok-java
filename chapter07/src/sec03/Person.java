package sec03;

public class Person {
	
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name =  name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age;
	}	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
