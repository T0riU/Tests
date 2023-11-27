import org.testng.annotations.Test;
import pages.ElmirPages;

import java.util.concurrent.TimeUnit;

public class ElmirTests {

    @Test
    void testOne() throws InterruptedException {
        ElmirPages elmirPage = new ElmirPages();
        TimeUnit.SECONDS.sleep(5);
        elmirPage.searchInputOne().searchClick();
        elmirPage.firstElement().firstElementAdd();
        TimeUnit.SECONDS.sleep(3);
        elmirPage.CheckPrice().CloseBasketDialog();
        TimeUnit.SECONDS.sleep(5);
        elmirPage.CheckBasket(1);
        elmirPage.searchInputTwo().searchClick();
        elmirPage.firstElement().firstElementAdd();
        TimeUnit.SECONDS.sleep(3);
        elmirPage.CheckPrice().CloseBasketDialog();
        TimeUnit.SECONDS.sleep(5);
        elmirPage.CheckBasket(2);
    }
    @Test
    void testTwo() throws InterruptedException {
        ElmirPages elmirPage2 = new ElmirPages();
        TimeUnit.SECONDS.sleep(5);
        elmirPage2.DeliveryScroll();
        TimeUnit.SECONDS.sleep(2);
        elmirPage2.DeliveryOpen();
        elmirPage2.DeliveryHeaderCheck("Доставка");
    }
//    @AfterTest
//    public void finalizeObjects() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}

