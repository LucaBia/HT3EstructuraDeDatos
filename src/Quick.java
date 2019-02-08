public class Quick {
    private static Comparable[] array;

    static void sort(Comparable[] arrayInput) {
        array = arrayInput;
        int len = arrayInput.length;
        quickSort(0, len - 1);
    }

    private static void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        Comparable pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            while (array[i].compareTo(pivot) < 0) {
                i++;
            }
            while (array[j].compareTo(pivot) > 0) {
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
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    private static void exchangeNumbers(int i, int j) {
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // A utility function to print an array
    static void print(Comparable[] arrayInput) {
        for (Comparable anArrayInput : arrayInput) {
            System.out.println(anArrayInput);
        }
    }
}
