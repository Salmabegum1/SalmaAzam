package GmailAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail1 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/salmabegum/Downloads/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.get("http://www.gmail.com");
        //driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("salmaazam1978@gmail.com",Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("spondhon$$", Keys.ENTER);
        Thread.sleep(1000);

        //Select all
        driver.findElement(By.className("G-as3")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("G-as3")).click();
        Thread.sleep(1000);

        //Select
        driver.findElement(By.className("aid")).click();
        Thread.sleep(1000);
       //Star
        driver.findElement(By.className("apU")).click();
        Thread.sleep(1000);
       //Select to read
        driver.findElement(By.className("aqw")).click();
        Thread.sleep(1500);
       //Select inbox
        driver.findElement(By.className("aio")).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//div[@id=\":4\"]/div/div[1]/div[1]/div/div/div[2]/div[3]/div")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("aid")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("apU")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("aqw")).click();
        Thread.sleep(1500);


        driver.findElement(By.className("aio")).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//div[@id=\":4\"]/div/div[1]/div[1]/div/div/div[2]/div[3]/div")).click();
        Thread.sleep(1000);


        driver.findElement(By.className("G-as3")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("gbii")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("gb_71")).click();

        driver.close();

    }
}
