public class Gnome {
    static void gnomeSort(Comparable[] arrayInput) {
        for ( int index = 1; index < arrayInput.length; ) {
            if ( arrayInput[index - 1].compareTo(arrayInput[index]) <= 0) {
                ++index;
            } else {
                Comparable tempVal = arrayInput[index];
                arrayInput[index] = arrayInput[index - 1];
                arrayInput[index -1] = tempVal;
                --index;
                if ( index == 0 ) {
                    index = 1;
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
