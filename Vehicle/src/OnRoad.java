
public class OnRoad extends Vehicle{
	private int noWheels;
	private int noDoors;
	
	public OnRoad(String serialNumber, int noPerson) {
		super(serialNumber, noPerson);
		this.noWheels = 4;
		this.noDoors = 4;
	}
	
	public OnRoad(String serialNumber, int noPerson, String name) {
		super(serialNumber, noPerson, name);
		this.noWheels = 4;
		this.noDoors = 4;
	}
	
	public OnRoad(String serialNumber, int noPerson, String name, int noWheels) {
		super(serialNumber, noPerson, name);
		this.noWheels = noWheels;
		this.noDoors = 4;
	}
	
	public OnRoad(String serialNumber, int noPerson, String name, int noWheels, int noDoors) {
		this(serialNumber, noPerson, name, noWheels);
		this.noDoors = noDoors;
	}
	
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Driving the vehicle on road to coordinates: " + positionX + ", " + positionY); 
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + "l of fuel to the driving vehicle");
		return true;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Driving vehicle properties:");
		System.out.println("Number of wheels: " + this.noWheels);
		System.out.println("Number of doors: " + this.noDoors);
	}
	
}
