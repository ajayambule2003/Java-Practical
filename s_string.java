import java.io.*;

class s_string {

	public static void main(String[] args) {
		double num = 12.345;
		String str = num + "";
		System.out.println(str);

		System.out.println(
				"Type of num : "
						+ ((Object) num).getClass().getSimpleName());

		System.out.println(
				"Type of str : "
						+ ((Object) str).getClass().getSimpleName());
	}
}
