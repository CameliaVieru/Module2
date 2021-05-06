import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	    Queue<Integer> q1;
	    Queue<Integer> q2;
	    /** Initialize your data structure here. */
	    public StackUsingQueue() {
	        this.q1 = new LinkedList<Integer>();
	        this.q2 = new LinkedList<Integer>();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        q1.add(x);
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	       while(q1.size() != 1){
	           q2.add(q1.poll());
	       }
	        while(q2.size() != 0){
	            q1.add(q2.poll());
	        }
	        
	        return q1.poll();
	        
	    }
	    
	    /** Get the top element. */
	    public int top() {
	        while(q1.size() != 1){
	           q2.add(q1.poll());
	       }
	        while(q2.size() != 0){
	            q1.add(q2.poll());
	        }
	        
	        int toReturn = q1.poll();
	        q1.add(toReturn);
	        return toReturn;
	        
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return q1.size() == 0;
	    }
	

}
