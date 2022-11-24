package bmt;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.exceptions.CsvException;








/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws IOException, CsvException 
    {
        //System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Desktop\\mave\\mave\\src\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.network.com.tr/");
        String URL = driver.getCurrentUrl();
        
        WebElement nameElement =driver.findElement(By.name("searchKey"));
        nameElement.click();
        nameElement.sendKeys("ceket");
        nameElement.sendKeys(Keys.ENTER);

        WebElement targetElement= driver.findElement(By.cssSelector("#pagedListContainer > div:nth-child(2) > div.productList__moreContent.-prev > button"));
        Actions actions=new Actions(driver);
        actions.scrollToElement(targetElement).perform();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pagedListContainer\"]/div[1]/div/div[3]/div[2]/button")));
       
        targetElement.sendKeys(Keys.ENTER);
        driver.manage().window().maximize();
        WebElement wel=driver.findElement(By.xpath("//*[@id=\"pagedListContainer\"]/div[1]/div/div[3]/div[2]/button"));
       
       Actions act=new Actions(driver);
       act.moveToElement(wel).perform();
       wel.click();

       driver.findElement(By.xpath("//*[@id=\"pagedListContainer\"]/div[1]/div/div[3]/div[2]/div/ul/li[4]/span")).click();

       WebElement well=driver.findElement(By.xpath("//*[@id=\"product-115346\"]/div/div[1]/a[2]/div/div[3]"));
       
       Actions actt=new Actions(driver);
       actt.moveToElement(well).perform();

      



    
       
       
      
       Random rand = new Random(); 
       int upperbound = 5;
      int  int_random = rand.nextInt(upperbound); 

      WebElement we=driver.findElement(By.xpath(" //*[@id=\"product-115346\"]/div/div[1]/div/div/div/div[2]/label"));
       Actions ac=new Actions(driver);
       ac.moveToElement(we).perform();
       we.click();
       

       new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#header__desktopBasket > div > div.header__basketSummary > a")));
       
       WebElement namElement =driver.findElement(By.cssSelector("#header__desktopBasket > div > div.header__basketSummary > a"));
        Actions a=new Actions(driver);
       a.moveToElement(namElement).perform();
       namElement.click();
        
       new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cop-app\"]/div/div[1]/div[1]/div[2]/div/div[2]/button")));
       WebElement naElement =driver.findElement(By.xpath("//*[@id=\"cop-app\"]/div/div[1]/div[1]/div[2]/div/div[2]/button"));
        Actions aa=new Actions(driver);
       aa.moveToElement(naElement).perform();
       naElement.click();

    
	
       try (com.opencsv.CSVReader reader = new com.opencsv.CSVReader(new FileReader("C:\\Users\\Asus\\Desktop\\mave\\mave\\src\\data.csv"))) {
        String[] lineInArray;
        lineInArray = reader.readNext();
        System.out.println(lineInArray[0]);
        
    }
        
    new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"n-input-email\"]")));
    WebElement el =driver.findElement(By.name("Email"));
    el.click();
    el.sendKeys("refikorkunarslan@gmail.com");
    
      
    //*[@id="n-input-email"]
       //*[@id="cop-app"]/div/div[1]/div[1]/div[2]/div/div[2]/button
       //driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div[3]")).click();
       
       


       
       //driver.findElement(By.xpath("//span[text()='İndirim oranına göre']")).click();
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,2000)");

        //System.out.println(driver.getTitle());
       // Thread.sleep(1000);
        //driver.quit();
    }
}
 