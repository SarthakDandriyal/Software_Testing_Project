package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
public class Final_testing {
        public static void main(String[] args) throws AWTException {
            ChromeDriver chromeDriver= new ChromeDriver();
            chromeDriver.get("http://localhost:8083/");
            // Testing of the Login Page of Admin
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numbers ="0123456789";
            //Random Voterid and email Generator
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
            chromeDriver.findElement(By.id("username")).sendKeys("ADMIN");
            chromeDriver.findElement(By.id("password")).sendKeys("sarthakdandriyal3199@gmail.com");
            WebElement loginButton = chromeDriver.findElement(By.id("button"));
            loginButton.click();
            StringBuilder sbo= new StringBuilder();
            Random random = new Random();
            int length = 6;
            for (int j = 0; j < length; j++) {
                int index = random.nextInt(numbers.length());
                char randomNum= numbers.charAt(index);
                sbo.append(randomNum);
            }
            chromeDriver.findElement(By.id("otpnum")).sendKeys(sbo);
            WebElement sub_Button = chromeDriver.findElement(By.id("sub_but"));
            sub_Button.click();
            chromeDriver.switchTo().alert().accept();
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            chromeDriver.switchTo().alert().accept();
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            chromeDriver.findElement(By.id("username")).sendKeys("ADMIN");
            chromeDriver.findElement(By.id("password")).sendKeys("sarthakdandriyal3199@gmail.com");
            loginButton = chromeDriver.findElement(By.id("button"));
            loginButton.click();
            chromeDriver.findElement(By.id("otpnum")).sendKeys("202111");
            sub_Button = chromeDriver.findElement(By.id("sub_but"));
            sub_Button.click();
            chromeDriver.switchTo().alert().getText();
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            chromeDriver.switchTo().alert().accept();
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            chromeDriver.switchTo().alert().accept();
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
        }
    }
