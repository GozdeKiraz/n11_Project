package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BasePage;

public class TestFunction extends BasePage {

    WebDriver driver;
    public TestFunction(WebDriver driver) {

        super(driver);
    }

    //Send keys textleri tanımlanan alan
    private By eMail=(By.id("email"));
    private By password = (By.id("password"));
    private By search =(By.id("searchData"));

    //Test edicek method
    public void Test(){
        //Anasayfaya girdikten sonra giriş yap butonuna git
        element(By.className("btnSignIn")).click();

        //Giriş yap sayfasındaki alanları doldur
        sendKeys (eMail,"gzdkiraz@gmail.com");
        sendKeys (password,"Hm5.g35918");

        //Giriş yap butonu ile login olma
        element(By.id("loginButton")).click();

        //ürün arama
        element(By.className("searchBtn"));
        sendKeys(search,"samsung");

        //İkinci sayfaya gitme
        element(By.cssSelector("#contentListing > div > div > div.productArea > div.pagination > a:nth-child(2)"));

        //Seçilen ürünü favorilere ekleme
        element(By.xpath("//*[@id=\"p-336735730\"]/div[1]/span"));

        //Hesabım üzerinde favorilerim sayfasına gidebilmek için fareyi imlece götür ve favorilerim sayfasına git
        tCase();

        //Favorilerim/Listelerim sayfasındaki favorilerim alanına tıklama
        element(By.xpath("\"//*[@id=\\\"myAccount\\\"]/div[3]/ul/li[1]/div/a\""));

        //Favorilerden silme
        element(By.className("deleteProFromFavorites"));

        //Silme işlemini gerçekleştirdiğimize dair açılan pencereyi kapatma
        element(By.className("closeBtn"));


    }

    //Hesabım üzerinde favorilerim sayfasına gidebilmek için fareyi imlece götür ve favorilerim sayfasına git
    public void tCase() {
        Actions action = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.className("myAccount"));
        action.moveToElement(mainMenu).moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/a[2]"))).click().build().perform();

    }
}
