package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
public class Bypass_login_page {
    public static void main(String[] args){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://localhost:3000/?");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//         Sending random queries to election page
        Random random = new Random();
        for(int i=0;i<10;i++) {
            StringBuilder sba = new StringBuilder();
            random = new Random();
            int length = 5;
            for (int j = 0; j < length; j++) {
                int index = random.nextInt(alphabet.length());
                char randomChar = alphabet.charAt(index);
                sba.append(randomChar);
            }
            String randomString= sba.toString();
            chromeDriver.get("http://localhost:3000/?"+randomString);
        }
    }
}
