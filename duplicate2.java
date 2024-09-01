// Java program to remove duplicates
import java.util.HashSet;
import java.util.Set;

public class duplicate2 {
    static int removeDuplicates(int[] arr, int n) {
        if (n <= 1)
            return n;

        Set<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < n; ++i) {
            uniqueElements.add(arr[i]);
        }

        int index = 0;
        for (int element : uniqueElements) {
            arr[index++] = element;
        }

        return uniqueElements.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;
        n = removeDuplicates(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

