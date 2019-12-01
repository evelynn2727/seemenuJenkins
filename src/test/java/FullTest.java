import models.BaseTest;
import models.RestaurationDataFactory;
import models.RestaurationFactory;
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

    @Before
    public void checkoutSetUp(){
        homePage = new HomePage(driver);
        restaurationFactory = new RestaurationFactory("epalka+152@milosolutions.com","milo1024","milo1");
        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
        agreementPage= new AgreementPage(driver);
        restaurantPage = new RestaurantPage(driver);
        menuPage = new MenuPage(driver);
        restaurationDataFactory = new RestaurationDataFactory("test","test","6785948345","test","test","test","test","test","test","Test","test","test","234556");
    }

    @Test
    public void fullTest(){
        homePage.goToRestauration();
        loginPage.goToRegistrationPage();
        registrationPage.addRestauration(restaurationFactory);
        agreementPage.acceptAgreement();
        menuPage.goToRestarant();
        restaurantPage.fillRestaurantForm(restaurationDataFactory);
    }
}