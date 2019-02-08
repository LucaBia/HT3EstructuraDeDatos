import java.util.ArrayList;

public class Quick {
    private static ArrayList<Integer> array;

    static void sort(ArrayList<Integer> arrayInput) {
        array = arrayInput;
        int len = arrayInput.size();
        quickSort(0, len-1);
    }

    private static void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array.get(lowerIndex + (higherIndex - lowerIndex) / 2);
        // Divide into two arrays
        while (i <= j) {
            while (array.get(i) < pivot) {
                i++;
            }
            while (array.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private static void exchangeNumbers(int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    // A utility function to print an array
    static void print(ArrayList<Integer> arrayInput) {
        for (Integer anArrayInput : arrayInput) {
            System.out.println(anArrayInput);
        }
    }
}
