package tests;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import pages.Page;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;


public class TestCalc {

    private static WiniumDriver driver = null;
    private static WiniumDriverService service = null;
    private static DesktopOptions options = null;


    @BeforeClass
    public static void setUpEnv() throws IOException {

        options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\system32\\calc.exe");
        File driverPath = new File("C:\\winium\\winium\\Winium.Desktop.Driver.exe");
        service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(false).buildDesktopService();
        service.start();
        driver = new WiniumDriver(service, options);
    }

    @Test
    public void calc() throws InterruptedIOException {

        Page pages = PageFactory.initElements(driver, Page.class);
        pages.setCalc();
    }

    @After
    public void stopDriver(){
        driver.close();
    }

    @AfterClass
    public static void tearDown(){
        service.stop();
    }


}
