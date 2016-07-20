package com.flowcontrol;

public class DoWhileStatement {
	
	public void dispense(int temp){
		
		do{
			System.out.println("the weather is sunny");
			break;
		}
		while (temp >= 29);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoWhileStatement st = new DoWhileStatement();
		st.dispense(38);
	}

}
