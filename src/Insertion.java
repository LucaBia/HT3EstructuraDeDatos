import java.util.ArrayList;

public class Insertion {

    static void insertionSort(ArrayList<Integer> array) {
        int t;
        for (int i = 1; i < array.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (array.get(j) < array.get(j - 1)) {
                    t = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, t);
                }
            }
        }
    }

    // A utility function to print an array
    static void print(ArrayList<Integer> arrayInput) {
        for (Integer anArrayInput : arrayInput) {
            System.out.println(anArrayInput);
        }
    }
}
