package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id="id_login")
    private WebElement email;

    @FindBy(id="id_password")
    private WebElement password;

    @FindBy(css = ".submit-button .btn")
    private WebElement loginButton;

    @FindBy(css = ".mt-4 a")
    private WebElement registrationLink;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void goToRegistrationPage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        registrationLink.click();
    }
}
