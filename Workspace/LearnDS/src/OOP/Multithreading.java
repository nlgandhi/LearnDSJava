package OOP;

public class Multithreading extends Thread {

	//	Threads can be created by using two mechanisms : 
	//		Extending the Thread class 
	//		Implementing the Runnable Interface
	
	//	If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple 
	//	inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.
	
	//	A thread in Java at any point of time exists in any one of the following states. A thread lies only in one of the 
	// shown states at any instant: 
	//		New
	//		Runnable
	//		Blocked
	//		Waiting
	//		Timed Waiting
	//		Terminated
	
	// Create a Run Method in the class that extends the Thread class
	public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  	int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Multithreading object = new Multithreading();
            object.start();
        }
	}

}
