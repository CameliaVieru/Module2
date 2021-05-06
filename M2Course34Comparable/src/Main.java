import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Students> students = new LinkedList<>();
        students.add(new Students("Andrei", "Georgescu", 8.3));
        students.add(new Students("Ioana", "Grama", 7.2));
        students.add(new Students("Mihai", "Chioveanu", 6.8));
        students.add(new Students("Andrei", "Georgescu", 9.5));
        students.add(new Students("Elena", "Avram", 5.1));
 
        System.out.println(students);
 
        Collections.sort(students);
 
        System.out.println("The sorted list:");
        System.out.println(students);
 
    }
}
