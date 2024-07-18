
// package practical;
// Java Program to print Butterfly Pattern
import java.util.Scanner;

public class star7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter youe nuumber");

        int n = in.nextInt();
        int k;
        // for (int i =n;i>=1;i--) { // triangle

        for (int i = 1; i <= n; i++) { // // it's a triangle
            for (int j = i; j < n; j++) { // n replace to i then right angle triangle

                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
