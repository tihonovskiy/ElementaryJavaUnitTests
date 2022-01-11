package HW21;

import HW21.Tests.SimpleMathLibraryTest;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Run tests...");
        //new TestRunner().run(SimpleMathLibraryTest.class.getName());
        //new TestRunner().run(SimpleMathLibraryTest.class.getName(), SimpleMathLibraryTest.class.getName());
        //new TestRunner().run(SimpleMathLibraryTest.class);
        new TestRunner().runToPath("HW21.Tests");

        TestResultParser testResultParser = new TestResultParser();
        testResultParser.parse("testResult.txt");
    }

}
