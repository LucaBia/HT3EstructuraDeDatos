import java.util.ArrayList;

public class Gnome {
    static void gnomeSort(ArrayList<Integer> arrayInput) {
        for ( int index = 1; index < arrayInput.size(); ) {
            if ( arrayInput.get(index - 1) <= arrayInput.get(index)) {
                ++index;
            } else {
                int tempVal = arrayInput.get(index);
                arrayInput.set(index, arrayInput.get(index - 1));
                arrayInput.set(index - 1, tempVal);
                --index;
                if ( index == 0 ) {
                    index = 1;
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
