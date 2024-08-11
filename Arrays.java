
// Java program to array rotation
import java.io.*;

class Arrays {
    static void Rotate(int arr[], int d, int n) {

        int temp[] = new int[n];
        int k = 0;

        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    static void PrintTheArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        int d = 2;

        Rotate(arr, d, N);
        PrintTheArray(arr, N);
    }

    public static String toString(String[] arr1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    public static Object asList(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }
}
