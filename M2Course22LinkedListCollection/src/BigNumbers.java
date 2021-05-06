import java.util.LinkedList;
import java.util.ListIterator;

public class BigNumbers {
	public static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
		LinkedList<Integer> result = new LinkedList<>();
		ListIterator<Integer> li1 = op1.listIterator(op1.size());
		ListIterator<Integer> li2 = op2.listIterator(op2.size());
		int number = 0;
		int temp = 0;
		while(li1.hasPrevious() && li2.hasPrevious()) {
			number = li1.previous() + li2.previous() + temp;
			if(number > 9) {
				int lastDigit = number % 10;
				temp = number / 10;
				result.addFirst(lastDigit);
				number = 0;
				
			} else {
				result.addFirst(number);
				temp = 0;
			}
		}
		
		while (li1.hasPrevious()) {
			result.addFirst(li1.previous() + temp);
			temp = 0;
		}
		while (li2.hasPrevious()) {
			result.addFirst(li2.previous() + temp);
			temp = 0;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
	    System.out.println("Checking input...");
	    LinkedList<Integer> op1 = new LinkedList<>();
	    LinkedList<Integer> op2 = new LinkedList<>();
	    
	    op1.add(2);
	    op1.add(1);
	    op1.add(7);
	    op1.add(8);
	    
	    op2.add(5);
	    op2.add(9);
	    op2.add(6);

	    LinkedList<Integer> result = sum(op1, op2);
	    LinkedList<Integer> correct = new LinkedList<>();
	    correct.add(2);
	    correct.add(7);
	    correct.add(7);
	    correct.add(4);
	    
	    System.out.println(correct);
	    System.out.println(result);

	 
	  }
}
