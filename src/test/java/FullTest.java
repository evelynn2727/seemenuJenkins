import models.*;
import org.junit.Before;
import org.junit.Test;
import pages.*;

public class FullTest extends BaseTest {

    private HomePage homePage;
    private RestaurationFactory restaurationFactory;
    private RegistrationPage registrationPage;
    private LoginPage loginPage;
    private AgreementPage agreementPage;
    private RestaurantPage restaurantPage;
    private MenuPage menuPage;
    private RestaurationDataFactory restaurationDataFactory;
    private CategoryPage categoryPage;
    private CategoryFactory categoryFactory;
    private DishPage dishPage;
    private DishFactory dishFactory;
    private WaitersFactory waitersFactory;
    private WaitersPage waitersPage;

    @Before
    public void checkoutSetUp(){
        homePage = new HomePage(driver);
        restaurationFactory = new RestaurationFactory("epalka+198@milosolutions.com","milo1024","milo1");
        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
        agreementPage= new AgreementPage(driver);
        restaurantPage = new RestaurantPage(driver);
        menuPage = new MenuPage(driver);
        restaurationDataFactory = new RestaurationDataFactory("test","test","678594834","test","test","test","test","test","test","Test","test","test","234556");
        categoryPage = new CategoryPage(driver);
        categoryFactory = new CategoryFactory("category1", "Category1");
        dishFactory = new DishFactory("danie","dish", "lorem ipsum1","lorem ipsum2", "Test","Test","Test");
        dishPage = new DishPage(driver);
        waitersPage = new WaitersPage(driver);
        waitersFactory = new WaitersFactory("kelner","waiter","lorem ipsum","lorem ipsum","test","test","test");
    }

    @Test
    public void fullTest(){
        homePage.goToRestauration();
        loginPage.goToRegistrationPage();
        registrationPage.addRestauration(restaurationFactory);
        agreementPage.acceptAgreement();
        menuPage.goToRestarant();
        restaurantPage.fillRestaurantForm(restaurationDataFactory);
        menuPage.goToCategory();
        categoryPage.fillCategoryForm(categoryFactory);
        menuPage.goToDish();
        dishPage.createNewDish();
        dishPage.fillDishForm(dishFactory);
        menuPage.goToWaiter();
        waitersPage.createNewWaiter();
        waitersPage.fillForm(waitersFactory);
    }
}