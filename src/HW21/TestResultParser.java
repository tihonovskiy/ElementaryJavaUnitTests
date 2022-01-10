package HW21;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TestResultParser {
    private TestResult testResult = new TestResult();

    public TestResult getTestResult() {
        return testResult;
    }

    public void setTestResult(TestResult testResult) {
        this.testResult = testResult;
    }

    public void parse(String filePath) {
        File file = new File(filePath);
        checkFileIsNotNull(file);
        List<String> summeryResult = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                summeryResult.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String tmp;
        for (String str : summeryResult) {
            if(str.contains("tests found")) {
                tmp = str.replaceAll("[a-zA-Z ]", "");
                testResult.setTotalCountOfTests(Integer.parseInt(str.replaceAll("[a-zA-Z ]", "").substring(1,tmp.length()-1)));
            } else if (str.contains("tests successful")) {
                tmp = str.replaceAll("[a-zA-Z ]", "");
                testResult.setCountPassedTest(Integer.parseInt(str.replaceAll("[a-zA-Z ]", "").substring(1,tmp.length()-1)));
            } else if (str.contains("tests failed")) {
                tmp = str.replaceAll("[a-zA-Z ]", "");
                testResult.setCountFailedTests(Integer.parseInt(str.replaceAll("[a-zA-Z ]", "").substring(1,tmp.length()-1)));
            }
        }
        testResult.setDate(summeryResult.get(0));

        System.out.println(testResult.toString());
    }

    public TestResult parse(File file) {

        return this.testResult;
    }

    public TestResult parse(Path path) {

        return this.testResult;
    }

    public void checkFileIsNotNull(File file) {
        if (file.length() == 0) {
            throw new IllegalArgumentException();
        }
    }
}
