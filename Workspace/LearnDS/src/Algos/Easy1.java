package Algos;
import java.util.*;

public class Easy1 {

	// The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
	// Tip: Use the lastIndexOf method to return the position of the last occurrence of specified character(s) in a string.


	
	
	 // Check if the number is a Palindrome 
	 // Special cases:
     // As discussed above, when x < 0, x is not a palindrome.
     // Also if the last digit of the number is 0, in order to be a palindrome,
     // the first digit of the number also needs to be 0.
	 // Second idea would be reverting the number itself, and then compare the number with original number, 
	 // if they are the same, then the number is a Palindrome. However, if the reversed number is larger than 
	 // text{int.MAX}int.MAX, we will hit integer overflow problem.
	 // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
	
	 public static boolean isPalindrome(int x) {
	        
	        if (x < 0) {
	            return false;
	        }
	        
	        int revertNumber = 0;
	        while (x > revertNumber) {
	            revertNumber = revertNumber * 10 + x % 10;
	            x = x /10;
	        }
	        
	        // since the middle digit doesn't matter in palidrome(it will always equal to itself), 
	        // we can simply get rid of it.        
	        if (x ==  revertNumber) {
	            return true;
	        } else {
	            return false;
	        }

	    }
	
	
	// It turns out we can do it in one-pass. While we are iterating and inserting elements into the hash table,
	// we also look back to check if current element's complement already exists in the hash table. If it exists, 
	// we have found a solution and return the indices immediately.
	 public static int[] twoSum_sol3(int[] nums, int target) {
	        
	    // Create a empty Hash Map
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++ ) {
	         // Get the difference we are looking for 
	         // If it does not exist add it otherwise we found if.
	         int difference = target - nums[i];   
	         if (map.containsKey(difference)) {
	             return new int[] { map.get(difference), i };
	         }
	         map.put(nums[i], i);
	    }    
	     return null;
	  }
	
	 
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
	// Time complexity: O(n^2)O(n 2). For each element, we try to find its complement by looping through the rest of the array which takes O(n)O(n) time. Therefore, the time complexity is O(n^2)O(n 2 ).
    // We can reduce the lookup time from O(n)O(n) to O(1)O(1) by trading space for speed. A hash table is well suited for this purpose because it supports fast lookup in near constant time. 
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
		
		// Example 1 - Two Sum Test Cases
//		int[] nums = {2,7,11,15}; 
//		int[] retIndex =  twoSum_sol3(nums, 9);
//		System.out.println(retIndex[0]);
//		System.out.println(retIndex[1]);
		
		// Example 2 - Check if a Number is a Palindrome
		int intTestNumber = 1221;
		System.out.println(isPalindrome(intTestNumber));
		
		
		
	}

}
