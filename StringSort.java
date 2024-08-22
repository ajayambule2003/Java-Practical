// Java program for Sorting a String without using any inbuilt sorting functions
import java.io.*;

class StringSort {
    void merge(char arr[], int l, int m, int r)
    {
        
        int n1 = m - l + 1;
        int n2 = r - m;

        char L[] = new char[n1];
        char R[] = new char[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void mergeSort(char arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
          
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
          
            merge(arr, l, m, r);
        }
    }
    static void printArray(char arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        String inputString = "Java Programming";
        char arr[] = inputString.toCharArray();

        System.out.println("Given array is");
        printArray(arr);

        StringSort ob = new StringSort();
        ob.mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }
}
