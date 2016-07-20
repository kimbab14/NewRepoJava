package com.api.contents;

/**
 * 
 * Object serialization refers to taking the state of an object and writing it to a stream.
 * You can use serialization to persistently store your objects in files. 
 * You can also serialize an object and send it across the network to another Java program 
 * or save it in a database.Deserialization refers to the process of reading the data from 
 * an object stream and reconstituting the object in memory. Not all objects can be 
 * serialized; only objects whose classes implement the java.io.Serializable interface.
 *
 * all the primitive types are serializable.
 */
public class SerializableInterface implements java.io.Serializable {
	
	//simple serialisation
	public String studentName;
	public int studentAge;
	public String studentGrade;
	
	public SerializableInterface (String aStudentName, int aStudentAge, String aStudentGrade){
		this.studentName = aStudentName;
		this.studentAge = aStudentAge;
		this.studentGrade = aStudentGrade;
	}
	
	public String getInformation(){
		System.out.println("Student Name: " + studentName + " \n" + "Student Age: " +
							studentAge + " \n" + "Student Grade: " + studentGrade);
		return studentName + " \n" + studentAge + " \n" + studentGrade; 	
	}
	
	public static void main(String[] args) {
		SerializableInterface obj  = new SerializableInterface("Jelica", 26, "B");
		obj.getInformation();
	}
}
