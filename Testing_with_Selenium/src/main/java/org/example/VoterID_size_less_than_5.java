package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class VoterID_size_less_than_5 {
    public static void main(String[] args) throws AWTException {
        ChromeDriver chromeDriver= new ChromeDriver();
        chromeDriver.get("http://localhost:8083/");
        // Testing of the Login Page of by making an entry in the voterid section with voterid < 5 digits

        chromeDriver.findElement(By.id("username")).sendKeys("Usr1");
        chromeDriver.findElement(By.id("password")).sendKeys("abc@def");
        WebElement loginButton = chromeDriver.findElement(By.id("button"));
        loginButton.click();
    }
}

