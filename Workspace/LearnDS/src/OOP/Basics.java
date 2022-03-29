package OOP;
import java.util.Scanner;

public class Basics {

	//It is the easiest way to read input in a Java program, though not very efficient if you want an input method for 
	// scenarios where time is a constraint like in competitive programming.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How to read from the Console 
		Scanner sc = new Scanner(System.in);
		  
        // String input
        String name = sc.nextLine();
  
        // Character input
        char gender = sc.next().charAt(0);
  
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();
  
        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
		
	}

}
