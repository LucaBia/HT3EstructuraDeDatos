import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int lon = 0;
        System.out.println("Ingrese la cantidad de números que desea generar: ");
        lon = read.nextInt();
        Comparable[] array = new Comparable[lon];

        try {
            //Escribe archivo
            String location = System.getProperty("user.dir")+"/files/randomNumbers.txt";
            File fileRandom = new File(location);
            FileWriter fw = new FileWriter(fileRandom);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < lon; i++) {
                int num = random.nextInt(lon);
                bw.write(Integer.toString(num));
                bw.write("\n");
            }

            //Lee archivo
            FileReader fr = new FileReader(fileRandom);
            BufferedReader br = new BufferedReader(fr);

            for (int i = 0; i < lon; i++) {
                array[i] = br.readLine();
                System.out.println(br.read());
            }

            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        //Insertion Sort
        System.out.println("INSERTION SORT");
        Insertion.insertionSort(array);
        Insertion.print(array);

        /*
        //Quick Sort
        System.out.println("QUICK SORT");
        Quick.sort(array);
        Quick.print(array);


        //Merge Sort
        System.out.println("MERGE SORT");
        Merge.sort(array);
        Merge.print(array);


        //Gnome Sort
        System.out.println("GNOME SORT");
        Gnome.gnomeSort(array);
        Gnome.print(array);


        //Radix Sort
        System.out.println("RADIX SORT");
        Radix.radixsort(array);
        Radix.print(array);
        */
    }
}
