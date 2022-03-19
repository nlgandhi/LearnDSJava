package OOP;
import java.util.*;

// Declaring an abstract class
abstract class Animal {
 
    // Declaring an abstract method
    public abstract String getSound();
    
}


//Declaring a class Cat by extending
//the above Animal class
class Cat extends Animal {

 // Implementing the above
 // abstract method of animal class
 public String getSound() { return "Meow!"; }

 // main method
 public static void main(String[] args)
 {
     // Creating an object of type class Cat
     Cat c = new Cat();

     // Calling getSound method
     System.out.println(c.getSound());
 }
 
}
	

