package Concurrency;

/**
 * Threads is used to create a new execution path (a new thread), 
 * separate from the main program. By providing a Runnable as an 
 * argument to a Thread constructor, you are essentially giving access 
 * of the Runnable’s task (defined in the run() method), to a new Thread object. 
 * At any time during your program you can start the new thread, 
 * by using Thread.start() and the Runnable’s code will start running.
 */
public class ThreadClass extends Thread{
	
	private String message;
    private boolean keepGoing;
	
	public ThreadClass(String m) {
		message = m;
		keepGoing = true;
	}
	
	public void setKeepGoing(boolean b) {
		keepGoing = b;
	}
	
	public void run() {
		while(keepGoing) {
			System.out.print(message + " ");
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Gone!");
	}
}
