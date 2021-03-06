package LernDS;
import java.util.*;

public class QueueExample {

	// Priority Queue is an abstract data type, which is similar to a queue, 
	// however, in the priority queue, every element has some priority. 
	/*
	 * Every item has a priority associated with it. An element with high priority
	 * is dequeued before an element with low priority.
	 * A priority queue is typically implemented using Heap data structure.
	 */
	
	
	public static void QueueTest1() {
		
		// Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
  
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
  
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
  
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
  
        // Printing the top element again
        System.out.println(pQueue.peek());
        
	}
	
	//  Deque, also known as a double-ended queue, is a data structure where we can add and 
	// remove the elements from both ends of the queue. 
	public static void QueueTest2() { 
		
		// Initializing an deque
        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);
  
        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
  
        System.out.println(de_que);
  
        // clear() method
        de_que.clear();
  
        // addFirst() method to insert the
        // elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);
  
        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);
  
        System.out.println(de_que);
		
	}
	
	//	  Deque Interface: This is a very slight variation of the queue data structure. 
	//	  Deque, also known as a double-ended queue, is a data structure where we can add and remove the elements 
	//	  from both ends of the queue. 
	public static void ArrayDequeTest() {
		
		// Initializing an deque
        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        
        System.out.println(de_que);
        de_que.clear();
        
        
        
        
	}
	
	
	
	public static void main(String[] args) {
		
		//QueueTest1();
		// QueueTest2();
		QueueTest2();
		
	}
	
}
