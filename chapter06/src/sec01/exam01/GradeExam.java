package sec01.exam01;

public class GradeExam {

	public static void main(String[] args) {
		// Grade 객체 생성
		Grade g1 = new Grade();
		g1.setScore();
		// 총점과 평균을 구하는 메서드 호출하여 인쇄
		// 인쇄 메서드 호출
		g1.printScore();
	}

}
