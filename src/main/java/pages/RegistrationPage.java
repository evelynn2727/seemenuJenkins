package pages;

import models.RestaurationFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends HomePage {

    @FindBy(id= "id_email")
    private WebElement emailField;

    @FindBy(id = "id_password1")
    private WebElement passwordFields1;

    @FindBy(id = "id_password2")
    private WebElement passwordFields2;

    @FindBy(id = "id_restaurant_name")
    private WebElement restaurantName;

    @FindBy(css = ".submit-button .btn")
    private WebElement registrationButton;


    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void addRestauration(RestaurationFactory restaurationFactory){
       addRestaurantEmail(restaurationFactory);
       addRestaurantPasswords(restaurationFactory);
       addRestaurantName(restaurationFactory);
       registrationButton.click();
    }

    private void addRestaurantName(RestaurationFactory restaurationFactory){
        restaurantName.click();
        restaurantName.sendKeys(restaurationFactory.getRestaurationName());
    }

    private void addRestaurantPasswords(RestaurationFactory restaurationFactory){
        passwordFields1.click();
        passwordFields1.sendKeys(restaurationFactory.getPassword());
        passwordFields2.click();
        passwordFields2.sendKeys(restaurationFactory.getPassword());
    }

    private void addRestaurantEmail(RestaurationFactory restaurationFactory){
        waitForVisibilityElements(emailField);
        emailField.click();
        emailField.sendKeys(restaurationFactory.getEmail());
    }
}