
public class Main {
	public static void main(String[] args) {
		Vehicle myCar = new Vehicle(2003, "1M8GDM9AXKP042788");
		myCar.sellVehicle("202 HZS", 2018);
		myCar.driveCar(2344, 1122);
		System.out.println(myCar.display());
		myCar.printVinDicomposed();
		System.out.println(myCar.isVinValid(true));
	}
}
