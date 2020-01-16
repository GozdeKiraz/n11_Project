package listener;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BaseTest;

//Testin işlemlerinin nasıl sonuçlanacağının belirttiğimiz alan
public class ListenerImpl extends BaseTest implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        driver.get(baseUrl);
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("başarılı");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("fail");
    }

    public void onTestSkipped(ITestResult iTestResult) {

        System.out.println("skip");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
      driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOZDE\\Documents\\driver\\chromedriver.exe");

    }

    public void onFinish(ITestContext iTestContext) {

        driver.quit();
    }
}
