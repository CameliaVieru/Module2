
public class Main {
	public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		myList.addElement(3);
		myList.addElement(5);
		myList.addElement(7);
		myList.addElement(2);
		myList.addElement(10);

		
		System.out.println(myList.getElement(1));
		System.out.println(myList.removeElement(3));
		
	}
}
