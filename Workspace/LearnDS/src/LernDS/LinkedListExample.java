package LernDS;
import java.util.*;

// https://www.geeksforgeeks.org/java/?ref=leftbar

public class LinkedListExample {

	
	 // The LinkedList class has all of the same methods as the ArrayList class because they both implement the 
	 // List interface. This means that you can add items, change items, remove items and clear the list in the same way.
	
	 // The LinkedList stores its items in "containers." The list has a link to the first container and each container 
	 // has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

	 static void LinkedListTest2() { 
		 
		   System.out.println("Method: LinkedListTest2");
		   LinkedList<String> cars = new LinkedList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
		    
		    
		    
		 
	 }
	
	 static void LinkedListTest1() {
		
		 // TODO Auto-generated method stub
		 // Creating object of the class linked list
		 System.out.println("Method: LinkedListTest1");
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
		
		// LinkedListTest1();
		LinkedListTest2();
		
	}

}
