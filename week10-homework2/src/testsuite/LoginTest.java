package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {
    String baseurl="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setup(){openBrowser(baseurl);}
    @Test
    public void userShouldLoginSuccessfully() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
       String welcomeText = driver.findElement(By.id("Login")).getText();
        Assert.assertEquals(welcomeText,"Login");
    }
@Test
public void userShouldLoginSuccessfullyWithValidCredentials() {
    driver.get("https://opensource-demo.orangehrmlive.com/");

    WebElement usernameField = driver.findElement(By.id("txtUsername"));
    WebElement passwordField = driver.findElement(By.id("txtPassword"));
    WebElement loginButton = driver.findElement(By.id("btnLogin"));

    usernameField.sendKeys("Admin");
    passwordField.sendKeys("admin123");
    loginButton.click();

    WebElement welcomeText = driver.findElement(By.id("welcome"));
    String actualWelcomeText = welcomeText.getText();
    String expectedWelcomeText = "Welcome Admin";
    Assert.assertEquals(actualWelcomeText, expectedWelcomeText, "Verifying Welcome Text");
}
}



