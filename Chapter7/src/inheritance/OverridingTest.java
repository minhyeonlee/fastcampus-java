package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;

		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calPrice(10000);
		int priceKim = customerKim.calPrice(10000);
		
		System.out.println(customerLee.showCustomerInfor() + "지불금액은 " + priceLee +"원 입니다.");
		System.out.println(customerKim.showCustomerInfor() + "지불금액은 " + priceKim +"원 입니다.");

		// 하위 클래스는 상위 클래스 형으로 묵시적 형변환이 가능하다.
		Customer customerNo = new VIPCustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCustomerInfor() + "지불금액은 " + customerNo.calPrice(10000) +"원 입니다.");
	}

}
