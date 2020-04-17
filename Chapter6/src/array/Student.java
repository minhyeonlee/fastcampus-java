package array;

import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;

	// constructor
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		subjectList = new ArrayList<Subject>();
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score);

		subjectList.add(subject); // 생성된 과목을 subjectList에 넣어준다.
	}

	public void showStudentInfo() {

		int total = 0;

		for (Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "학생의 " + subject.getName() + "의 성적은 " + subject.getScore() + "입니다.");
		}
		System.out.println(studentName + "학생의 총점은 " + total + " 입니다.");
	}
}