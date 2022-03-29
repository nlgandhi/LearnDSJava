package LernDS;
import java.util.*;

public class StackExample {

	// Create two private variables 
	private static final Map<Character, Character> matchingParanMap = new HashMap<>();
	private static final Set<Character> openingParanSet = new HashSet<>();
	
	// If you need to do the computation in order to initialize your static variables, 
	// you can declare a static block that gets executed exactly once, when the class is first loaded. 
	static {		
		matchingParanMap.put(')', '(');
		matchingParanMap.put('{', '{');
		matchingParanMap.put(']', '[');		
		openingParanSet.addAll(matchingParanMap.values());
	}
	
	public static boolean HasMatchParameters(String input) {
		
		try {
			Stack<Character> parenStack = new Stack<>();
			for (int i=0; i < input.length(); i++) {	
				char ch = input.charAt(i);
				// System.out.println(ch);
				// Add to the stack for an opening paren
				if (openingParanSet.contains(ch)) {
					parenStack.push(ch);
					//System.out.println(parenStack.peek());
				}
				// START HERE 
				
				if (matchingParanMap.containsKey(ch)) {
					Character lastParen = parenStack.pop();
					if (lastParen != matchingParanMap.get(ch)) {
						return false;
					}
				}
					
			}
			return parenStack.isEmpty();	
		} catch (StackOverflowError soe) {
			System.err.println("Stack Overfow");
		}
		return false;		
	}
	
	// The class is based on the basic principle of last-in-first-out. (LIFO)
	public static void StackTest1() {
		
		 Stack<String> stack = new Stack<String>();
	        stack.push("Priya");
	        stack.push("Nitin");
	        stack.push("Tanisha");
	        stack.push("Tanay");
	  
	        // Iterator for the stack
	        Iterator<String> itr = stack.iterator();
	  
	        // Printing the stack
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
	  
	        System.out.println();
	  
	        stack.pop();
	  
	        // Iterator for the stack
	        itr = stack.iterator();
	  
	        // Printing the stack
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
		
	}
	
	public static void main(String[] args) {
		
		//StackTest1();
		HasMatchParameters("{H[]ello}");
		
	}
	
}
