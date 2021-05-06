
public class Main {
	public static void main(String[] args) {
		MyIntArrayList a = new MyIntArrayList();
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(5);
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(5);
		System.out.println(a.get(3));
		System.out.println(a.lastIndexOf(2));
		a.remove(2);
		a.add(1, 53);
		a.ensureCapacity(6);
		System.out.println(a.contains(53));
		a.display();
		
		MyIntArrayList b = new MyIntArrayList(20);
		b.addAll(a);
		b.display();
	
	}
}
