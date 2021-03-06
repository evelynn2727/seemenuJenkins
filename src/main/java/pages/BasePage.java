package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public WebDriver driver;
    protected WebDriverWait wait;
    private Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        this.actions = new Actions(driver);
    }

    protected void waitForVisibilityElements(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    protected void waitForClickableElements(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    protected void moveToElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    protected void moveToElementAndClick(WebElement element) { actions.moveToElement(element).click().build().perform(); }
}
