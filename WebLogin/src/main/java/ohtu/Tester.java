package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/aleksisvuoksenmaa/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:4567");

        sleep(2);

        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        sleep(1);

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));

        sleep(1);
        element.submit();

        sleep(1);

        driver.quit();


        //1st task. Correct username, wrong password.
        driver = new ChromeDriver();

        driver.get("http://localhost:4567");

        sleep(1);

        element = driver.findElement(By.linkText("login"));
        element.click();

        sleep(1);

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("password");
        element = driver.findElement(By.name("login"));

        sleep(1);
        element.submit();

        sleep(1);
        driver.quit();

        //2nd task. Non-existant username.
        driver = new ChromeDriver();

        driver.get("http://localhost:4567");

        sleep(1);

        element = driver.findElement(By.linkText("login"));
        element.click();

        sleep(1);

        element = driver.findElement(By.name("username"));
        element.sendKeys("peksuuuu");
        element = driver.findElement(By.name("password"));
        element.sendKeys("password");
        element = driver.findElement(By.name("login"));

        sleep(1);
        element.submit();

        sleep(1);
        driver.quit();

        //3rd task. Creating a new user.
        driver = new ChromeDriver();

        driver.get("http://localhost:4567");
        sleep(2);

        element = driver.findElement(By.linkText("register new user"));
        element.click();

        sleep(1);

        element = driver.findElement(By.name("username"));
        element.sendKeys("alluu");
        element = driver.findElement(By.name("password"));
        element.sendKeys("al");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("al");

        sleep(1);
        element.submit();

        sleep(1);
        driver.quit();

        //4rd task. Creating a new user.
        driver = new ChromeDriver();

        driver.get("http://localhost:4567");
        sleep(2);

        element = driver.findElement(By.linkText("register new user"));
        element.click();

        sleep(1);

        element = driver.findElement(By.name("username"));
        element.sendKeys("alluu");
        element = driver.findElement(By.name("password"));
        element.sendKeys("al1");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("al1");

        sleep(1);
        element.submit();

        sleep(1);

        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();

        sleep(1);

        element = driver.findElement(By.linkText("logout"));
        element.click();

        sleep(1);
        driver.quit();

    }

    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
