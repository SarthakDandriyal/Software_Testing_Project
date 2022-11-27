package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
public class Email_ending_with_at {
        public static void main(String[] args) throws AWTException {
            ChromeDriver chromeDriver= new ChromeDriver();
            chromeDriver.get("http://localhost:8083/");
            // Testing of the Login Page of by making an entry in the email section ending with '@'

            chromeDriver.findElement(By.id("username")).sendKeys("User1");
            chromeDriver.findElement(By.id("password")).sendKeys("12345@");
            WebElement loginButton = chromeDriver.findElement(By.id("button"));
            loginButton.click();
        }
}

