package Algos;
import java.util.*;

public class Easy1 {

	 // Brute Force approach two For loops and HashMap
	 public static int[] twoSum_sol2(int[] nums, int target) {
	        
	      // Move the data into the HashMap
	      Map<Integer, Integer> map = new HashMap<>();
	      for (int i=0; i < nums.length; i++) {
	          map.put(nums[i], i);
	      }
	      
	      for (int i=0; i < nums.length; i++) { 
	         // Once you have the difference you can look if the data is available in the Map  
	         // available in the MAP
	         int difference = target - nums[i];
	         if (map.containsKey(difference)) {
	             // If the Key which os the value exists then get the difference
	             return new int[] {i, map.get(difference)} ;              
	         }
	       }
	               
	       return null;
	    
	    }
	
	
	// Brute Force Approch using two for loops.
	// O(N-Square) 
    public static int[] twoSum_sol1(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            //System.out.println(nums[i]);
            for (int j = 0; j < nums.length; j++) {                                
                 //System.out.println(nums[i]);
                if (nums[i] + nums[j] == target) {
//                	System.out.println(i);
//                	System.out.println(j);
                    return new int[] {i, j};
                }
            }                        
        }
        
        return null;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15}; 
		int[] retIndex =  twoSum_sol2(nums, 9);
		System.out.println(retIndex[0]);
		System.out.println(retIndex[1]);
	}

}