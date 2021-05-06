package Course26Exercise2;

import java.util.LinkedList;
import java.util.ListIterator;

public class RentedCars {
	private LinkedList<String> cars;
	
	public RentedCars(String car) {
		this.cars = new LinkedList<String>();
		this.cars.add(car);
	}
	
	public void addCar(String car) {
		this.cars.add(car);
	}
	
	public void removeCar(String car) {
		this.cars.remove(car);
	}
	
	public int size() {
		return cars.size();
	}
	
	public String findCar(String car) {
		ListIterator<String> it = cars.listIterator();
		while(it.hasNext()) {
			if(it.next() == car) {
				return car;
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		ListIterator<String> it = cars.listIterator();
		String toReturn = "This person rented the following cars:";
		while(it.hasNext()) {
			toReturn += " " + it.next();
		}
		
		return toReturn;
	}
	
}
