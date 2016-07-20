package com.api.contents;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * DataInputStream and DataOutputStream classes are high - level streams that contain methods for reading and writing
 * the eight Java primitive types as well as String objects.
 *
 * DataInputStream class lets an application read primitive Java data types.
 */
public class DataInputStreamAndDataOutputStream {

	 public static void main(String[] args) throws IOException {
	        DataOutputStream dataOutputStream =
	                new DataOutputStream(
	                        new FileOutputStream("C:\\Users\\jelica60589\\Desktop\\inputoutptstream.txt"));

        dataOutputStream.writeInt(12345678);
	        dataOutputStream.writeFloat(123.45F);
	        dataOutputStream.writeLong(789);
	        
	        dataOutputStream.close();
	      //  DataInputStream dataInputStream =
	      //          new DataInputStream(
	      //                  new FileInputStream("C:\\Users\\jelica60589\\Desktop"));

//	        int   int123     = dataInputStream.readInt();
//	        float float12345 = dataInputStream.readFloat();
//        long  long789    = dataInputStream.readLong();

//	        dataInputStream.close();

//	        System.out.println("int123     = " + int123);
//	        System.out.println("float12345 = " + float12345);
//	        System.out.println("long789    = " + long789);
	    }

}