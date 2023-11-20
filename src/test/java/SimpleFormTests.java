import Pages.BasePage;
import Pages.SimpleFormPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.BasePage;
import Pages.SimpleFormPage;


public class SimpleFormTests extends BasePage {

    private SimpleFormPage simpleFormPage;
    private final By simpleFormDemoLink = By.linkText("Simple Form Demo"); // Define the constant locator

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }

    @Test
    public void enterMessageAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("Test");
        simpleFormPage.clickOnCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Test"));
    }

    @Test
    public void enterNumberAndClickGetCheckedValue(){
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("1");
        simpleFormPage.clickOnCheckedValueButton();

        String actualResult=driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
        }
    @Test
    public void enterNumberAndClickGetCheckedValueSpace() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField(" ");
        simpleFormPage.clickOnCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(""));
    }
    @Test
    public void enterCharacterAndClickGetCheckedValue(){
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("!");
        simpleFormPage.clickOnCheckedValueButton();

        String actualResult=driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("!"));
    }

    @Test
    public void enterFirstValue() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("5");;
        simpleFormPage.clickOnCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(actualResult.contains("5"));
    }
    @Test
    public void enterSecondValue() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterValueInA("1");
        simpleFormPage.enterValueInB("6");
        simpleFormPage.clickOnGetValueButtonAlternative();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("7"));
    }
}

