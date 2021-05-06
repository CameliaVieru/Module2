
public class Vehicle {
	private final String serialNumber;
	private int noPerson;
	private String name;
	
	
	public Vehicle(String serialNumber, int noPerson) {
		this.serialNumber = serialNumber;
		this.noPerson = noPerson;
	}
	
	public Vehicle(String serialNumber, int noPerson, String name) {
		this(serialNumber, noPerson);
		this.name = name;
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Error: unknown vehicle cannot move…");
		return false;
	}
	
	public boolean addFuel(double amount) {
		System.out.println("Error: unknown vehicle cannot move…");
		return false;
	}
	
	public void printInfo() {
		System.out.println("Vehicle properties:");
		System.out.println("Serial Number: " + this.serialNumber);
		System.out.println("Capacity: " + this.noPerson);
		System.out.println("Name: " + this.name);
	}
}
