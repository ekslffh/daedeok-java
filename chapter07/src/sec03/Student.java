package sec03;

public class Student extends Person {

	private int grade;
	private int classRoom;
	private String studentId;
	private int score;
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name, int age, int grade, int classRoom, String studentId) {
		super(name, age);
		this.grade = grade;
		this.classRoom = classRoom;
		this.studentId = studentId;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n학년: " + grade + "\n반: " + classRoom + "\n학번: " + studentId + "\n점수: " + score;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
