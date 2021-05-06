package Course26Exercise2;

import java.util.HashMap;
import java.util.Scanner;

public class CarRentedSystem {

	private static Scanner sc = new Scanner(System.in);
	private HashMap<String, RentedCars> ownerCar = new HashMap<String, RentedCars>();

	private static String getPlateNo() {
		System.out.println("Introduceti numarul de inmatriculare:");
		return sc.nextLine();
	}
	
	private static String getOwnerName() {
		System.out.println("Introduceti numele proprietarului:");
		return sc.nextLine();
	}
	
	private int carsNo(String owner) {
		return ownerCar.get(owner).size();
	}
	
	private String getCars(String ownerName){
		return ownerCar.get(ownerName).toString();
	}

	// search for a key in hashtable
	private boolean isCarRent(String ownerName, String car) {
		return ownerCar.get(ownerName).findCar(car).equals(car);
	}

	// get the value associated to a key
	private String getCarRent(String ownerName) {
		if(!ownerCar.containsKey(ownerName)) {
			return "Unfortunately, this vehicle is not in our database";
		}
		return ownerCar.get(ownerName).toString();
	}

	// add a new (key, value) pair
	private void rentCar(String ownerName, String car) {
		if(ownerCar.containsKey(ownerName)) {
			ownerCar.get(ownerName).addCar(car);
		} else {
			ownerCar.put(ownerName, new RentedCars(car));
		}
	}

	// remove an existing (key, value) pair
	private void returnCar(String ownerName, String car) {
		if(ownerCar.containsKey(ownerName)) {
			if(ownerCar.get(ownerName).findCar(car).equals(car)) {
				ownerCar.get(ownerName).removeCar(car);
				System.out.println("This car has been removed successfully!");
			}
		} else {
			System.out.println("This car was not registered in out system!");
		}

	}


	private static void printCommandsList() {
		System.out.println("help         - Afiseaza aceasta lista de comenzi");
		System.out.println("add          - Adauga o noua pereche (masina, sofer)");
		System.out.println("check        - Verifica daca o masina este deja luata");
		System.out.println("remove       - Sterge o masina existenta din hashtable");
		System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
		System.out.println("total        - Afiseaza numarul total de masini inchiriate de un proprietar");
		System.out.println("rented cars  - Afiseaza lista de masini inchiriate de un proprietar");
		System.out.println("quit         - Inchide aplicatia");
	}

	public void run() {
		boolean quit = false;
		while(!quit) {
			System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
			String command = sc.nextLine();
			switch(command) {
			case "help":
				printCommandsList();
				break;
			case "add":
				rentCar(getOwnerName(), getPlateNo());
				break;
			case "check":
				System.out.println(isCarRent(getOwnerName(), getPlateNo()));
				break;
			case "remove":
				returnCar(getOwnerName(), getPlateNo());
				break;
			case "getOwner":
				System.out.println(getCarRent(getPlateNo()));
				break;
			case "total":
				System.out.println("Numarul total de masini inchiriate este: " + carsNo(getOwnerName()));
				break;
			case "cars rented":
				System.out.println(getCars(getOwnerName()));
				break;
			case "quit":
				System.out.println("Aplicatia se inchide...");
				quit = true;
				break;
			default:
				System.out.println("Unknown command. Choose from:");
				printCommandsList();
			}
		}
	}

	public static void main(String[] args) {

		// create and run an instance (for test purpose)
		new CarRentedSystem().run();
		

	}
}