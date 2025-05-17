// Java Program to rename a file 
import java.io.File; 
public class rename { 
	public static void main(String[] args) 
	{  
		File file = new File("/home/mayur/Folder/rename.java");  
		File rename = new File("/home/mayur/Folder/HelloWorld.java"); 
		boolean flag = file.renameTo(rename); 

		if (flag == true) { 
			System.out.println("File Successfully Rename"); 
		}
		else {
			System.out.println("Operation Failed"); 
		}
	}
	
}
