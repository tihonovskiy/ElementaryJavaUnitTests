package HW22.scenario;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

import static HW22.MyArray.getValueAfterLast4;
import static HW22.MyArray.getValueAfterLast4List;

public class ValueAfterLast4Test {
    int[] validIntegerArray = {4, 1, 4, 1, 4, 1, 3, 5};
    int[] expectedValidIntegerArray = {1, 3, 5,};
    int[] integerArrayWithout4 = {1, 2, 3, 5};
    int[] integerArrayOnly4 = {4, 4, 4};
    int[] nullIntegerArray;

    @Test
    public void testReturnModifiedArray_withValidValues() {
        for (int i = 0; i < expectedValidIntegerArray.length; i++) {
            Assertions.assertEquals(expectedValidIntegerArray[i], getValueAfterLast4(validIntegerArray)[i]);
        }
    }

    @Test
    public void testReturnModifiedArray_withIntegerArrayWithout4() {
        Assertions.assertThrows(
                RuntimeException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        getValueAfterLast4(integerArrayWithout4);
                    }
                }
        );
    }

    @Test
    public void testReturnModifiedArray_withIntegerArrayOnly4() {
        Assertions.assertEquals(0, getValueAfterLast4(integerArrayOnly4).length);
    }

    @Test
    public void testReturnModifiedArray_withEmptyIntegerArray() {
        Assertions.assertThrows(
                RuntimeException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        getValueAfterLast4(nullIntegerArray);
                    }
                }
        );
    }

    @Test
    public void testReturnModifiedArrayList_withValidValues() {
        ArrayList<Integer> expectedValidIntegerArrayList = new ArrayList<>();
        expectedValidIntegerArrayList.add(1);
        expectedValidIntegerArrayList.add(3);
        expectedValidIntegerArrayList.add(5);

        Assertions.assertEquals(expectedValidIntegerArrayList, getValueAfterLast4List(validIntegerArray));
    }

    @Test
    public void testReturnModifiedArrayList_withIntegerArrayWithout4() {
        Assertions.assertThrows(
                RuntimeException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        getValueAfterLast4List(integerArrayWithout4);
                    }
                }
        );
    }

    @Test
    public void testReturnModifiedArrayList_withIntegerArrayOnly4() {
        ArrayList<Integer> expectedIntegerArrayOnly4List = new ArrayList<>();
        Assertions.assertEquals(expectedIntegerArrayOnly4List, getValueAfterLast4List(integerArrayOnly4));
    }

    @Test
    public void testReturnModifiedArrayList_withEmptyIntegerArray() {
        Assertions.assertThrows(
                RuntimeException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        getValueAfterLast4List(nullIntegerArray);
                    }
                }
        );
    }
}
