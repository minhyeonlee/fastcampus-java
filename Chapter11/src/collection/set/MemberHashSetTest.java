package collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();

		// string은 중복이 안되었지만, 지금 member의 중복을 구현하지 않아 중복으로 들어간다.
		// member의 equals(), hashCode()를 오버라이딩 해서 중복을 구현해준다.
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park2");

		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);

		manager.showAllMember();

		manager.removeMember(100);
		manager.showAllMember();

	}

}
