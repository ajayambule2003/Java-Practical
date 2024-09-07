// java program find min and max value of unsorted list by using Collection 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 

public class unsorted_collection { 
	public static Integer findMin(List<Integer> list) 
	{ 
		if (list == null || list.size() == 0) { 
			return Integer.MAX_VALUE; 
		} 

		List<Integer> sortedlist = new ArrayList<>(list); 
		Collections.sort(sortedlist); 

		return sortedlist.get(0); 
	} 
	public static Integer findMax(List<Integer> list) 
	{ 

		if (list == null || list.size() == 0) { 
			return Integer.MIN_VALUE; 
		} 
		List<Integer> sortedlist = new ArrayList<>(list); 

		Collections.sort(sortedlist); 
		return sortedlist.get(sortedlist.size() - 1); 
	} 

	public static void main(String[] args) 
	{ 
		List<Integer> list = new ArrayList<>(); 

		list.add(44); 
		list.add(11); 
		list.add(22); 
		list.add(33); 

		System.out.println("Min: " + findMin(list)); 
		System.out.println("Max: " + findMax(list)); 
	} 
} 
