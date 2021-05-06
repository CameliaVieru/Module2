import java.util.LinkedList;
import java.util.ListIterator;

public class ExtraCourse22Ex5RotateList {
	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		
		System.out.println(rotateList(myList, 8));
		
	}
	
	public static LinkedList<Integer> rotateList(LinkedList<Integer> myList, int key){
		LinkedList<Integer> newList = new LinkedList<>();
		key = key % myList.size();
		ListIterator<Integer> li = myList.listIterator(key);
		
		while(li.hasNext()) {
			newList.add(li.next());
		}
		li = myList.listIterator();
		
		while(li.hasNext() && li.next() <= key) {
			li.previous();
			newList.add(li.next());
		}
		return newList;
		
	}
}
