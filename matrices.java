// Java program to find the trace and normal of the given matrix

import java.io.*;

class matrices {
    static int max = 50;

    static int Normal(int matrix[][], int N) {

        int s = 0;
        for (int j = 0; j < N; j++)
            for (int k = 0; k < N; k++)
                s += matrix[j][k] * matrix[j][k];
        return (int) Math.sqrt(s);
    }

    static int Trace(int matrix[][], int N) {
        int s = 0;
        for (int j = 0; j < N; j++)
            s += matrix[j][j];
        return s;
    }

    public static void main(String[] args) {

        int matrix[][] = {
                { 2, 3, 5, 6, 7 }, { 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17 }, { 18, 1, 3, 0, 6 },
                { 7, 8, 11, 8, 11 },
        };

        System.out.println("Trace of the Matrix is: "
                + Trace(matrix, 5));
        System.out.println("Normal of the Matrix is: "
                + Normal(matrix, 5));
    }
}
