package LernDS;
import java.util.*;

public class StackExample {

	// The class is based on the basic principle of last-in-first-out. (LIFO)
	public static void StackTest1() {
		
		 Stack<String> stack = new Stack<String>();
	        stack.push("Priya");
	        stack.push("Nitin");
	        stack.push("Tanisha");
	        stack.push("Tanay");
	  
	        // Iterator for the stack
	        Iterator<String> itr = stack.iterator();
	  
	        // Printing the stack
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
	  
	        System.out.println();
	  
	        stack.pop();
	  
	        // Iterator for the stack
	        itr = stack.iterator();
	  
	        // Printing the stack
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
		
	}
	
	public static void main(String[] args) {
		
		StackTest1();
		
	}
	
}
