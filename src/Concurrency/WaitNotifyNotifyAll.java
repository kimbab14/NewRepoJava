package Concurrency;

public class WaitNotifyNotifyAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void checkTemp(){
		int water = 0;
		while ( water <= 50){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void despense(){
		//if the water >= 50 then
		notify();
		//notifyAll() if i want to notify the whole thread..
	}
}
