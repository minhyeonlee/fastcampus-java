package staticex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();

		// 단 하나만 생성된다.
		System.out.println(company1);
		System.out.println(company2);

		// Calendar calendar = new Calendar();
		// Singleton Pattern으로 생성되어 new는 불가하고 getInstance 메서드를 통해 단 하나의 인스턴스만 생성 가능
		Calendar calendar = Calendar.getInstance();

	}

}
