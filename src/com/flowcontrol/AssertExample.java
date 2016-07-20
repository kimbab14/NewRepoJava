package com.flowcontrol;

/*
 * This is an example of Assert statement in java
 */
public class AssertExample {

	public static void main(String[] args)
    {
       String s1 = "11";
       AssertExample objAssert = new AssertExample();
       assert objAssert.checkInteger(s1);
    }

    public boolean checkInteger(String s)
    {
      //try and catch statement where 
      try{
    	  //if the input parameter is integer then convert string into int and return true
           Integer.parseInt(s);
           System.out.println("I am an integer...");
           return true;
         }
      //else catch the error exception 
       catch(Exception e)
        {
           return false;
        }
    }
}
