package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import pages.ElmirFactory;

import java.util.List;

public class ElmirAll extends ElmirFactory {
    @FindBy(xpath = "//div[@id='srch']//input")
    protected WebElement searchBar;
//    @FindBy(xpath = "//label[@class='c-right']//input")
    @FindBy(xpath = "//span[@id='find']")

    protected WebElement searchBtn;

    @FindBy(xpath = "//li[@class='vit-item'][1]")
    protected WebElement firstProduct;

    @FindBy(xpath = "//li[@class='vit-item'][1]//div[@class='vit-buy']")
    protected WebElement firstProductAdd;

    @FindAll(@FindBy(xpath = "//form[@class='b_outer clearfix']//div[@class='item']//div[@class='pprice']//span[@class ='tovar-price']//span[1]"))
    protected List<WebElement> ProductsPrice;
    @FindBy(xpath = "//div[@class='b_side']//div[@class='discount-and-total-sum']//div[@class='b_info_value summ'][1]//span[@class='value']")
    protected WebElement BasketPrice;

    @FindBy(xpath = "//div[@class='mw-close close-dialog']")
    protected WebElement CloseBasketDialog;

    @FindBy(xpath = "//span[@id='basket-cnt']//span[@class='basket-cnt']")
    protected WebElement BasketCheck;

    @FindBy(xpath = "//a[@id='basket-small']")
    protected WebElement BasketClick;

    @FindBy(xpath = "//div[@id='footer-new']//li[2]//ul[@class='level-second']//li[2]//a")
    protected WebElement DeliveryBtn;
    @FindBy(xpath = "//*[@id='page-title']")
    protected WebElement PageHeader;
}
