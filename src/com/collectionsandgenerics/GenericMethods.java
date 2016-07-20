package com.collectionsandgenerics;

/**
 * A method or constructor can contain generic type parameters, 
 * which makes the method or constructor generic. You define a 
 * generic method by declaring a generic type in angle brackets 
 * before the return value of the method. The scope of the generic 
 * type is only within the method.
 * 
 * @author jelica60589
 *
 */
public class GenericMethods {
	
	
	public static void main(String[] args) {
		shipping("Calculating:");
		calculate(10, 3);
	}
	
	//<T> = Generic type is the generic type used in here..
	public static<T> void shipping(T item){
		System.out.println(item.toString());
	}

	//<N> = numbers
	public static<N> void calculate(Number num1, Number num2){
		
		Number addRes = num1.intValue() + num2.intValue();
		System.out.println(num1.intValue() + " + " + num2.intValue() + " = " + addRes );
		
		Number multiplyRes = num1.intValue() * num2.intValue();
		System.out.println(num1.intValue() + " * " + num2.intValue() + " = " + multiplyRes );
		
		Number divRes = num1.intValue() / num2.intValue();
		System.out.println(num1.intValue() + " / " + num2.intValue() + " = " + divRes );
		
		Number subRes = num1.intValue() - num2.intValue();
		System.out.println(num1.intValue() + " - " + num2.intValue() + " = " + subRes );
	}
}
