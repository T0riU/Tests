package pages;

import elements.ProductListPageElements;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.SoftAssertions;
import utils.DriverConfig;

public class ProductListPagePage extends ProductListPageElements {
    private static final DriverConfig cfg = ConfigFactory.create(DriverConfig.class);
    public static ProductListPagePage getInstance(){
        return new ProductListPagePage();
    }

    public ProductListPagePage searchClick() {
        searchBtn.click();
        return getInstance();
    }
    public ProductListPagePage searchInput() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(searchBar.isDisplayed()).describedAs("Element exist").isTrue();
        searchBar.sendKeys(cfg.searchinfo());
        return getInstance();
    }

    public ProductListPagePage firstElement() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(firstProduct.isDisplayed()).describedAs("Element exist").isTrue();
        return getInstance();
    }
}

