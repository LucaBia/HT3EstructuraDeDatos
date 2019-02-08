import java.util.ArrayList;

public class Merge {
    private static ArrayList<Integer> array;
    private static int[] tempMergArr;
    private static int length;

    public static void sort(ArrayList<Integer> arrayInput) {
        array = arrayInput;
        length = arrayInput.size();
        tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private static void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array.get(i);
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array.set(k, tempMergArr[i]);
                i++;
            } else {
                array.set(k, tempMergArr[j]);
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array.set(k, tempMergArr[i]);
            k++;
            i++;
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
