// Java program to Get the size of a directory

import java.io.File;
class FileD {
	private static long getFolderSize(File folder)
	{
		long length = 0;
		File[] files = folder.listFiles();

		int count = files.length;
		for (int i = 0; i < count; i++) {
			if (files[i].isFile()) {
				length += files[i].length();
			}
			else {
				length += getFolderSize(files[i]);
			}
		}
		return length;
	}
	public static void main(String[] args)
	{
		File file1 = new File("/home/mayur/Downloads");

		long size = getFolderSize(file1);
		System.out.println("Size of " + file1 + " is "
						+ size + " B");
		System.out.println("Size of " + file1 + " is "
						+ (double)size / 1024 + " KB");
				System.out.println("Size of " + file1 + " is "
						+ (double)size / (1024 * 1024)
						+ " MB");
	}
}
