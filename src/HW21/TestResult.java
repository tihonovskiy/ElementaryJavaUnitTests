package HW21;

import java.util.Date;

public class TestResult {
    private int totalCountOfTests;
    private int countPassedTest;
    private int countFailedTests;
    private String date;

    public TestResult() {
    }

    public TestResult(int totalCountOfTests, int countPassedTest, int countFailedTests, String date) {
        this.totalCountOfTests = totalCountOfTests;
        this.countPassedTest = countPassedTest;
        this.countFailedTests = countFailedTests;
        this.date = date;
    }

    public int getTotalCountOfTests() {
        return totalCountOfTests;
    }

    public void setTotalCountOfTests(int totalCountOfTests) {
        this.totalCountOfTests = totalCountOfTests;
    }

    public int getCountPassedTest() {
        return countPassedTest;
    }

    public void setCountPassedTest(int countPassedTest) {
        this.countPassedTest = countPassedTest;
    }

    public int getCountFailedTests() {
        return countFailedTests;
    }

    public void setCountFailedTests(int countFailedTests) {
        this.countFailedTests = countFailedTests;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "totalCountOfTests=" + totalCountOfTests +
                ", countPassedTest=" + countPassedTest +
                ", countFailedTests=" + countFailedTests +
                ", date='" + date + '\'' +
                '}';
    }
}
