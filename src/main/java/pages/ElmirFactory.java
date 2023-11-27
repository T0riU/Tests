package pages;

import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class ElmirFactory {
    public ElmirFactory() {
        PageFactory.initElements(DriverManager.initOrGetDriver(), this);
    }
}
