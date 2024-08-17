// Java Program to Search for a File in a Directory 
import java.io.*; 

class MyFilenameFilter implements FilenameFilter { 
	
	String initials; 

	public MyFilenameFilter(String initials) 
	{ 
		this.initials = initials; 
	} 
	
	public boolean accept(File dir, String name) 
	{ 
		return name.startsWith(initials); 
	} 
} 

public class Main { 
	
	public static void main(String[] args) 
	{ 
 
		File directory = new File("/home/user/"); 
		MyFilenameFilter filter 
			= new MyFilenameFilter("file.cpp"); 
		String[] flist = directory.list(filter); 

		if (flist == null) { 
			System.out.println( 
				"Empty directory or directory does not exists."); 
		} 
		else { 
 
			for (int i = 0; i < flist.length; i++) { 
				System.out.println(flist[i]+" found"); 
			} 
		} 
	} 
}
