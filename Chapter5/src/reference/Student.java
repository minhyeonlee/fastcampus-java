package reference;

public class Student {

	int studentID;
	String studentName;

	// 학생이 공부하는 과목(참조 변수 선언)
	Subject korea;
	Subject math;

	public Student(int id, String name) {
		studentID = id;
		studentName = name;

		korea = new Subject();
		math = new Subject();
	}

	// 과목 정보를 입력하는 메서드(Subject에서 만들어도 됨)
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}

	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}

	// 과목 정보를 보여주는 메서드
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
