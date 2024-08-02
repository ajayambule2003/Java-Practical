// Java Program to Append a String to the End of a File

import java.io.*;
class end {

	public static void appendStrToFile(String fileName,
									String str)
	{

		try {

			BufferedWriter out = new BufferedWriter(
				new FileWriter(fileName, true));

			out.write(str);
		out.close();
		}

		catch (IOException e) {
			System.out.println("exception occurred" + e);
		}
	}
	public static void main(String[] args) throws Exception
	{
		String fileName = "end.txt";
		try {

			BufferedWriter out = new BufferedWriter(
				new FileWriter(fileName));
			out.write("Hello World:\n");
			out.close();
		}

		catch (IOException e) {

			System.out.println("Exception Occurred" + e);
		}

		String str = "This is Java Programming";

		appendStrToFile(fileName, str);

		try {
			BufferedReader in = new BufferedReader(
				new FileReader("end.txt"));

			String mystring;
			while ((mystring = in.readLine()) != null) {
				System.out.println(mystring);
			}
		}
		catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
	}
}
