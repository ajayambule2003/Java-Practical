//Java program to demonstrate use of static blocks
class Test {

	static int a = 10;
	static int b;
	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}
 
	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
	} 
	
}
