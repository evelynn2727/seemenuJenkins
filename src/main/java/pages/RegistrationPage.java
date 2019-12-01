package pages;

import models.RestaurationFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends HomePage {

    @FindBy(css = "#id_email")
    private WebElement emailField;

    @FindBy(css = "#id_password1")
    private WebElement passwordFields1;

    @FindBy(css = "#id_password2")
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
//        WebDriverWait wait = new WebDriverWait(driver, 40);
//        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
//
//        waitForClickableElements(By.id("id_email"));
//
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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
