import com.github.javafaker.Faker;
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
        FakerData fakerData = new FakerData();
        homePage = new HomePage(driver);
        restaurationFactory = new RestaurationFactory(fakerData.email,fakerData.password,fakerData.restaurationName);
        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
        agreementPage= new AgreementPage(driver);
        restaurantPage = new RestaurantPage(driver);
        menuPage = new MenuPage(driver);
        restaurationDataFactory = new RestaurationDataFactory(fakerData.city,fakerData.street,fakerData.phoneNumber,fakerData.plRestaurantDescription,fakerData.enRestaurantDescription,fakerData.restaurationName,fakerData.address,fakerData.nip);
        categoryPage = new CategoryPage(driver);
        categoryFactory = new CategoryFactory(fakerData.plCategoryName, fakerData.enCategoryName);
        dishFactory = new DishFactory(fakerData.plDishName,fakerData.enDishName, fakerData.plDishDescription,fakerData.enDishDescription);
        dishPage = new DishPage(driver);
        waitersPage = new WaitersPage(driver);
        waitersFactory = new WaitersFactory(fakerData.plWaiterName,fakerData.enWaiterName,fakerData.plWaiterDescription,fakerData.enWaiterDescription);
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