package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// Powder
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();

		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter.toString());
		powderPrinter.printing();

		// Plastic
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();

		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter.toString());
		plasticPrinter.printing();
		
		
	}

}
