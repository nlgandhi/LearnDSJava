package LernDS;
import java.util.*;

public class ArrayListExample {


	// A vector provides us with dynamic arrays in Java. 
	// Though, it may be slower than standard arrays but can be helpful in programs where lots 
	// of manipulation in the array is needed. 
	public static void VectorTest() {
		
	    // Declaring the Vector
        Vector<Integer> v = new Vector<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            v.add(i);
  
        // Printing elements
        System.out.println(v);
  
        // Remove element at index 3
        v.remove(3);
  
        // Displaying the Vector
        // after deletion
        System.out.println(v);
  
        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
		
	}
	
	
	// --------------- ArrayList ---------------
	// The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be 
	// modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements 
	// can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
	// ----------------------------------------------------------------------------------------------------------------
	public static void ArrayListTest1() {
		
		// Declaring the ArrayList with
        // initial size n
//        ArrayList<Integer> al = new ArrayList<Integer>();
//  
//        // Appending new elements at
//        // the end of the list
//        for (int i = 1; i <= 5; i++)
//            al.add(i);
//  
//        // Printing elements
//        System.out.println(al);
//  
//        // Remove element at index 3
//        al.remove(3);
//  
//        // Displaying the ArrayList
//        // after deletion
//        System.out.println(al);
//  
//        // Printing elements one by one
//        for (int i = 0; i < al.size(); i++)
//            System.out.print(al.get(i) + " ");
//        
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        
        cars.get(0);
        cars.set(0, "Opel");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        
	}
	
	public static void main(String[] args) {
		 ArrayListTest1();
//		 VectorTest();
		 
	}

}







