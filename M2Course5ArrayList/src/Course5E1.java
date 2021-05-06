import java.util.ArrayList;

public class Course5E1 {
	public static void main(String[] args) {
		ArrayList<Double> myDouble = new ArrayList<Double>();
		ArrayList<String> myString = new ArrayList<String>();
		
		myDouble.add(Double.valueOf(10.5));
		myDouble.add(Double.valueOf(5));
		myDouble.add(Double.valueOf(17));
		myDouble.add(2, Double.valueOf(113));
		System.out.println(myDouble.contains(10.0));
		System.out.println(myDouble.contains(10.5));
		System.out.println(myDouble.get(1));
		System.out.println("Size: " + myDouble.size());
		myDouble.remove(3);
		System.out.println("Size: " + myDouble.size());
		
		myString.add("Lucy");
		myString.add("Joey");
		myString.add("Anna");
		myString.add("Lucy");
		myString.add(2, "James");
		System.out.println(myString.lastIndexOf("Lucy"));
		myString.set(1, "Dory");
		System.out.println(myString);
		myString.clear();
		
	}
}
