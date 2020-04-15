package thisex;

public class Person {

	String name;
	int age;

	// 생성자1
	public Person() {
		// 생성자2를 호출한다.
		// this로 다른 생성자를 호출할 때에는 무조건 맨 윗줄에서 호출해야함.
		this("이름 없음", 1);
	}

	// 생성자2
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.println(name + ", " + age);
	}

	// 인스턴스의 주소를 반환: 반환 타입은 자기 자신으로 한다.
	public Person getSelf() {
		return this;
	}
}
