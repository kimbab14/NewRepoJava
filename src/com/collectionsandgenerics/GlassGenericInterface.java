package com.collectionsandgenerics;

public class GlassGenericInterface implements GenericInterface<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlassGenericInterface gi = new GlassGenericInterface();
		gi.doBreak("im breaking");
	}

	@Override
	public void doBreak(String message) {
		// TODO Auto-generated method stub
		System.out.println("Breaking a Glass: " + message);
	}
}
	