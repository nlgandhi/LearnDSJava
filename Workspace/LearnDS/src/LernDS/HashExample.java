package LernDS;
import java.util.*;

public class HashExample {

	
	public static void HashTableTest1() {
		
		// No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();
  
        // Initialization of a Hashtable using Generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();
  
        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
  
        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
		
	}
	
	
	//	In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access 
	//	them with an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access 
	// them by an index of another type (e.g. a String).
	public static void HashMapTest2() { 
		
		 // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    System.out.println(capitalCities.size());
	   
//	    Loop through the items of a HashMap with a for-each loop.
//	    Note: Use the keySet() method if you only want the keys, and use the values() 
//	    method if you only want the values:
	    
//	    for (String i : capitalCities.keySet()) {
//    	  System.out.println(i);
//    	}
//	    
//	    // Print values
//	    for (String i : capitalCities.values()) {
//	      System.out.println(i);
//	    }
	    
	    // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
	    
	}
	
	public static void HashMapTest1() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		  
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
  
        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));
  
        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        
	}
	
	// A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
	public static void HashSetTest1() {
		
		 HashSet<String> hs = new HashSet<String>();
		  
	        hs.add("Geeks");
	        hs.add("For");
	        hs.add("Geeks");
	        hs.add("Is");
	        hs.add("Very helpful");
	  
	        // Traversing elements
	        Iterator<String> itr = hs.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }		
	}
	
	public static void HashSetTest2() { 
		
		   HashSet<String> cars = new HashSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("BMW");
		    cars.add("Mazda");
		    System.out.println(cars);	
		    
		    cars.contains("Mazda");
		    
		    for (String i : cars) {
	    	  System.out.println(i);
	    	}
		    
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HastSetTest1();	
		HashSetTest2();	
		// HastMapTest1();
		// HashMapTest2();
		//HashTableTest1();
		
	}

}
