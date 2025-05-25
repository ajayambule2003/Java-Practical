// Java Program to Rotate Elements of the List 

import java.io.*; 
import java.util.*; 
class Rotate{ 
	public static void main(String[] args) 
	{ 

		List<Integer> my_list = new ArrayList<>(); 
		my_list.add(10); 
		my_list.add(20);  
		my_list.add(30); 
		my_list.add(40); 
		my_list.add(50); 
		my_list.add(60); 
		my_list.add(70); 

		System.out.println( 
			"List Before Rotation : "
			+ Arrays.toString(my_list.toArray())); 
 
		for (int i = 0; i < 4; i++) { 
			
			int temp = my_list.get(0); 
	 
			for (int j = 0; j < 6; j++) { 
				my_list.set(j, my_list.get(j + 1)); 
			} 
			my_list.set(6, temp); 
		} 
		System.out.println( 
			"List After Rotation : "
			+ Arrays.toString(my_list.toArray())); 
	} 
}
