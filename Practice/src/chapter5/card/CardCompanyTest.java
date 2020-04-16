package chapter5.card;

public class CardCompanyTest {

	public static void main(String[] args) {

		CardCompany company = CardCompany.getInstance();// singleton pattern

		Card myCard = company.createCard(); // 메서드에서 Card 생성
		Card yourCard = company.createCard();

		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());

	}

}
