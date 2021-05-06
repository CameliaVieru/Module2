import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Dandu-se un array de forma:
["cristi", "are", "cristi", "devmind", "test", "test", "cristi"]
 
Afisati fiecare string urmat de numarul de aparitii ale acestuia in cadrul arrayului, sub forma:
 
cristi -> 3
are -> 1
devmind -> 1
test -> 2
 
Follow up: afisati elementele in ordine alfabetica
 */
public class ExerciseC {
	public static void main (String[] args) {
		String[] array = {"cristi", "are", "cristi", "devmind", "test", "test", "cristi"};
		ArrayList<String> myList = new ArrayList<>();

		Map<String, Integer> occ = new HashMap<String, Integer>();
		for(int i = 0; i < array.length; i++) {
			myList.add(array[i]);
		}
		
		Collections.sort(myList);
		
		for(String s: myList) {
			if(!occ.containsKey(s)) {
				occ.put(s, 1);
			}
			
			else {
				occ.put(s, occ.get(s)+1);
			}
		}
		System.out.println(occ);
		
	}
}