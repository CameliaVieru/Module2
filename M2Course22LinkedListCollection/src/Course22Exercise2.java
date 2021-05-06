import java.util.LinkedList;
import java.util.ListIterator;

public class Course22Exercise2 {
	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<>();
		myList.add(100);
		myList.add(201);
		myList.add(201);
		myList.add(300);
		myList.add(300);
		myList.add(400);
		System.out.println("2a: ");
		System.out.println(removeDuplicates(myList));

		LinkedList<Integer> myList2 = new LinkedList<>();
		myList2.add(100);
		myList2.add(201);
		myList2.add(201);
		myList2.add(300);
		myList2.add(300);
		myList2.add(400);
		System.out.println("2b: ");
		System.out.println(removeDuplicates2(myList2));


	}

	public static LinkedList<Integer> removeDuplicates (LinkedList<Integer> myList) {

		ListIterator<Integer> li = myList.listIterator();
		LinkedList<Integer> newList = new LinkedList<>();

		newList.add(myList.get(0));
		int aux = newList.get(0);

		while(li.hasNext()) {
			if(li.next() != aux) {
				newList.add(myList.get(li.previousIndex()));
				aux = li.previous();
			}
		}
		return newList;
	}

	public static LinkedList<Integer> removeDuplicates2 (LinkedList<Integer> myList){
		ListIterator<Integer> li = myList.listIterator(1);
		LinkedList<Integer> newList = new LinkedList<>();

		newList.add(myList.get(0));
		int aux = newList.get(0);

		while(li.hasNext()) {
			int iterator = li.next();
			if(iterator == aux) {
				newList.removeLast();
				aux = newList.getLast();				
			} else {
				newList.add(myList.get(li.previousIndex()));
				aux = li.previous();
				li.next();
			}

		}
		return newList;

	}
}
