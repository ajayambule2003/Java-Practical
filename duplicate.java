// Java program to remove duplicates from ArrayList 

import java.util.*; 
public class duplicate { 

	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
	{ 
		ArrayList<T> newList = new ArrayList<T>(); 

		for (T element : list) { 
			if (!newList.contains(element)) { 

				newList.add(element); 
			} 
		} 
		return newList; 
	} 
 
	/**
	 * @param args
	 */
	public static void main(String args[]) 
	{ 
		// ArrayList<Integer> 
		// 	list = new ArrayList<>( 
		// 		Arrays 
		// 			.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)); 
		// System.out.println("ArrayList with duplicates: "
		// 				+ list); 

	// 	ArrayList<Integer> 
	// 		// newList = removeDuplicates( );  
	// 	// System.out.println("ArrayList with duplicates removed: "
	// 					+ newList); 
	} 
} 
