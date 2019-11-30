package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuPage extends BasePage {

    @FindBy(css = "#navbar-main > ul > li:nth-child(2) > a")
    private WebElement categoryItem;

    @FindBy(css = "#navbar-main > ul > li:nth-child(3) > a")
    private WebElement dishItem;

    @FindBy(css = "#navbar-main > ul > li:nth-child(4) > a")
    private WebElement restaurationItem;

    @FindBy(css = "#navbar-main > ul > li:nth-child(5) > a")
    private WebElement waiterItem;

    @FindBy(css = "#dropdownMenuLink")
    private WebElement logoutTray;

    @FindBy(css = ".show > div > a:nth-child(4)")
    private WebElement logout;


    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void goToCategory() {
        waitForClickableElements(By.cssSelector("#navbar-main > ul > li:nth-child(2) > a"));
        categoryItem.click();
    }

    public void goToDish(){
        waitForClickableElements(By.cssSelector("#navbar-main > ul > li:nth-child(3) > a"));
        dishItem.click();
    }

    public void goToRestarant(){
        waitForClickableElements(By.cssSelector("#navbar-main > ul > li:nth-child(4) > a"));
        restaurationItem.click();
    }

    public void goToWaiter(){
        waitForClickableElements(By.cssSelector("#navbar-main > ul > li:nth-child(5) > a"));
        waiterItem.click();
    }
    public void logOut(){
        wait.until(ExpectedConditions.elementToBeClickable(logoutTray));
        logoutTray.click();
        wait.until(ExpectedConditions.elementToBeClickable(logout));
        logout.click();
    }
}
