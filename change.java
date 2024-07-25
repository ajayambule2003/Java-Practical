// Java Program to Interchange Elements of First and Last Column in a Matrix

import java.io.*;

class change {
    static int N = 3;

    static void Swap_First_Last(int mat[][]) {
        int cls = N;
        for (int j = 0; j < N; j++) {
            int temp = mat[j][0];
            mat[j][0] = mat[j][N - 1];
            mat[j][N - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++) {
                System.out.print(mat[j][k] + " ");
            }

            System.out.println();
        }
        System.out.println("Swapped Matrix as follows : ");
        Swap_First_Last(mat);

        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++)
                System.out.print(mat[j][k] + " ");
            System.out.println();
        }
    }
}
