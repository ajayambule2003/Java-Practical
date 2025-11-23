
// Java Program to Handle Checked Exceptio Where FileInputStream
import java.io.*;

public class new1 {
 
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/Desktop/new1.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {

			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
