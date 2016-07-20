package Concurrency;

/**
 * Main class to execute the RunnabaleInterface class.
 */
public class RunnableInterfaceMain {

	public static void main(String[] args) {
		
		System.out.println("Executing the program...");
		
		RunnableInterface r = new RunnableInterface();

		//create a new thread instance
		Thread t = new Thread(r, "First Thread");
		//start the thread
		t.start();
		
		//second thread created 
		Thread t2 = new Thread (r, "Second Thread");
		//start second thread
		t2.start();
	}
}
