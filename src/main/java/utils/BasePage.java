package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {


        protected WebDriver driver;
        protected WebDriverWait wait;

   // Sayfanın yüklenmesi için gerekli tanımlamalar
  public BasePage(WebDriver driver) {

          driver=new ChromeDriver();
          wait =new WebDriverWait(driver,20);
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOZDE\\Documents\\driver\\chromedriver.exe");

    }

    public WebElement element(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return  driver.findElement(locator);
    }

    //Send keys içerisine yazılacak textlerin methodu
    public void sendKeys(By locator,String text){

        element(locator).sendKeys(text);
    }

    }



