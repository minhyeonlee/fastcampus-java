package chapter5;

public class OrderTest {

	public static void main(String[] args) {

		Order o1 = new Order();

		o1.orderID = 201907210001L;
		o1.customerID = "abc123";
		o1.orderDate = "2019년 7월 21일";
		o1.customerName = "홍길순";
		o1.productID = "PD0345-12";
		o1.shippingAddress = "서울시 영등포구 여의도동 20번지";

		System.out.println("주문 번호: " + o1.orderID);
		System.out.println("주문자 아이디: " + o1.customerID);
		System.out.println("주문 날짜: " + o1.orderDate);
		System.out.println("주문자 이름: " + o1.customerName);
		System.out.println("주문 상품 번호: " + o1.productID);
		System.out.println("배송 주소: " + o1.shippingAddress);

	}

}
