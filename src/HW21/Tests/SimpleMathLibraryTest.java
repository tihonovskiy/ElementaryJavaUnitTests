package HW21.Tests;

import HW21.SimpleMathLibrary;
import org.junit.Test;

public class SimpleMathLibraryTest {

    private SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();

    @Test
    public void checkAddMethod() {
        if (simpleMathLibrary.add(10, 7) == 17) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void checkMinusMethod() {
        if (simpleMathLibrary.minus(10, 7) == 3) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

}
