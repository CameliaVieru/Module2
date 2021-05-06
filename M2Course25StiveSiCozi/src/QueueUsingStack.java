import java.util.Stack;

public class QueueUsingStack {

	    Stack<Integer> s1;
	    Stack<Integer> s2;
	    /** Initialize your data structure here. */
	    public QueueUsingStack() {
	        s1 = new Stack<Integer>();
	        s2 = new Stack<Integer>();
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        s1.add(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        if(s2.isEmpty()){
	           while(!s1.isEmpty()){
	            int aux = s1.pop();
	            s2.push(aux);
	           }
	        }
	        return s2.pop();
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	         if(s2.isEmpty()){
	            while(!s1.isEmpty()){
	             int aux = s1.pop();
	             s2.push(aux);
	            }
	        }
	        return s2.peek();
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return s2.isEmpty() && s1.isEmpty();
	    }
	    
	
}
