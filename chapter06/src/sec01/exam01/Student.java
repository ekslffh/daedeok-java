package sec01.exam01;

public class Student {
		
	public static void main(String[] args) {

		StudentEx s1 = new StudentEx();
		System.out.println(s1.major);
		System.out.println(s1.stdID);
				
		s1.major = "����Ʈ���� �а�";
		s1.stdID = 2021010011;
		System.out.println(s1.major);
		System.out.println(s1.stdID);
		
	}

}

class StudentEx {
	String major;
	int stdID;
}
