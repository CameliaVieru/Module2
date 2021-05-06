import java.util.Stack;

public class MinStack {
	  Stack<Integer> myStack = new Stack<Integer>();
	  Stack<Integer> minStack = new Stack<Integer>();

    /** initialize your data structure here. */
    public MinStack() {

    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val <= minStack.peek()){
             minStack.push(val);
        }
        
        myStack.push(val);
    }
    
    public void pop() {
        if(myStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        myStack.pop();
    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

