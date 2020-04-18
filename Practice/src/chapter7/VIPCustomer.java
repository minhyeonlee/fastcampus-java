package chapter7;

public class VIPCustomer extends Customer {

	int agentID;
	double salesRatio;

	// constructor
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * salesRatio);
	}

	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원의 번호는 " + agentID + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}

}
