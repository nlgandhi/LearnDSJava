package LernDS;
import java.util.*;

public class HashExample {

	public static void HastSetTest1() {
		
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
		HastSetTest1();		
	}

}