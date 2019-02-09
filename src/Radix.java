import java.util.Arrays;

public class Radix {
    // A utility function to get maximum value in arr[]
    static Comparable getMax(Comparable[] arr, int n) {
        Comparable mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].compareTo(mx) > 0) {
                mx = arr[i];
            }
        }
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(Comparable[] arr, int n, int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++) {
            count[ ((Integer)arr[i]/exp)%10 ]++;
        }

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[ ((Integer)arr[i]/exp)%10 ] - 1] = (Integer)arr[i];
            count[ ((Integer)arr[i]/exp)%10 ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // The main function to that sorts arr[] of size n using
    // Radix Sort
    static void radixsort(Comparable[] arr) {
        int n = arr.length;
        // Find the maximum number to know number of digits
        Comparable m = getMax(arr, n);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; (Integer)m/exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }

    // A utility function to print an array
    static void print(Comparable[] arr) {
        for (Comparable anArr : arr) {
            System.out.print(anArr + " ");
        }
    }
}
