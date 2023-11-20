import Pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.BasePage;
import Pages.FormDemoPage;
import org.testng.asserts.Assertion;

public class FormDemoTests extends BasePage {

    private FormDemoPage formDemoPage;
    private final By formDemoPageLink = By.linkText("Input Form Submit");// Define the constant locator

    @BeforeMethod
    public void setUp() {
        super.setUp();
        formDemoPage = new FormDemoPage(driver);
    }

    @Test
    public void enterYourNameInNameField() {
        driver.findElement(formDemoPageLink).click();
        formDemoPage.enterNameInNameField("Dita");


        String actualResults = driver.findElement(By.id("name")).getText();
        System.out.println(actualResults);
        Assert.assertTrue(actualResults.contains(""));
    }

    @Test
    public void enterYourEmailInEmailField() {
        driver.findElement(formDemoPageLink).click();
        formDemoPage.enterTextInEmailField("MyEmail@yahoo.com");

        String actualResults = driver.findElement(By.id("inputEmail4")).getText();
        System.out.println(actualResults);
    }

    @Test
    public void enterAPasswordInPasswordField() {
        driver.findElement(formDemoPageLink).click();
        formDemoPage.enterTextInPasswordField("Password123");

        String actualResults = driver.findElement(By.id("inputPassword4")).getText();
        System.out.println(actualResults);}
    @Test
    public void enterCompanyNameInCompanyField() {
        driver.findElement(formDemoPageLink).click();
        formDemoPage.enterTextInCompanyField("My Company");

        String actualResults = driver.findElement(By.id("company")).getText();
        System.out.println(actualResults);}
    @Test
    public void enterWebsiteNameInWebsiteField() {
        driver.findElement(formDemoPageLink).click();
        formDemoPage.enterTextInWebsiteField("www.myWebsite.co.uk");

        String actualResults = driver.findElement(By.id("websitename")).getText();
        System.out.println(actualResults);}
    @Test
    public void selectCountryOnCountryField() {
        driver.findElement(formDemoPageLink).click();
        formDemoPage.selectCountryInCountryField("Romania");

        String actualResults = driver.findElement(By.cssSelector("option[value=RO]")).getText();
        System.out.println(actualResults);}
   @Test
   public void enterYourCityInCityField() {
       driver.findElement(formDemoPageLink).click();
       formDemoPage.enterTextInCityField("Timisoara");

       String actualResults = driver.findElement(By.id("inputCity")).getText();
       System.out.println(actualResults);}
    @Test
    public void enterYourAddressInAddress1Field() {
        driver.findElement(formDemoPageLink).click();
        formDemoPage.enterTextInAddress1Field("My Address");

        String actualResults = driver.findElement(By.id("inputAddress1")).getText();
        System.out.println(actualResults);}
    @Test
    public void enterYourAddressInAddress2Field() {
        driver.findElement(formDemoPageLink).click();
        formDemoPage.enterTextInAddress2Field("Bulgarus 108");

        String actualResults = driver.findElement(By.id("inputAddress2")).getText();
        System.out.println(actualResults);}
    @Test
    public void enterYourStareInStateField() {
        driver.findElement(formDemoPageLink).click();
        formDemoPage.enterTextInAddress2Field("Timis");

        String actualResults = driver.findElement(By.id("inputState")).getText();
        System.out.println(actualResults);}
    @Test
    public void enterYourZipCodeInZipCodeField() {
        driver.findElement(formDemoPageLink).click();
        formDemoPage.enterTextInAddress2Field("307241");

        String actualResults = driver.findElement(By.id("inputZip")).getText();
        System.out.println(actualResults);}
}


