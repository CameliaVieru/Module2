
public class OnAir extends Vehicle {
	private int noTurbines;
	private boolean hasFirstClass;
	
	public OnAir(String serialNumber, int noPerson) {
		super(serialNumber, noPerson);
		this.noTurbines = 2;
	}
	
	public OnAir(String serialNumber, int noPerson, String name) {
		super(serialNumber, noPerson, name);
		this.noTurbines = 2;
	}
	
	public OnAir(String serialNumber, int noPerson, String name, int noTurbines) {
		super(serialNumber, noPerson, name);
		this.noTurbines = noTurbines;
	}
	
	public OnAir(String serialNumber, int noPerson, String name, int noTurbines, boolean hasFirstClass) {
		this(serialNumber, noPerson, name, noTurbines);
		this.hasFirstClass = hasFirstClass;
	}
	
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Flying the airplane to coordinates: " + positionX + ", " + positionY); 
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + "l of fuel to the airplane");
		return true;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Airplane properties:");
		System.out.println("Number of turbines: " + this.noTurbines);
		
		if(this.hasFirstClass) {
			System.out.println("Has first class");
		}
		else {
			System.out.println("Does not have first class");
		}
	}
}
	
