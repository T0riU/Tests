import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ProductListPagePage;

import static utils.DriverManager.driver;

public class ProductListPageTest {

    @Test
    void testOne() {
        MainPage mainPage = new MainPage();
        mainPage.searchInput();
        mainPage.searchClick();
        ProductListPagePage listPage = new ProductListPagePage();
        listPage.firstElement();
    }
//    void testTwo() {
//        MainPage mainPage = new MainPage();
//        mainPage.searchInput();
////        mainPage.searchClick();
////        ProductListPagePage listPage = new ProductListPagePage();
////        listPage.firstElement();
//    }
//    @AfterTest
//    public void finalizeObjects() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}



