package sec03;

public class PersonExam {

	public static void main(String[] args) {

//		Person person = new Person("홍길동", 18);
//		System.out.println(person);
//		System.out.println();
		
		Student student = new Student("홍길동", 20, 3, 2, "20170935");
		student.setScore(100);
		System.out.println(student);
		System.out.println();
		
		Soldier soldier = new Soldier("홍길동", 21, "제17보병사단", "1중대", "2소대", "18-76022296", "통신병");
		System.out.println(soldier);
		System.out.println();
		
		Employee employee = new Employee("홍길동", 30, "삼성", "과장", "기획부");
		System.out.println(employee);
		
	}

}
