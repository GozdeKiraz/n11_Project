package testCases;

import listener.ListenerImpl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.TestFunction;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;


@Listeners({ListenerImpl.class})
public class TestCase extends BaseTest {

//Methodu çağırarak test edilen alan
    @Test
    public void Test(){
        driver.get(baseUrl);
        String url = "https:/www.n11.com/";
        TestFunction login = new TestFunction(driver);
        login.Test();


    }

    //Driver’ın yönlendiği adresi  ve eldeki adresi assertions metoduyla kontrol et
    @Test
    public void testAssertions() throws Exception {
        driver.get(baseUrl);
        String urlEquals = "https:/www.n11.com/";
        assertEquals(baseUrl, urlEquals);
    }

}
