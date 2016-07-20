package Concurrency;

public class MyThreads extends Thread {
	
	public static void main(String[] args) {
		//creating a Thread
		MyThreads threads = new MyThreads();
		//to start the thread you need to call it like this
		threads.start();
	}
	
	public void run(){
		System.out.println("MyThread running");
	}
	
}
