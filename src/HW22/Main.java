package HW22;

import HW22.scenario.CheckArrayForOneAndFourTest;
import HW22.scenario.ValueAfterLast4Test;

public class Main {

    public static void main(String[] args) {
        new TestRunner().run(CheckArrayForOneAndFourTest.class.getName());
        new TestRunner().run(ValueAfterLast4Test.class.getName());
    }

}
