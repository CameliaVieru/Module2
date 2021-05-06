
public class Vehicle {
	private static final String producedBy = "Ford";
	private final int productionYear;
	private final String vin;
	private String plateNumber;
	private double kilometers;
	private int lastSoldOnYear;
	private int positionOx;
	private int positionOy;
	

	public Vehicle(int productionYear, String vin, String plateNumber, double kilometers, int lastSoldOnYear, int positionOx, int positionOy) {
		this.productionYear = productionYear;
		this.vin = vin;
		this.plateNumber = plateNumber;
		this.kilometers = kilometers;
		this.lastSoldOnYear = lastSoldOnYear;
		this.positionOx = positionOx;
		this.positionOy = positionOy;
		
	}
	
	public Vehicle(int productionYear, String vin) {
		this(productionYear, vin, "UNKNOWN", 0, 0, 0, 0);
	}
	
	public Vehicle(int productionYear, String vin, String plateNumber, double kilometers) {
		this(productionYear, vin, plateNumber, kilometers, 0, 0, 0);
	}

	
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public double getKilometers() {
		return kilometers;
	}
	
	public int getPositionOx() {
		return positionOx;
	}

	public void setPositionOx(int positionOx) {
		this.positionOx = positionOx;
	}

	public int getPositionOy() {
		return positionOy;
	}

	public void setPositionOy(int positionOy) {
		this.positionOy = positionOy;
	}

	public void sellVehicle(String plateNumber, int lastSoldOnYear) {
		this.plateNumber = plateNumber;
		this.lastSoldOnYear = lastSoldOnYear;
	}
	
	public void driveCar(int positionOx, int positionOy) {
		
		int x1 = this.positionOx; 
		int y1 = this.positionOy;
		int x2 = positionOx;
		int y2 = positionOy;
		double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		this.positionOx = positionOx;
		this.positionOy = positionOy;
		this.kilometers = distance;
	}
	
	private String checkVin(String vin) {
		
		StringBuilder sBuilder = new StringBuilder(vin);
		
		if(vin.contains("I") || vin.contains("O") || vin.contains("Q")) {
			return "invalid";
		}
		
		int currentLetter = 1;
		for(int i = 65; i < 91; i++) {
			if(i == 74) currentLetter = 1;
			if(i == 83) currentLetter = 2;
			for(int j = 0; j < vin.length(); j++) {
				if(vin.charAt(j) == (char) i) {
					sBuilder.replace(j, j + 1, String.valueOf(currentLetter));
				}
			}
			currentLetter++;
		}
		
		return sBuilder.toString();
	}
	
	private int calculateWeight(String myString) {
		char[] myArray = myString.toCharArray();
		int[] intArray = new int[17];
		int counter = 0;
		
		for(int i = 8; i > 1; i--) {
			intArray[counter] = Character.getNumericValue(myArray[counter]) * i;
			counter++;
		}
		
		intArray[counter] = Character.getNumericValue(myArray[counter]) * 10;
		intArray[++counter] = Character.getNumericValue(myArray[counter]) * 0;
		counter++;
		
		for(int i = 9; i > 1; i--) {
			intArray[counter] = Character.getNumericValue(myArray[counter]) * i;
			counter++;
		}
		
		int sum = 0;
		for(int i = 0; i < 17; i++) {
			sum += intArray[i];
		}
		
		return sum;
	}
	
	public boolean isVinValid(boolean isDrivingInNorthAmerica) {
		
		if (!isDrivingInNorthAmerica) { 
			return true;
		}
		
		int finalSum = calculateWeight(checkVin(this.vin));
		
		int divisor = finalSum % 11;
		
		if(divisor == 10) {
			return true;
		}
		
		return false;
		
	}
	
	public void printVinDicomposed() {
		System.out.println("Producer ID: " + this.vin.substring(0, 3));
		System.out.println("Vehicle atributes: " + this.vin.substring(3, 8));
		System.out.println("Verification digit: " + this.vin.substring(8, 9));
		System.out.println("Production year: " + this.vin.substring(9, 10));
		System.out.println("Factory series: " + this.vin.substring(10, 11));
		System.out.println("Number ID: " + this.vin.substring(11, 17));
	}
	
	public String display() {
		
		String myString = "The car was produced by: " + this.producedBy + ", in " + this.productionYear 
				+ ". Vehicle Identification Number: " + this.vin + ". Plate Number: " + this.plateNumber + ". Kilometers: " + this.kilometers +
				". This car was last sold on the following year: " + this.lastSoldOnYear + ". The position of this car is: " +
				" Position OX: " + this.positionOx + " Position OY: " + this.positionOy;
		
		return myString;

	}
}
