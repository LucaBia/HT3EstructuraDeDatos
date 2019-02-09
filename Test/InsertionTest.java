import org.junit.Test;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;

public class InsertionTest {

    @Test
    public void testInsertionSort() {
        Comparable[] input = {11, 10, 20, 30, 8, 19};
        Insertion instance = new Insertion();
        instance.insertionSort(input);
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1].compareTo(input[i])>0) {
                fail("Error");
            }
        }
    }
}
