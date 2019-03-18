package Lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cristinel\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080");

//        //Test1 Age less than 18
//        driver.findElement(By.id("name")).sendKeys("Aloha");
//        driver.findElement(By.id("age")).sendKeys("17");
//        driver.findElement(By.id("submit")).click();
//        System.out.println("Age less than 18, failed");
//        Thread.sleep(1000);
//        driver.findElement(By.id("name")).clear();
//        driver.findElement(By.id("age")).clear();
//        Thread.sleep(2000);

//        //Test2 Age equals 18
//        driver.findElement(By.id("name")).sendKeys("Aloha");
//        driver.findElement(By.id("age")).sendKeys("18");
//        driver.findElement(By.id("submit")).click();
//        System.out.println("Age equals 18, passed");
//        Thread.sleep(1000);
//        driver.findElement(By.id("name")).clear();
//        driver.findElement(By.id("age")).clear();
//        Thread.sleep(2000);

        //Test3 Age more than 18
        driver.findElement(By.id("name")).sendKeys("Aloha");
        driver.findElement(By.id("age")).sendKeys("19");
        Thread.sleep(1000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);
        boolean isPresent = driver.findElements(By.id("congraduation")).size() > 0;
        if (isPresent) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
