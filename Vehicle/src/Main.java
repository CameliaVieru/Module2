
public class Main {
	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle("B 99 AAA", 4, "NoName");
		myVehicle.addFuel(35);
		myVehicle.getSerialNumber();
		myVehicle.goTo(34, 153);
		myVehicle.printInfo();
		
		OnAir myAirplane = new OnAir("AIR90", 10);
		myAirplane.addFuel(35);
		myAirplane.getSerialNumber();
		myAirplane.goTo(134, 22);
		myAirplane.printInfo();
		
		OnRoad myCar = new OnRoad("B 31 JGN", 5, "Ford");
		myCar.addFuel(50);
		myCar.goTo(444, 1111);
		myCar.printInfo();
		
		OnWater myBoat = new OnWater("58WTV", 3);
		myBoat.addFuel(111);
		myBoat.goTo(333, 999);
		myBoat.printInfo();
		
	}
}
