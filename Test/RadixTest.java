import org.junit.Test;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;

public class RadixTest {

    @Test
    public void testRedixSort() {
        Comparable[] input = {11, 10, 20, 30, 8, 19};
        Radix instance = new Radix();
        instance.countSort(input, 1, 2);
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1].compareTo(input[i])>0) {
                fail("Error");
            }
        }
    }
}
