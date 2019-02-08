public class Insertion {

    static void insertionSort(Comparable[] array) {
        Comparable t ;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j].compareTo(array[j-1]) < 0) {
                    t = array[j];
                    array[j] = array[j-1];
                    array[j-1] = t;
                }
            }
        }
    }

    // A utility function to print an array
    static void print(Comparable[] arrayInput) {
        for (Comparable anArrayInput : arrayInput) {
            System.out.println(anArrayInput);
        }
    }
}
