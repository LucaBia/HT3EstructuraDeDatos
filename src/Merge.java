public class Merge {
    private static Comparable[] array;
    private static Comparable[] tempMergArr;
    private static int length;

    static void sort(Comparable[] arrayInput) {
        array = arrayInput;
        length = arrayInput.length;
        tempMergArr = new Comparable[length];
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
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i].compareTo(tempMergArr[j]) <= 0) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

    // A utility function to print an array
    static void print(Comparable[] arrayInput) {
        for (Comparable anArrayInput : arrayInput) {
            System.out.println(anArrayInput);
        }
    }
}
