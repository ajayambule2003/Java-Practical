// Java Program to find the if the arrays are equal 

import java.util.Arrays; 
public class array { 
	public static void main(String[] args) 
	{ 
		int a[] = { 30, 25, 40 }; 
		int b[] = { 30, 25, 40 }; 
 
		boolean result = Arrays.equals(a, b); 

		if (result == true) {  
			System.out.println("Two arrays are equal"); 
		} 
		else { 
			System.out.println("Two arrays are not equal"); 
		} 
	} 
}
