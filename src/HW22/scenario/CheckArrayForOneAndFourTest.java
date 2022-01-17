package HW22.scenario;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static HW22.MyArray.checkArrayForOneAndFour;

public class CheckArrayForOneAndFourTest {
    int[] validIntegerArray = {1, 1, 1, 4, 4, 1, 4, 4};
    int[] integerArrayWithOneNumberOnly = {1, 1, 1, 1, 1, 1};
    int[] integerArrayWithFourNumberOnly = {4, 4, 4, 4};
    int[] integerArrayWithOtherNumber = {1, 4, 4, 1, 1, 4, 3};

    @Test
    public void testArrayWithValidValues() {
        Assertions.assertTrue(checkArrayForOneAndFour(validIntegerArray));
    }

    @Test
    public void testArrayWithOneNumberOnly() {
        Assertions.assertFalse(checkArrayForOneAndFour(integerArrayWithOneNumberOnly));
    }

    @Test
    public void testArrayWithFourNumberOnly() {
        Assertions.assertFalse(checkArrayForOneAndFour(integerArrayWithFourNumberOnly));
    }

    @Test
    public void testArrayWithOtherNumber() {
        Assertions.assertFalse(checkArrayForOneAndFour(integerArrayWithOtherNumber));
    }
}
