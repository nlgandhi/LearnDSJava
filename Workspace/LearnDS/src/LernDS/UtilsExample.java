package LernDS;
import java.io.*;
import java.util.*;  

public class UtilsExample {

	public static void readinput() throws IOException {
		
//		 // Creating BufferedReader Object
//	    // InputStreamReader converts bytes to 
//	    // stream of character
//	    BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
//	                        
//	      // Asking for input from user
//	      System.out.println("Enter String : ");
//	      System.out.println("Enter Integer : ");
//	                        
//	      // String reading internally 
//	      String str = bfn.readLine();
//	                   
//	      // Integer reading internally
//	      int it = Integer.parseInt(bfn.readLine());
//	                        
//	      // Printing String
//	      System.out.println("Entered String : "+ str);
//	                        
//	      // Printing Integer               
//	      System.out.println("Entered Integer : "+ bfn);  
		
		 // Scanner definition
	    Scanner scn= new Scanner(System.in);
	    System.out.println("Enter String : ");
	    String str= scn.nextLine();
	    System.out.println("Entered String : "+ str);
	      
//	    // input is an Integer read by nextInt() function
//	    int x= scn.nextInt();
//	      
//	    // print integer
//	    System.out.println("Entered Integer : "+ x);
//	      
//	    // input is a floatingValue read by nextFloat() function
//	    float f = scn.nextFloat();
//	      
//	    // print floating value
//	    System.out.println("Entered FloatValue : "+ f);
		
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readinput();
		
	}

}
