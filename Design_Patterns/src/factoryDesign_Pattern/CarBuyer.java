package factoryDesign_Pattern;

public class CarBuyer {
	
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Car thar = carFactory.getCar("Tharr");
		thar.run();
	}	
	
}
