package collection.treemap;

import java.util.Comparator;

public class Member implements Comparator<Member> {

	private int memberId;
	private String memberName;

	public Member() {
	}

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	// getter, setter
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}

	// 중복 정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return (this.memberId == member.memberId);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	// Comparator
	@Override
	public int compare(Member member1, Member member2) {

		return (member1.memberId - member2.getMemberId());
	}

	/*
	 * (Comparable) Member 비교 메서드
	 * 
	 * @Override public int compareTo(Member member) {
	 * 
	 * return this.memberId - member.memberId; }
	 */

}
