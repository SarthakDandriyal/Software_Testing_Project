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
                
                
            String election_name[]=new String[10];

            election_name[0]="E1";
            //String election_name[]={"E1","E2","W2","W3","S2","S3","S1","S6","S1","E4"};

            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd'T'HH:mm:ss.SSSX");

            //Generating random election name
            for(int i=1;i<10;i++) {
                StringBuilder ename = new StringBuilder();
                random = new Random();
                length = 2;

                for (int j = 0; j < length; j++) {

                    int index = random.nextInt(alphabet.length());
                    char randomChar = alphabet.charAt(index);
                    ename.append(randomChar);


                }
                election_name[i]= ename.toString();

            }
            // Election registration
            for(int i=0;i<5;i++) {

                Date d = new Date();
                random = new Random();

                System.out.println(dateFormat.format(d));
                chromeDriver.findElement(By.id("electionname")).sendKeys(election_name[i]);

                if(i!=0) {
                    chromeDriver.findElement(By.id("stime")).sendKeys(dateFormat.format(d));
                    chromeDriver.findElement(By.id("etime")).sendKeys(dateFormat.format(d));
                }
                else{
                    chromeDriver.findElement(By.id("stime")).sendKeys("2022-11-27T23:58:00.0000");
                    chromeDriver.findElement(By.id("etime")).sendKeys("2023-11-27T23:58:00.0000");

                }
                chromeDriver.findElement(By.id("voterscount")).sendKeys(String.valueOf(random.nextInt(100)));
                WebElement submitButton = chromeDriver.findElement(By.id("submitButton"));
                submitButton.click();
                Thread.sleep(5000);
                WebElement backButton=chromeDriver.findElement(By.id("button"));
                backButton.click();

            }



            WebElement candidateButton=chromeDriver.findElement(By.id("candidateButton"));
            candidateButton.click();

            Thread.sleep(5000);


            //Candidate registration

            String candidateId[]={"C1","C2","C3","C1","C2","C5","A1","A2","C2","C6"};
            String candidateName[]=new String[10];

            //Generating random candidate names
            for(int i=0;i<10;i++){

                random = new Random();
                StringBuilder cname = new StringBuilder();
                length = 5;

                for (int j = 0; j < length; j++) {

                    int index = random.nextInt(alphabet.length());
                    char randomChar = alphabet.charAt(index);
                    cname.append(randomChar);


                }
                candidateName[i]= cname.toString();

            }



            for(int i=0;i<10;i++){

                chromeDriver.findElement(By.id("cId")).sendKeys(candidateId[i]);
                chromeDriver.findElement(By.id("cName")).sendKeys(candidateName[i]);
                WebElement submitButton = chromeDriver.findElement(By.id("cSubmit"));
                Thread.sleep(5000);
                submitButton.click();

            }




            WebElement votersButton=chromeDriver.findElement(By.id("votersButton"));
            votersButton.click();



            //Voters Regsitration




            String voterId[]={"C1","C2","C3","C1","C2","C5","A1","A2","C2","C6"};

            String vRandom[]=new String[10];



            //Generating random string for voter
            for(int i=0;i<10;i++){

               random = new Random();
                StringBuilder cname = new StringBuilder();
                length = 5;

                for (int j = 0; j < length; j++) {

                    int index = random.nextInt(alphabet.length());
                    char randomChar = alphabet.charAt(index);
                    cname.append(randomChar);


                }
                vRandom[i]= cname.toString();

            }





            Thread.sleep(5000);

            for(int i=0;i<10;i++){


                if(i==0) {
                    chromeDriver.findElement(By.id("vId")).sendKeys("v1");
                }
                else{
                    chromeDriver.findElement(By.id("vId")).sendKeys(voterId[i]);
                }

                chromeDriver.findElement(By.id("vName")).sendKeys(vRandom[i]);
                chromeDriver.findElement(By.id("vAddress")).sendKeys(vRandom[i]);


                if(i==0){
                    chromeDriver.findElement(By.id("vEmail")).sendKeys("sarthakdandriyal3199@gmail.com");
                }
                else{
                    chromeDriver.findElement(By.id("vEmail")).sendKeys(vRandom[i]);
                }

                WebElement submitButton = chromeDriver.findElement(By.id("vButton"));
                Thread.sleep(5000);
                submitButton.click();
            }
        }
}
        }
    }
