import Pages.BasePage;
import Pages.KeyPressPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class KeyPressTests extends BasePage {
    private KeyPressPage keyPressPage;
    private static final By KEY_PRESS_LINK_TEXT = By.linkText("Key Press"); // Define the constant locator

    @BeforeMethod
    public void setUp() {
        super.setUp();
        keyPressPage = new KeyPressPage(driver);
    }
    @Test
   public void verifyIfShiftActionIsRecognised(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInShiftKey();

        String actualResults = driver.findElement(By.id("my_field")).getText();
        System.out.println(actualResults);
    }
    @Test
    public void verifyIfBackSpaceActionIsRecognised(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInSpace();

        String actualResults = driver.findElement(By.id("my_field")).getText();
        System.out.println(actualResults);
    }
    @Description("Write a letter and check the result")
    @Test
    public void writeALetterAndCheckTheResult(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("T");

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: T");
    }

}

