package reference;

public class StudentTest {

	public static void main(String[] args) {

		// 학생 생성
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);

		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 99);

		// 학생 정보 보여주기
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
