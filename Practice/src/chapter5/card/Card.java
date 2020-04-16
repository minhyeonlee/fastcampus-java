package chapter5.card;

public class Card {

	private static int cardSerialNo = 10000;
	private int cardNo;

	Card() {
		cardSerialNo++;
		cardNo = cardSerialNo;
	}

	public int getCardNumber() {
		return cardNo;
	}

	public void setCardNumber(int cardNo) {
		this.cardNo = cardNo;
	}

}
