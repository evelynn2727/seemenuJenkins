package pages;

import models.RestaurationFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends HomePage {

    @FindBy(xpath= "//input[@name='email']")
    private WebElement emailField;

    @FindBy(id = "id_password1")
    private WebElement passwordFields1;

    @FindBy(id = "id_password2")
    private WebElement passwordFields2;

    @FindBy(id = "id_restaurant_name")
    private WebElement restaurantName;

    @FindBy(xpath = "//button[@class='col-md-12 btn']")
    private WebElement registrationButton;

    @FindBy( xpath= "//div[contains(@class,'alert alert-success')]")
    private WebElement loginAlert;


    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void addRestauration(RestaurationFactory restaurationFactory){
        WebDriverWait wait = new WebDriverWait(driver, 40);
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        email.click();
        email.sendKeys("epalka@milosolutions.com");
//        waitForVisibilityElements(By.id("id_email"));
//        waitForClickableElements(By.id("id_email"));
        emailField.click();
        emailField.sendKeys(restaurationFactory.getEmail());
        passwordFields1.click();
        passwordFields1.sendKeys(restaurationFactory.getPassword());
        passwordFields2.click();
        passwordFields2.sendKeys(restaurationFactory.getPassword());
        restaurantName.click();
        restaurantName.sendKeys(restaurationFactory.getRestaurationName());
        registrationButton.click();
    }
}
