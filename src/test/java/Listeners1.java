import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners1 implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("test execution started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("test execution successful");
        System.out.println(result.getStatus());
        System.out.println(result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //System.out.println("test execution failed");
        result.notify();
    }


}
