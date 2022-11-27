package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.Random;

public class Email_with_at_in_middle {
        public static void main(String[] args) throws AWTException {
            ChromeDriver chromeDriver= new ChromeDriver();
            chromeDriver.get("http://localhost:8083/");
            // Testing of the Login Page of Admin
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numbers ="0123456789";
            //Random 5 digit voterid and Email Generator
            //The generated email is in the format XXX@XX
            for(int i=0;i<10;i++) {
                StringBuilder sba = new StringBuilder();
                StringBuilder sbp= new StringBuilder();
                Random random = new Random();
                int length = 3;
                for (int j = 0; j < length; j++) {
                    int index = random.nextInt(alphabet.length());
                    char randomChar = alphabet.charAt(index);
                    sba.append(randomChar);
                    index=random.nextInt(numbers.length());
                    char randomNum= numbers.charAt(index);
                    sbp.append(randomNum);
                }
                sbp.append("@");
                for (int j = 0; j < 2; j++) {
                    int index = random.nextInt(alphabet.length());
                    char randomChar = alphabet.charAt(index);
                    sba.append(randomChar);
                    index=random.nextInt(numbers.length());
                    char randomNum= numbers.charAt(index);
                    sbp.append(randomNum);
                }
                chromeDriver.findElement(By.id("username")).sendKeys(sba);
                chromeDriver.findElement(By.id("password")).sendKeys(sbp);
                WebElement loginButton = chromeDriver.findElement(By.id("button"));
                loginButton.click();
                String result=chromeDriver.findElement(By.id("response")).getText();
                System.out.println("Test Case "+i+": Output  --  "+result+"\n");
            }
        }
    }

