package Abstract;

public class RepairShop {

	public static void repairCar(Car car)
	{
		System.out.println("Car is repaired");
	}
	
	public static void main(String[] args) {
		
		Wagonar wagonar = new Wagonar();
		Audi audi = new Audi();
	
	    repairCar(wagonar);
	    repairCar(audi);
	}

}
