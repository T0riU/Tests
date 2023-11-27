package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.RozetkaFactory;

public class ProductListPageElements extends RozetkaFactory {
    @FindBy(xpath = "//li[@class='catalog-grid__cell catalog-grid__cell_type_slim ng-star-inserted'][1]")
    protected WebElement firstProduct;

    @FindBy(xpath = "//input[@class='search-form__input ng-pristine ng-valid ng-touched'][1]")
    protected WebElement searchBar;
    @FindBy(xpath = "//button[@class='button button_color_green button_size_medium search-form__submit'][1]")
    protected WebElement searchBtn;
}
