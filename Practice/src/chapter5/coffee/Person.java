package chapter5.coffee;

public class Person {

	String personName;
	String menu;
	String coffeeShop;
	int price;
	int money;

	public Person(String name, int money) {
		this.personName = name;
		this.money = money;
	}

	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4300);
		if (message != null) {
			this.money -= money;
			System.out.println(personName + "이 " + money + "로 " + message);
		}

	}

	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
		if (message != null) {
			this.money -= money;
			System.out.println(personName + "이 " + money + "로 " + message);
		}
	}

}
