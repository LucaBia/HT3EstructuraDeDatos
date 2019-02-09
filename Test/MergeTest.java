import org.junit.Test;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;

public class MergeTest {
    @Test
    public void testMergeSort() {
        Comparable[] input = {11, 10, 20, 30, 8, 19};
        Merge instance = new Merge();
        instance.sort(input);
        for (int i = 1; i < input.length; i++) {
            if (input[i + 1].compareTo(input[i])>0) {
                fail("Error");
            }
        }
    }
}
