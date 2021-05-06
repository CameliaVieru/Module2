package Course22Exercise1Town;

public class Town implements Comparable<Town>{
	private String name;
	private int distance;
	
	public Town (String name, int distance) {
		this.name = name;
		this.distance = distance;
	}
	public int getDistance() {
		return this.distance;
	}
	
	public String toString() {
		return this.name + " " + this.distance;
	}
	
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		
		if(object == null || this.getClass() != object.getClass()) {
			return false;
		}
		
		Town aTown = (Town) object;
		return this.distance == aTown.distance;
	}
	
	public int hashCode() {
		return this.hashCode() + this.distance;
	}
	
	
	@Override
	public int compareTo(Town newElement) {
		if(newElement == null) {
			throw new NullPointerException();
		}
		if(this.distance == newElement.distance){
			return 0;
		} else if(this.distance < newElement.distance) {
			return -1;
		} 
		return 1;
		
	}
	
}
