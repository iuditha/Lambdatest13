package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SimpleFormPage extends BasePage {
    public SimpleFormPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;

public void enterTextInTextField (String text){
    textField.sendKeys(text);
}
@FindBy(id= "showInput")
    private WebElement getCheckedValueButton;

public void clickOnCheckedValueButton(){
    getCheckedValueButton.click();
}
@FindBy (id = "message")
    private WebElement checkMessage;
public void checkYourMessage(){
    checkMessage.getText();
}
    @FindBy(css="input[placeholder='Please entre first value']")
    private WebElement firstValueInput;
public void enterTextInTextField2 (String text) {
    textField.sendKeys(text);
}
@FindBy(id="sum1")
    private WebElement twoInputFieldsEnterA;
public void enterValueInA ( String valueA){
    twoInputFieldsEnterA.sendKeys(valueA);

}
@FindBy (id= "sum2")
private WebElement twoInputFieldsEnterB;
public void enterValueInB (String valueB){
    twoInputFieldsEnterB.sendKeys(valueB);
}

    @FindBy(xpath = "//*[@id='gettotal']/button")
    private WebElement getValueButton;
public void clickOnGetValueButton(){ getValueButton.click();}
@FindBy(css= "#gettotal > button")
    private WebElement getValueButtonAlternative;
private WebElement getGetCheckedValueButton;
public void clickOnGetValueButtonAlternative(){
    getValueButtonAlternative.click();}


}

