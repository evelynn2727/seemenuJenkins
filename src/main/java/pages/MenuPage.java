package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends BasePage {

    @FindBy(css = ".navbar-nav li:nth-child(2)")
    private WebElement categoryItem;

    @FindBy(css = ".navbar-nav li:nth-child(3)")
    private WebElement dishItem;

    @FindBy(css = ".navbar-nav li:nth-child(4)")
    private WebElement restaurationItem;

    @FindBy(css = ".navbar-nav li:nth-child(5) a")
    private WebElement waiterItem;

    @FindBy(id = "dropdownMenuLink")
    private WebElement logoutTray;

    @FindBy(css = ".show > div > a:nth-child(4)")
    private WebElement logout;


    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void goToCategory() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        categoryItem.click();
    }

    public void goToDish(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dishItem.click();
    }

    public void goToRestarant(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        restaurationItem.click();
    }

    public void goToWaiter(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waiterItem.click();
    }
    public void logOut(){
        waitForVisibilityElements(logoutTray);
        logoutTray.click();
        waitForVisibilityElements(logout);
        logout.click();
    }
}
