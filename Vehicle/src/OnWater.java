
public class OnWater extends Vehicle {
	
	private int noEngines;
	private double cargoCapacity;
	
	public OnWater(String serialNumber, int noPerson) {
		super(serialNumber, noPerson);
		this.noEngines = 2;
	}
	
	public OnWater(String serialNumber, int noPerson, String name) {
		super(serialNumber, noPerson, name);
		this.noEngines = 2;
	}
	
	public OnWater(String serialNumber, int noPerson, String name, int noEngines) {
		super(serialNumber, noPerson, name);
		this.noEngines = noEngines;
	}
	
	public OnWater(String serialNumber, int noPerson, String name, int noEngines, int cargoCapacity) {
		this(serialNumber, noPerson, name, noEngines);
		this.cargoCapacity = cargoCapacity;
	}
	
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Sailing the vessel to coordinates: " + positionX + ", " + positionY); 
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + "l of fuel to the vessel");
		return true;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Vessel properties: ");
		System.out.println("Number of engines: " + this.noEngines);
		System.out.println("Cargo capacity: " + this.cargoCapacity);
	}

}
