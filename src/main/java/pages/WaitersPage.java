package pages;

import models.WaitersFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.util.Random;

public class WaitersPage extends BasePage {

    @FindBy(xpath = "//img[@src='/static/svg/add_button.svg']")
    private WebElement addWaiterButton;

    @FindBy(id = "id_name_pl")
    private WebElement nameWaiterpl;

    @FindBy(id = "id_name_en")
    private WebElement nameWaiteren;

    @FindBy(id = "id_description_pl")
    private WebElement descWaiterpl;

    @FindBy(id = "id_description_en")
    private WebElement descWaiteren;

    @FindBy(id = "id_images-0-image")
    private WebElement waiterPhoto1;

    @FindBy(id = "id_images-1-image")
    private WebElement waiterPhoto2;

    @FindBy(css = "div.submit-item-btn.text-center > button")
    private WebElement saveWaiterButton;

    public WaitersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void createNewWaiter(){
        wait.until(ExpectedConditions.elementToBeClickable(addWaiterButton));
        addWaiterButton.click();
    }

    public void fillForm(WaitersFactory waitersFactory){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(nameWaiterpl));
        nameWaiterpl.sendKeys(waitersFactory.getPolishNameWaiter());
        wait.until(ExpectedConditions.elementToBeClickable(nameWaiteren));
        nameWaiteren.sendKeys(waitersFactory.getEnglishNameWaiter());

        wait.until(ExpectedConditions.elementToBeClickable(descWaiterpl));
        descWaiterpl = driver.findElement(By.id("id_description_pl"));
        descWaiterpl.sendKeys(waitersFactory.getPolishDescriptionWaiter());
        wait.until(ExpectedConditions.elementToBeClickable(descWaiteren));
        descWaiteren = driver.findElement(By.id("id_description_en"));
        descWaiteren.sendKeys(waitersFactory.getEnglishDescriptionWaiter());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        File waiterFile1=  new File("src/main/data/images/image_" + randomImage()+ ".jpg");
        waiterPhoto1.sendKeys(waiterFile1.getAbsolutePath());

        File waiterFile2=  new File("src/main/data/images/image_" + randomImage()+ ".jpg");
        waiterPhoto2.sendKeys(waiterFile2.getAbsolutePath());

//        saveWaiterButton = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        saveWaiterButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    private int randomImage() {
        Random random = new Random();
        return random.nextInt(16) + 1;
    }
}
