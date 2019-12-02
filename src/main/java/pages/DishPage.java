package pages;

import models.DishFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.util.List;
import java.util.Random;

public class DishPage extends BasePage {
    private Random randomTags = new Random();

    @FindBy(css = "#add-circle img")
    private WebElement createNewDish;

    @FindBy(css = "#navbar-sub ul li")
    private List<WebElement> categories;

    @FindBy(id = "id_name_pl")
    private WebElement dishNamepl;

    @FindBy(id = "id_name_en")
    private WebElement dishNameen;

    @FindBy(id = "id_description_pl")
    private WebElement descDishpl;

    @FindBy(id = "id_description_en")
    private WebElement descDishen;

    @FindBy(css = ".dish-tags .dish-tag")
    private List<WebElement> tags;

    @FindBy(id = "id_images-0-image")
    private WebElement photoDish1;

    @FindBy(id = "id_images-1-image")
    private WebElement photoDish2;

    @FindBy(id = "id_images-2-image")
    private WebElement photoDish3;

    @FindBy(css = "div.submit-item-btn > .btn")
    private WebElement saveDishButton;

    public DishPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void selectCategory(int index){
        wait.until(ExpectedConditions.elementToBeClickable(categories.get(index)));
        categories.get(index).click();
    }

    public void createNewDish(){
//        wait.until(ExpectedConditions.elementToBeClickable(createNewDish));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        createNewDish.click();
    }

    public void fillDishForm(DishFactory dishFactory){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(dishNamepl));
        dishNamepl.sendKeys(dishFactory.getPolishDishName());

        wait.until(ExpectedConditions.elementToBeClickable(dishNameen));
        dishNameen.sendKeys(dishFactory.getEnglishDishName());

        wait.until(ExpectedConditions.elementToBeClickable(descDishpl));
        descDishpl.sendKeys(dishFactory.getPolishDescription());

        wait.until(ExpectedConditions.elementToBeClickable(descDishen));
        descDishen.sendKeys(dishFactory.getEnglishDescription());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int count=tags.size();
        int numberTags = randomTags.nextInt(4);
        int index=0;

        while(index < numberTags){
            tags.get(index).click();
            index++;
        }

        File dishFile1=  new File("src/main/data/images/image_" + randomImage()+ ".jpg");
        File dishFile2=  new File("src/main/data/images/image_" + randomImage()+ ".jpg");
        File dishFile3=  new File("src/main/data/images/image_" + randomImage()+ ".jpg");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//          wait.until(ExpectedConditions.elementToBeClickable(photoDish1));
//        photoDish1.sendKeys(dishFile1.getAbsolutePath());
//           wait.until(ExpectedConditions.elementToBeClickable(photoDish2));
//        photoDish2.sendKeys(dishFile2.getAbsolutePath());
//          wait.until(ExpectedConditions.elementToBeClickable(photoDish3));
//        photoDish3.sendKeys(dishFile3.getAbsolutePath());
        // wait.until(ExpectedConditions.elementToBeClickable(saveDishButton));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        saveDishButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(createNewDish));
    }


    private int randomImage(){
        Random random = new Random();
        return random.nextInt(18) + 1;
    }
}
