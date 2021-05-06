import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Course23Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();
		System.out.println(checkIfValid(myString));
		sc.close();
	}
	
	public static boolean checkIfValid(String s) {
		Deque<Character> stack = new ArrayDeque<Character>();
		  for (char c : s.toCharArray()) {
		    if (c == '(')
		      stack.push(')');
		    else if (c == '{')
		      stack.push('}');
		    else if (c == '[')
		      stack.push(']');
		    else if (stack.isEmpty() || stack.pop() != c)
		      return false;
		  }
		  return stack.isEmpty();
		
	}
}
