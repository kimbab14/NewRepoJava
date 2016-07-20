package com.flowcontrol;

/**
 * This is an example of while statement 
 *
 */
public class WhileStatement {
	
	public void dispense(int temp){
		while (temp >= 29){
			System.out.println("The weather is sunny");
			break; 
		}
		System.out.println("its raining");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileStatement st = new WhileStatement();
		st.dispense(28);
	}
}
