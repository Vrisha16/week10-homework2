package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldResetPasswordSuccessfully() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?"));
        forgotPasswordLink.click();
        WebElement forgotPasswordText = driver.findElement(By.xpath("//h1[text()='Forgot Your Password']"));
        String actualText = forgotPasswordText.getText();
        String expectedText = "Forgot Your Password";
        Assert.assertEquals(actualText, expectedText);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?"));
        forgotPasswordLink.click();

        WebElement forgotPasswordText = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        String actualText = forgotPasswordText.getText();
        String expectedText = "Forgot Your Password?";
        Assert.assertEquals(actualText, expectedText, "Verifying Forgot Password Text");
    }
}





