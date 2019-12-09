package pages;

import models.RestaurationDataFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.util.List;
import java.util.Random;

public class RestaurantPage extends BasePage {

    @FindBy(name = "city")
    private WebElement nameCity;

    @FindBy(id = "id_address")
    private WebElement nameStreet;

    @FindBy(id = "id_phone_number")
    private WebElement phoneNumbers;

    @FindBy(css = ".custom-file-input")
    private WebElement logoRestaurant;

    @FindBy(css = "cke_editable cke_editable_themed cke_contents_ltr cke_show_borders p")
    private WebElement descRestaurantPl;

    @FindBy(css = "cke_editable cke_editable_themed cke_contents_ltr cke_show_borders p")
    private WebElement descRestaurantEn;

    @FindBy(id = "id_images-0-image")
    private WebElement promoRestaurant1;

    @FindBy(id = "id_images-1-image")
    private WebElement promoRestaurant2;

    @FindBy(id = "id_images-2-image")
    private WebElement promoRestaurant3;

    @FindBy(name = "left_menu")
    private WebElement saveRestaurantButton;

    @FindBy(id="id_company_name")
    private WebElement billingRestaurationName;

    @FindBy(id="id_company_address")
    private WebElement billingRestaurationAddress;

    @FindBy(id="id_nip")
    private WebElement billingNIP;

    public RestaurantPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void fillRestaurantForm(RestaurationDataFactory restaurationDataFactory){
        addRestautantData(restaurationDataFactory);
        addLogoImage();
        addRestaurantPromoPhotos();
        saveRestaurantButton.click();
    }

    private void addLogoImage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='custom-file']//div)[1]"))); //waiting on logo button
        File logoFile = new File("src/main/data/images/image_" + randomImage()+ ".jpg");
        logoRestaurant.sendKeys(logoFile.getAbsolutePath());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-image-id='0']"))); //waiting on promo photo 1
    }

    private void addRestaurantPromoPhotos(){
        File promoFile1=  new File("src/main/data/images/image_" + randomImage()+ ".jpg");
        promoRestaurant1.sendKeys(promoFile1.getAbsolutePath());
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-image-id='1']"))); //waiting on promo photo 2

        File promoFile2=  new File("src/main/data/images/image_" + randomImage()+ ".jpg");
        promoRestaurant2.sendKeys(promoFile2.getAbsolutePath());
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-image-id='2']")));//waiting on promo photo 3

        File promoFile3=  new File("src/main/data/images/image_" + randomImage()+ ".jpg");
        promoRestaurant3.sendKeys(promoFile3.getAbsolutePath());
        wait.until(ExpectedConditions.elementToBeClickable(saveRestaurantButton));
    }

    private void addBasicData(RestaurationDataFactory restaurationDataFactory){
        waitForVisibilityElements(nameCity);
        nameCity.sendKeys(restaurationDataFactory.getNameCity());
        nameStreet.sendKeys(restaurationDataFactory.getNameStreet());
        phoneNumbers.sendKeys(restaurationDataFactory.getPhoneNumbers());
    }

    private void addBillingData(RestaurationDataFactory restaurationDataFactory){
        billingRestaurationName.sendKeys(restaurationDataFactory.getBillingRestaurationName());
        billingRestaurationAddress.sendKeys(restaurationDataFactory.getBillingRestaurationAddress());
        billingNIP.sendKeys(restaurationDataFactory.getBillingNIP());
    }

    private void addRestaurantDescription(RestaurationDataFactory restaurationDataFactory){
        List<WebElement> descRestaurant = driver.findElements(By.tagName("iframe"));
        driver.switchTo().frame(descRestaurant.get(0));
        driver.findElement(By.xpath("html/body/p")).sendKeys(restaurationDataFactory.getDescRestaurantPl());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(descRestaurant.get(1));
        driver.findElement(By.xpath("html/body/p")).sendKeys(restaurationDataFactory.getDescRestaurantEn());
        driver.switchTo().defaultContent();
    }

    private void addRestautantData(RestaurationDataFactory restaurationDataFactory){
        addBasicData(restaurationDataFactory);
        addBillingData(restaurationDataFactory);
        addRestaurantDescription(restaurationDataFactory);
    }

    private int randomImage() {
        Random random = new Random();
        return random.nextInt(16) + 1;
    }
}
