package com.collectionsandgenerics;

public class SimpleGeneric<T>{

		private T obj = null;
		
		public SimpleGeneric(T param){
			this.obj = param; 
		}
		
		public T getObj(){
			return this.obj;
		}
		
		public void printType(){
			System.out.println(obj.getClass().getName());
		}
}
