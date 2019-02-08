import java.util.*;

public class Radix {
    // A utility function to get maximum value in arr[]
    static int getMax(ArrayList<Integer> arrayInput, int n) {
        int mx = arrayInput.get(0);
        for (int i = 1; i < n; i++) {
            if (arrayInput.get(i) > mx)
                mx = arrayInput.get(i);
        }
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(ArrayList<Integer> arrayInput, int n, int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++) {
            count[ (arrayInput.get(i) /exp)%10 ]++;
        }

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[ (arrayInput.get(i) /exp)%10 ] - 1] = arrayInput.get(i);
            count[ (arrayInput.get(i) /exp)%10 ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++) {
            arrayInput.set(i, output[i]);
        }
    }

    // The main function to that sorts arr[] of size n using
    // Radix Sort
    static void radixsort(ArrayList<Integer> arrayInput) {
        int n = arrayInput.size();
        // Find the maximum number to know number of digits
        int m = getMax(arrayInput, n);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10) {
            countSort(arrayInput, n, exp);
        }
    }

    // A utility function to print an array
    static void print(ArrayList<Integer> arrayInput) {
        int n = arrayInput.size();

        for (int i = 0; i<n; i++) {
            System.out.println(arrayInput.get(i));
        }
    }

}
