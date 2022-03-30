package Algos;
import java.util.*;

public class MinimumStack {

	// Setup one stack to hold the information and another to hold the minimum element.
	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> minimumStack = new Stack<>();
	
	public void push(int data) {
		int min = data;
		
		// ------------------------------------------------------------------------------------------------
		// Intercept the call and check if the data coming in is larger or smaller than the data coming in.
		// Find the minimum between the element just added and the top of the minimum stack
		// ------------------------------------------------------------------------------------------------
		if (!minimumStack.isEmpty()) {
			if (min > minimumStack.peek()) {
			     min = minimumStack.peek();
			}
		}
		
		// Push the element on the stack and the minimum element on the minimum stack
		stack.push(data);
		minimumStack.push(min);
	}
	
	// Pop should POP elements from Both Stacks
	public int pop() {
		minimumStack.pop();
		return stack.pop();
	}

	public int getMinimum() {
		// Get Minimum is now a 0(1) operation. 
		return minimumStack.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}


	

