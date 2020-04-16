package chapter5.card;

public class CardCompany {

	private static CardCompany instance = new CardCompany();

	// 생성자
	private CardCompany() {};

	public static CardCompany getInstance() {
		if (instance == null) {
			CardCompany instance = new CardCompany();
		}
		return instance;
	}

	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
