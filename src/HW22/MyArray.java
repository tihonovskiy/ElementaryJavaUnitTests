package HW22;

import java.util.ArrayList;

public class MyArray {

    public static int[] getValueAfterLast4(int[] integerArray) {
        if (integerArray == null) {
            throw new RuntimeException("Array sis null");
        }

        int lastFourIndex = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == 4) {
                lastFourIndex = i;
            }
        }

        if (lastFourIndex == 0) {
            throw new RuntimeException("4 number not fount in this array");
        }

        int[] result = new int[integerArray.length - lastFourIndex - 1];
        int j = 0;
        for (int i = lastFourIndex + 1; i < integerArray.length; i++) {
            result[j] = integerArray[i];
            j++;
        }

        return result;
    }

    public static ArrayList<Integer> getValueAfterLast4List(int[] integerArray) {
        if (integerArray == null) {
            throw new RuntimeException("ArrayList is null");
        }

        int lastFourIndex = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == 4) {
                lastFourIndex = i;
            }
        }

        if (lastFourIndex == 0) {
            throw new RuntimeException("4 number not fount in this array");
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = lastFourIndex + 1; i < integerArray.length; i++) {
            result.add(integerArray[i]);
        }

        return result;
    }

    public static boolean checkArrayForOneAndFour(int[] integerArray) {
        int countOneNumbersInArray = 0;
        int countFourNumbersInArray = 0;
        int countOtherNumbersInArray = 0;

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == 1) {
                countOneNumbersInArray++;
            } else if (integerArray[i] == 4) {
                countFourNumbersInArray++;
            } else if (integerArray[i] != 1 || integerArray[i] != 4) {
                countOtherNumbersInArray++;
            }
        }

        if (countOtherNumbersInArray == 0) {
            if (countOneNumbersInArray > 0 && countFourNumbersInArray > 0) {
                return true;
            }
        }

        return false;
    }

}
