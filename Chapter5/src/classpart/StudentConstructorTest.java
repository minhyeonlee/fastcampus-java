package classpart;

public class StudentConstructorTest {

	public static void main(String[] args) {

		// 이름만 받는 constructor
		StudentConstructor studentLee = new StudentConstructor("이순신");
		studentLee.address = "서울";

		studentLee.showStudentInfo();

		// 이름과 id를 받는 constructor
		StudentConstructor studentKim = new StudentConstructor(1111, "김유신");
		studentKim.address = "경주";

		studentKim.showStudentInfo();

	}

}
