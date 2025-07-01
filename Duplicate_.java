 // Java code to illustrate remove duolicate of ArrayList using hashSet<> method 

import java.util.*; 

public class Duplicate_ { 
	public static void main(String args[]) 
	{   
		ArrayList<String>  
			 
			jpj = new ArrayList<String>(); 

		jpj.add("Java"); 
		jpj.add("Programming"); 
		jpj.add("Java"); 
		System.out.println("Original ArrayList : " 
						+ jpj); 

		System.out.println("\nUsing LinkedHashSet:\n"); 
 
		Set<String> set = new LinkedHashSet<>(jpj); 
		List<String> jpj1 = new ArrayList<>(set); 
		System.out.println("Modified ArrayList : "
						+ jpj1); 

		System.out.println("\nUsing HashSet:\n"); 
 
		Set<String> set1 = new HashSet<>(jpj); 

		List<String> jpj2 = new ArrayList<>(set); 
		System.out.println("Modified ArrayList : "
						+ jpj2); 
	} 
} 


