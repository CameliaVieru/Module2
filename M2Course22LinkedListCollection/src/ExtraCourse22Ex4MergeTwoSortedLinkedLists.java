import java.util.LinkedList;
import java.util.ListIterator;

public class ExtraCourse22Ex4MergeTwoSortedLinkedLists {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		LinkedList<Integer> result = new LinkedList<>();
		
		list1.add(1);
		list1.add(3);
		list1.add(5);
		
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(7);
		
		
		ListIterator<Integer> li1 = list1.listIterator();
		ListIterator<Integer> li2 = list2.listIterator();
		
		while(li1.hasNext() && li2.hasNext()) {
			
			if(li1.next() <= li2.next()) {
				result.add(li1.previous());
				li1.next();
				li2.previous();
				
			} else {
				result.add(li2.previous());
				li2.next();
				li1.previous();
				
			}

		}
		
		while(li1.hasNext()) {
			result.add(li1.next());
		}
		
		while(li2.hasNext()) {
			result.add(li2.next());
		}
		
		System.out.println(result);
	}
}
