package polymorphism;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;

	// 명시적으로 Customer constructor 호출
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;

		System.out.println("VIPCustomer(int, String) 생성자 호출");

	}

	// method overriding
	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * salesRatio);
	}

}
