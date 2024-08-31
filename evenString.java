//Java program to print even length words in a string
class evenString {
	public static void printWords(String s) {

		String[] words = s.split(" ");
		int[] wordLengths = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			wordLengths[i] = words[i].length();
		}

		for (int i = 0; i < words.length; i++) {
			if (wordLengths[i] % 2 == 0) {
				System.out.println(words[i]);
			}
		}
	}
 
	public static void main(String[] args) {

		String s = "i am Java Developer";
		printWords(s);
	}
}
