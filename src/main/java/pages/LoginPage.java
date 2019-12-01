package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    @FindBy(css="#id_login")
    private WebElement email;

    @FindBy(css="#id_password")
    private WebElement password;

    @FindBy(xpath = "//button[@class='col-md-12 btn']")
    private WebElement loginButton;

    @FindBy(css = "body > div > div.row.justify-content-md-center > div > form > div.col-md-12.mt-4 > a")
    private WebElement registrationLink;

    @FindBy(css=".mt-3 .secondaryAction")
    private WebElement resetPasswordLink;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void goToRegistrationPage(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        waitForClickableElements(By.cssSelector("body > div > div.row.justify-content-md-center > div > form > div.col-md-12.mt-4 > a"));
        registrationLink.click();
    }
}
