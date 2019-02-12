package GmailAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class Gmail {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/salmabegum/Downloads/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.gmail.com");

        //Log in
        WebElement element = driver.findElement(By.id("identifierId"));

        element.sendKeys("salmaazam1978@gmail.com", Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.findElement(By.name("password")).sendKeys("spondhon$$",Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        //Compose
        driver.findElement(By.className("aic")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("vO")) .sendKeys("Salmabegum78@gmail.com",Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.className("aoT")).sendKeys("Gmail automation project");
        Thread.sleep(1000);
        driver.findElement(By.className("Am")).sendKeys("Hi,This is my Gmail automation test " +
                "cases.This is my Github link .Please let me know if you want to add anything else.");

        driver.findElement(By.className("aoO")).click();
        Thread.sleep(1000);
        //Select to read
        driver.findElement(By.className("bog")).click();
        Thread.sleep(1000);

        //sign out
        driver.findElement(By.className("gbii")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("gb_71")).click();





        driver.close();
    }
}