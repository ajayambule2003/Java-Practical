// Java program to demonstrate use of hasNext() method

import java.io.*;
import java.util.*;

class hasNext {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("Programming ");

		Iterator<String> iterator = list.iterator();
		System.out.println(iterator.hasNext());

		iterator.next();
		System.out.println(iterator.hasNext());
          	iterator.next();

		System.out.println(iterator.hasNext());
	}
}
