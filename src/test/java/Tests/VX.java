package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VX {

    public WebDriver driver ;


    @BeforeMethod
    public void Start() {
        System.setProperty("webdriver.edge.driver","Edgedriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void H1(){
        System.out.println("Hello World From Ahmed Salem Jenkins");
        WebElement GOOGLE_TITLE = driver.findElement(By.className("lnXdpd"));
        Assert.assertTrue(GOOGLE_TITLE.isDisplayed());
    }


    @AfterTest
    public void End(){
        //driver.quit();
    }


}
