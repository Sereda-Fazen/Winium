package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alex on 12.09.2016.
 */
public class Page  {



        @FindBy(className =  "CalcFrame")
        private WebElement calcFrame;

        @FindBy(id =  "137")
        private WebElement seven;

        @FindBy(id =  "93")
        private WebElement plus;

        @FindBy(id =  "121")
        private WebElement equally;

        @FindBy(name =  "14")
        private WebElement assert14;

        public void setCalc() {
            calcFrame.click();
            seven.click();
            plus.click();
            seven.click();
            equally.click();
            assert14.isDisplayed();
    }
}
