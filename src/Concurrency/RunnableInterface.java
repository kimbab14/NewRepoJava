package Concurrency;

/**
 * To make a class Runnable it needs to implement the Runnable class.
 * The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. 
 * The class must define a method of no arguments called run.
 * 
 * The Runnable interface is used to define a certain task that we want to execute, and the whole implementation
 * of this task is inside its only method, run() (which accepts no arguments).
 */
public class RunnableInterface implements Runnable {
	
	public void run() {
		for (int i = 0; i <= 10; i++){
			System.out.println(Thread.currentThread().getName() +
			"\twith Runnable: MyRunnableImplementation runs..." + i);
		}
	}
}