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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HastSetTest1();	
		// HastMapTest1();
		HashTableTest1();
		
	}

}
