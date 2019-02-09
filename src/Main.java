import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int lon;
        System.out.println("Ingrese la cantidad de números que desea generar: ");
        lon = read.nextInt();
        Comparable[] array = new Comparable[lon];
        ArrayList<Integer> fileRandomNumbers = new ArrayList<>();

        try {
            //Escribe archivo
            String location = System.getProperty("user.dir")+"/randomNumbers.txt";
            File fileRandom = new File(location);
            FileWriter fw = new FileWriter(fileRandom);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < lon; i++) {
                int num = random.nextInt(lon);
                bw.write(Integer.toString(num));
                bw.write("\n");
            }

            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //Lee archivo
            Stream<String> lines = Files.lines(
                    Paths.get(System.getProperty("user.dir")+"\\randomNumbers.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(l -> {
                fileRandomNumbers.add(Integer.parseInt(l));
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < lon; i++) {
            array[i] = fileRandomNumbers.get(i);
        }


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
