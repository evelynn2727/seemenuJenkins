import models.BaseTest;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;

public class FullTest extends BaseTest {

    private HomePage homePage;

    @Before
    public void checkoutSetUp(){
        homePage = new HomePage(driver);
    }

    @Test
    public void fullTest(){
        homePage.goToRestauration();
    }
}
