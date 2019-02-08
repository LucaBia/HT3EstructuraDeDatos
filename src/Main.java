import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int len = 0;
        System.out.println("Ingrese la cantidad de números que desea generar: ");
        len = read.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i<len; i++) {
            array.add(random.nextInt(len));
        }

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
