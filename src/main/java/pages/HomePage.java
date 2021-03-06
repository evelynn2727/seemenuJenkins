package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(css = ".main-lang-login .restaurant-button")
    private WebElement restaurationButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void goToRestauration(){
        waitForVisibilityElements(restaurationButton);
        restaurationButton.click();
    }
}
