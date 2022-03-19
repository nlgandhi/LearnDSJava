package LernDS;
import java.util.*;

public class HashExample {


	// Hash Table and Hash Map are the same thing. 
	// HashMap and Hashtable store key and value pairs in a hash table. When using a Hashtable or HashMap, 
	// we specify an object that is used as a key and the value that you want to be linked to that key. 
	
	//  HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.
	//  HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper 
	//  synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
	//	HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
	//	HashMap is generally preferred over HashTable if thread synchronization is not needed.
	
	//	To access a value one must know its key. HashMap is known as HashMap because it uses a 
	//	technique called Hashing. Hashing is a technique of converting a large String to small String that represents the 
	//	same String. A shorter value helps in indexing and faster searches. HashSet also uses HashMap internally.
		
	
	//  HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
	
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
	// HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well,
	// but there should be only one null key object and there can be any number of null values.
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
	    
//	    for (Map.Entry<String, String> e : map.entrySet())
//            System.out.println("Key: " + e.getKey()
//                               + " Value: " + e.getValue());
	    
	    // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
	    
	}
	
	// HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more than 
	// 1 value but more than 1 key can contain a single value.
	
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
	        // An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
	        // It is called an "iterator" because "iterating" is the technical term for looping.
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
