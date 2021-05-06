
public class Students implements Comparable<Students>{
	private String firstName;
	private String lastName;
	private Double average;

	Students(String first, String last, Double average){
		this.firstName = first;
		this.lastName = last;
		this.average = average;
	}

	@Override
	/*
	 * Aici vom adauga logica de sortare. Aceasta metoda va sorta
	 * automat dupa lastName prima data. In caz de egalitate, va
	 * sorta dupa firstName. Daca si aici campurile sunt egale
	 * ordonarea se va face dupa medie.
	 */
	public int compareTo(Students other){
		int comparingLastNames = this.lastName.compareTo(other.lastName);
		if (comparingLastNames != 0) {
			return comparingLastNames;
		}

		// in cazul in care lastName este acelasi comparam dupa firstName
		int comparingFirstNames = this.firstName.compareTo(other.firstName);
		if (comparingFirstNames != 0) {
			return comparingFirstNames;
		}

		// in final, in cazul in care si firstName este acelasi, comparam dupa medie
		int comparingAverages = this.average.compareTo(other.average);
		return comparingAverages;
	}

	@Override
	public String toString() {
		return "Student{" + firstName + '\''
				+ lastName + '\'' + average +
				'}';
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Double getAverage() {
		return average;
	}
}
