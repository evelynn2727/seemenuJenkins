package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgreementPage extends BasePage {
    @FindBy(css= ".accept-button")
    private WebElement agreeButton;

    public AgreementPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void acceptAgreement(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        agreeButton.click();
    }
}
