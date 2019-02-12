package GmailAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail2 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/salmabegum/Downloads/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.get("http://www.gmail.com");
        //driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("salmaazam1978@gmail.com", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("spondhon$$", Keys.ENTER);
        Thread.sleep(1000);

        //Select to read
        driver.findElement(By.className("bog")).click();
        Thread.sleep(1000);


        driver.findElement(By.className("bkH")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@id=\":c8\"]")).sendKeys("Thank You");
        Thread.sleep(1000);


        driver.findElement(By.cssSelector("#\\3a at")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("aio")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("gbii")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("gb_71")).click();

        driver.close();

    }
}
