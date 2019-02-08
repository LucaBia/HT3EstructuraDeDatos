import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int len = 10;
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i<len;)

        //Insertion Sort
        System.out.println("INSERTION SORT");
        Insertion.insertionSort(array);
        for (int i = 0; i<len; i++) {
            System.out.println(array.get(i));
        }


        //Quick Sort
        System.out.println("QUICK SORT");
        Quick.sort(array);
        for (int i = 0; i<len; i++) {
            System.out.println(array.get(i));
        }


        //Merge Sort
        System.out.println("MERGE SORT");
        Merge.sort(array);
        for (int i = 0; i<len; i++) {
            System.out.println(array.get(i));
        }

    }
}
