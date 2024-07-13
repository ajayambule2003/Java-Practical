
// Java Program to convert string to object 
import java.io.*;
import java.util.*;

class convert_string {
	public static void main(String[] args) {

		String s = "hereajay ";

		Object object = s;

		System.out.println("Datatype of the variable in object is : "
				+ object.getClass().getName());

		System.out.println("object is : " + object);
	}
}
