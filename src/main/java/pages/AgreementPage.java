package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgreementPage extends BasePage {

    @FindBy(css = ".decline-button")
    private WebElement notAgreeButton;

    @FindBy(xpath= "/html/body/div[4]/div/a[2]")
    private WebElement agreeButton;

    public AgreementPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void acceptAgreement(){
        waitForClickableElements(By.xpath("/html/body/div[4]/div/a[2]"));
        agreeButton.click();
    }
}
