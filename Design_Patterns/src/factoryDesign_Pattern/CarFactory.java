package factoryDesign_Pattern;

public class CarFactory {
	
	public Car getCar(String carType){
		if(carType == "Innova")
		return new Innova(); 
		else if(carType == "Thar")
		return new Thar(); 
		else if(carType == "Swift")
			return new Swift(); 
		else  return null;
	}

}
