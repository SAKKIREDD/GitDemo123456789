import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;
import org.testng.ITestListener;
@org.testng.annotations.Listeners(Listeners1.class)
public class Listeners{
    WebDriver driver;
    @Test(groups = {"smoke1"})
    public void listenersDemo() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.findElement(By.cssSelector("img[alt='Google']")).getTagName(),"img");
    }

}

