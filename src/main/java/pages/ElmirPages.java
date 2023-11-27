package pages;

import elements.ElmirAll;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.DriverConfig;

import static utils.DriverManager.driver;

public class ElmirPages extends ElmirAll {
    private static final DriverConfig cfg = ConfigFactory.create(DriverConfig.class);
    public static ElmirPages getInstance(){
        return new ElmirPages();
    }

    public ElmirPages searchClick() {
        searchBtn.click();
        return getInstance();
    }
    public ElmirPages searchInputOne() {
        searchBar.clear();
        searchBar.sendKeys(cfg.firstS());
        return getInstance();
    }
    public ElmirPages searchInputTwo() {
        searchBar.clear();
        searchBar.sendKeys(cfg.secondS());
        return getInstance();
    }
    public ElmirPages firstElement() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(firstProduct.isDisplayed()).describedAs("Element exist").isTrue();
        return getInstance();
    }
    public ElmirPages firstElementAdd() {
        firstProductAdd.click();
        return getInstance();
    }
    public ElmirPages CheckPrice() {
        System.out.println("Work test 11");
        int sum = 0;
        if (ProductsPrice != null) {
//            System.out.println(ProductsPrice[0].getText());
            for (WebElement item : ProductsPrice) {
                String itemCor = item.getText().replace("&nbsp;", "").replace(" ", "");
                int itemInt = Integer.parseInt(itemCor);
                sum = sum + itemInt;
            }
            System.out.println(sum);
        }
        int basketPrice = Integer.parseInt(BasketPrice.getText().replace("&nbsp;", "").replace(" ", ""));
        System.out.println(basketPrice);
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(basketPrice).isEqualTo(sum);
        System.out.println("Work test 12");
        return getInstance();
    }

    public ElmirPages CloseBasketDialog() {
        CloseBasketDialog.click();
        return getInstance();
    }


    public ElmirPages CheckBasket(int num) {
        System.out.println("Work test 1");
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(BasketCheck.isDisplayed()).describedAs("Element exist").isTrue();

        System.out.println(BasketCheck.getText());
        System.out.println("Work test 2");
        softAssertions.assertThat(Integer.parseInt(BasketCheck.getText())).isEqualTo(num);
        return getInstance();
    }
    public ElmirPages DeliveryScroll(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView();", DeliveryBtn);
        return getInstance();
    }
    public ElmirPages DeliveryOpen(){
        DeliveryBtn.click();
        return getInstance();
    }
    public ElmirPages DeliveryHeaderCheck(String string){
        SoftAssertions softAssertions = new SoftAssertions();
//        System.out.println();
        softAssertions.assertThat(PageHeader.getText()).isEqualTo(string);
        return getInstance();
    }
}
