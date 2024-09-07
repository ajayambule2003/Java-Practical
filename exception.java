// Java Program to Handle multiple exception
import java.io.*;

class exception {
	public static void main(String[] args)
	{
		try {
			int number[] = new int[20];
			number[21] = 30 / 9;

		}
		catch (ArrayIndexOutOfBoundsException
			| ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
