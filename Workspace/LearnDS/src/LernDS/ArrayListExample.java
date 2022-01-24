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
	
	public static void ArrayListTest1() {
		
		// Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);
  
        // Printing elements
        System.out.println(al);
  
        // Remove element at index 3
        al.remove(3);
  
        // Displaying the ArrayList
        // after deletion
        System.out.println(al);
  
        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
        
	}
	
	public static void main(String[] args) {
//		 ArrayListTest1();
		 VectorTest();
		 
	}

}







