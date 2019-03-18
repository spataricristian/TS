package Lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfElements {

    public static void main (String... args){


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cristinel\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://darwin.md/apple-category/macbook/macbook-pro-(new)");

        //to catch all web ele ments into list
        List<WebElement> priceList = driver.findElements(By.className("price_g"));
        List<WebElement> nameList = driver.findElements(By.className("nume_produs_c_hom"));

        //myList contains all the web elements
        //if you want to get all elements text into array list
        List<String> allPriceElements = new ArrayList<String>();
        List<String> allProductNameElements = new ArrayList<String>();

        for(int i = 0; i < priceList.size(); i++){

            //loading text of each element in to array all_elements_text
            allProductNameElements.add(nameList.get(i).getText());
            allPriceElements.add(priceList.get(i).getText());

            //to print directly
            System.out.println(nameList.get(i).getText());
            System.out.println(priceList.get(i).getText());

            System.out.println();

        }

        System.out.println("Elements on page: " + allPriceElements.size());
        System.out.println("Max price: " + Collections.max(allPriceElements));
        System.out.println("Min price: " + Collections.min(allPriceElements));
    }
}