package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormDemoPage extends BasePage {
    public FormDemoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "name")
    private WebElement nameField;

    public void enterNameInNameField (String text) {
        nameField.sendKeys(text);
    }

    @FindBy(id = "inputEmail4")
    private WebElement emailField;

    public void enterTextInEmailField(String text) {
        emailField.sendKeys(text);
    }

    @FindBy(id = "inputPassword4")
    private WebElement passwordField;

    public void enterTextInPasswordField(String text) {
        passwordField.sendKeys(text);
    }
    @FindBy(id = "company")
    private WebElement companyField;

    public void enterTextInCompanyField(String text) {
     companyField.sendKeys(text);
    }
    @FindBy(id = "websitename")
    private WebElement websiteField;

    public void enterTextInWebsiteField(String text) {
        websiteField.sendKeys(text);
    }
    @FindBy(css = "option[value=RO]")
    private WebElement countryField;

    public void selectCountryInCountryField(String text) {
        countryField.click();
    }
    @FindBy(id = "inputCity")
    private WebElement cityField;

    public void enterTextInCityField(String text) {
        cityField.sendKeys(text);
    }
    @FindBy(id = "inputAddress1")
    private WebElement address1Field;

    public void enterTextInAddress1Field(String text) {
        address1Field.sendKeys(text);
    }
    @FindBy(id = "inputAddress2")
    private WebElement address2Field;

    public void enterTextInAddress2Field(String text) {
        address2Field.sendKeys(text);
    }
    @FindBy(id = "inputState")
    private WebElement stateField;

    public void enterTextInStateField(String text) {
        stateField.sendKeys(text);
    }
    @FindBy(id = "inputZip")
    private WebElement zipCodeField;

    public void enterTextInZipCodeField(String text) {
        zipCodeField.sendKeys(text);
    }
    @FindBy(css=".text-right > .bg-lambda-900")
    private WebElement submitButton;

    public void ClickOnSubmitButton (String text) {
        submitButton.sendKeys(text);
    }
}

