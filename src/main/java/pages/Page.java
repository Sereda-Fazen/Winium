package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Alex on 12.09.2016.
 */
public class Page {


    /**
     * Exception
     */

    @FindBy (id = "CommandLink_2")
    private WebElement exception;

    /**
     * Addition
     */

    @FindBy(className =  "CalcFrame")
    private WebElement calcFrame;

    @FindBy(id =  "132")
    private WebElement two;

    @FindBy(id =  "93")
    private WebElement plus;

    @FindBy(id =  "134")
    private WebElement four;

    @FindBy(id =  "92")
    private WebElement multiply;

    @FindBy(id =  "121")
    private WebElement equally;

    @FindBy(name =  "24")
    private WebElement assert24;

    /**
     * clear
     */
    @FindBy (id = "81")
    private WebElement clear;

    @FindBy (name = "0")
    private WebElement zero;

    /**
     * Sqrt
     */

    @FindBy(name =  "1")
    private WebElement one;

    @FindBy(name =  "6")
    private WebElement six;

    @FindBy(id =  "110")
    private WebElement sqrt;

    @FindBy(name =  "4")
    private WebElement assert4;

    @FindBy(name =  "sqrt(16)")
    private WebElement sqrt16;

    /**
     * Percent
     */

    @FindBy(id =  "118")
    private WebElement percent;

    @FindBy(name =  "10")
    private WebElement assert10;



    public void setException(){
        try {
            exception.click();
        } catch (Exception ignored){}
    }

    public void setCalc() {

        calcFrame.click();
        two.click();

    }

    public void clearData(){
        clear.click();
        zero.isDisplayed();
    }
    public void checkSqrt(){
        one.click();
        six.click();
        sqrt.click();
        assert4.isDisplayed();
        sqrt16.isDisplayed();
    }
    public void checkPercent(){
        one.click();
        zero.click();
        zero.click();
        multiply.click();
        one.click();
        zero.click();
        percent.click();
        assert10.isDisplayed();

    }


}
