// Java program to reverse() method of Collections class over ArrayList 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 

public class rev_coll { 

	public static void main(String[] args)
	{  
		List<String> mylist = new ArrayList<String>();

		mylist.add("practice");
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("JavaProgramming");

		System.out.println("Original List : " + mylist);

		Collections.reverse(mylist);

		System.out.println("Modified List: " + mylist);
	}
}
