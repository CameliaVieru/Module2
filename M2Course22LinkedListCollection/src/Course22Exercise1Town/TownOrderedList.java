package Course22Exercise1Town;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TownOrderedList<T extends Comparable<Town>> {

	private List<Town> elements = new LinkedList<>();

	public boolean addInOrderedList(Town newElement) {
		ListIterator<Town> li = elements.listIterator();

		while (li.hasNext()) {
			int comparison = li.next().compareTo(newElement);

			if (comparison < 0) { 
			} 
			else if (comparison > 0) { 
				li.previous();
				li.add(newElement); 
				return true;
			} 
			else { 
				return false;
			}
		}
		li.add(newElement);
		return true;
	}

	@Override
	public String toString() {
		String ret = "";
		for(Town el : elements) {
			ret += el + " ";
		}
		return ret;
	}
}
