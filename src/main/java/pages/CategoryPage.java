package pages;

import models.CategoryFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends BasePage {

    @FindBy(css = ".add-circle")
    private WebElement addCategoryButton;

    @FindBy(id = "id_name_pl")
    private WebElement categoryNamePl;

    @FindBy(id = "id_name_en")
    private WebElement categoryNameEn;

    @FindBy(className = "btn")
    private WebElement createCategoryButton;


    public CategoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void fillCategoryForm(CategoryFactory categoryFactory){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        addCategoryButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        addCategory(categoryFactory);

        createCategoryButton.click();
    }

    private void addCategory(CategoryFactory categoryFactory){
        categoryNamePl.click();
        categoryNamePl.sendKeys(categoryFactory.getPolishNameCategory());

        categoryNameEn.click();
        categoryNameEn.sendKeys(categoryFactory.getEnglishNameCategory());
    }
}
