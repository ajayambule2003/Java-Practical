// Java program to find HCF numbers 
class HCF {

	static int GCD(int x, int y) {

		if (x == 0)
			return y;
		if (y == 0)
			return x;

		if (x == y)
			return x;
		if (x > y)
			return GCD(x - y, y);
		return GCD(x, y - x);
	}

	// Through that we

	public static void main(String[] args) {
		int x = 100, y = 88;
		System.out.println("GCD of " + x + " and " + y
				+ " is " + GCD(x, y));
	}
}
