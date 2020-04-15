package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Thomas", 10000);
		Student studentE = new Student("Edward", 50000);

		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		Taxi taxi1111 = new Taxi(1111);
		Taxi taxi2222 = new Taxi(2222);

		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentE.takeTaxi(taxi1111);

		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();

		bus100.showBusInfo();
		bus500.showBusInfo();

		subwayGreen.showSubwayInfo();

		taxi1111.showTaxiInfo();

	}

}
