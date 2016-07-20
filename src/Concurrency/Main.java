package Concurrency;

public class Main {
	public static void main(String [] args) {
		ThreadClass myThread = new ThreadClass("Hooray!");
		myThread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}

		myThread.setKeepGoing(false);
		System.out.println("\nEnd of main");
	}
}