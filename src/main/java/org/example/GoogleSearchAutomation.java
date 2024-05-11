package org.example;

// Importing necessary packages
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GoogleSearchAutomation {
    public static void main(String[] args) {
        // Specifying the path to the webdriver (replace with your own path)
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path+"//chromedriver//chromedriver.exe");
        // Creating a new Chrome browser instance
        WebDriver driver = new ChromeDriver();

        // Navigating to Google's homepage
        driver.get("http://www.google.com");

        // Finding the search box element by name
        var searchBox = driver.findElement(By.name("q"));

        // Sending the search term to the search box and submitting the form
        searchBox.sendKeys("Selenium automation");
        searchBox.sendKeys(Keys.RETURN);

        // Waiting for 5 seconds to see the results
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Closing the browser
        driver.quit();
    }
}

