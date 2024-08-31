// Java Program to find Sublist in a List 
import java.util.*; 

public class sublist { 

	public static void main(String[] argv) throws Exception 
	{ 
		try { 

			ArrayList<Integer> 
				arrlist = new ArrayList<Integer>(); 

			arrlist.add(1); 
			arrlist.add(4); 
			arrlist.add(9); 
			arrlist.add(25); 
			arrlist.add(36); 

			System.out.println("Original arrlist: "
							+ arrlist); 

			List<Integer> arrlist2 = arrlist.subList(2, 4); 

			System.out.println("Sublist of arrlist: "
							+ arrlist2); 
		} 
 
		catch (IndexOutOfBoundsException e) 
		{ 
			System.out.println("Exception thrown : " + e); 
		} 
 
		catch (IllegalArgumentException e) 
		{ 
			System.out.println("Exception thrown : " + e); 
		} 
	} 
}
