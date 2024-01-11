package testNgAnnotations;

import BasePackage.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OtherAnnotations extends BaseClass {

    @BeforeMethod
    public void setUp() {
        System.out.println(" Open up a browser instance ");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println(" Close the browser instance");
    }

    @Test
    public void openChrome()
    {
        System.out.println(" Chrome is running ");
    }
    @Test
    public void openFireFox()
    {
        System.out.println(" Firefox is running ");
    }
}
