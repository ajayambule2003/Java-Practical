//Java programming Methods to Replace Character in a String
public class replace {
    public static void main(String args[]) {

        String str = "Java Programming";

        int index = 6;
        char ch = 'm';

        System.out.println("Original String = " + str);

        str = str.substring(0, index) + ch
                + str.substring(index + 1);

        System.out.println("Modified String = " + str);
    }
}
