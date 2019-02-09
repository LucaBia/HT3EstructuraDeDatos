import org.junit.Test;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;

public class GnomeTest {
    @Test
    public void testGnomeSort() {
        Comparable[] input = {11, 10, 20, 30, 8, 19};
        Gnome instance = new Gnome();
        instance.gnomeSort(input);
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1].compareTo(input[i])>0) {
                fail("Error");
            }
        }
    }
}
