package sec03;

public class PersonExam {

	public static void main(String[] args) {

//		Person person = new Person("ȫ�浿", 18);
//		System.out.println(person);
//		System.out.println();
		
		Student student = new Student("ȫ�浿", 20, 3, 2, "20170935");
		student.setScore(100);
		System.out.println(student);
		System.out.println();
		
		Soldier soldier = new Soldier("ȫ�浿", 21, "��17�������", "1�ߴ�", "2�Ҵ�", "18-76022296", "��ź�");
		System.out.println(soldier);
		System.out.println();
		
		Employee employee = new Employee("ȫ�浿", 30, "�Ｚ", "����", "��ȹ��");
		System.out.println(employee);
		
	}

}
