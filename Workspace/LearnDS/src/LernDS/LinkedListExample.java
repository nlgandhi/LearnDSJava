package LernDS;
import java.util.*;

// https://www.geeksforgeeks.org/java/?ref=leftbar

public class LinkedListExample {

	 static void LinkedListTest1() {
		
		 // TODO Auto-generated method stub
		 // Creating object of the class linked list
	     LinkedList<String> ll = new LinkedList<String>();

	     // Adding elements to the linked list
	     ll.add("A");
	     ll.add("B");
	     ll.addLast("C");
	     ll.addFirst("D");
	     ll.add(2, "E");

	     System.out.println(ll);

	     ll.remove("B");
	     ll.remove(3);
	     ll.removeFirst();
	     ll.removeLast();

	     System.out.println(ll);
	     
	}
	
	
	public static void main(String[] args) {
		
		LinkedListTest1();
		
	}

}
