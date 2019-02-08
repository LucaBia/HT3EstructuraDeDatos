import java.util.ArrayList;

public class Insertion {

    public static ArrayList insertionSort(ArrayList<Integer> array) {
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

        return array;
    }

    // A utility function to print an array
    static void print(ArrayList<Integer> arrayInput) {
        int n = arrayInput.size();

        for (int i = 0; i<n; i++) {
            System.out.println(arrayInput.get(i));
        }
    }
}
