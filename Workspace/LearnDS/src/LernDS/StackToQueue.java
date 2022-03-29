package LernDS;
import java.util.*;

public class StackToQueue {

	// https://www.geeksforgeeks.org/queue-using-stacks/
	static class Queue {
		
		 static Stack<Integer> s1 = new Stack<Integer>();
		 static Stack<Integer> s2 = new Stack<Integer>();
		 		
		 static void enQueue(int x) {

			 // First move all the elements from s1 to S2
			 // Time Complexity - Push operation: O(N). 
			 while (!s1.isEmpty()) {				 
				 s2.push(s1.pop());
			 }
			 
			 // Add the int data to s1
			 // Pop operation: O(1). 
			 // 1) Push x to stack1 (assuming size of stacks is unlimited). Here time complexity will be O(1)
			 s1.push(x);
			 // Auxiliary Space: O(N). 
			 
			 // Push s2 data back into s1
			 while (!s2.empty()) {				 
				 s1.push(s2.pop());				 
			 }
			 			 
		 }
		 
		 static int deQueue() 
		 {
			 
			 if (s1.isEmpty()) {
				 System.out.println("The Queue is empty");
				 System.exit(0);
			 }
			 
			 int x = s1.peek();
			 s1.pop();
			 return x;
			 
		 }
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Queue q = new Queue();
		 q.enQueue(1);
		 q.enQueue(2);
		 q.enQueue(3);
		 
		 System.out.println(q.deQueue());
		 System.out.println(q.deQueue());
		 System.out.println(q.deQueue());

	}

}
