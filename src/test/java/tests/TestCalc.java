package tests;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Page;

import java.net.MalformedURLException;
import java.net.URL;


public class TestCalc {


    @Test
    public  void mainCalc() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app", "C:\\Windows\\system32\\calc.exe");
        cap.setCapability("launchDelay", "2");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9999"), cap);

        Page pages = PageFactory.initElements(driver, Page.class);
        pages.setCalc();
        pages.clearData();
        pages.checkSqrt();
        pages.checkPercent();

        driver.close();
    }

}
