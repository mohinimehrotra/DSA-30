package DSA;
import java.util.Stack;

public class QueueUsingStack {

	    private Stack<Integer> stack1;
	    private Stack<Integer> stack2;

	    public QueueUsingStack() {
	        stack1 = new Stack<>();
	        stack2 = new Stack<>();
	    }

	    public void push(int x) {
	        stack1.push(x);
	    }

	    public int pop() {
	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }
	        return stack2.pop();
	    }

	    public int peek() {
	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }
	        return stack2.peek();
	    }

	    public boolean empty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }
	

	
	    public static void main(String[] args) {
	    	QueueUsingStack obj = new QueueUsingStack();
	        obj.push(1);
	        obj.push(2);
	        obj.push(3);
	        System.out.println("Pop: " + obj.pop());    
	        System.out.println("Peek: " + obj.peek());
	        System.out.println("Empty: " + obj.empty()); 
	        System.out.println("Pop: " + obj.pop());   
	        System.out.println("Pop: " + obj.pop());    
	        System.out.println("Empty: " + obj.empty()); 
	    }
	}



