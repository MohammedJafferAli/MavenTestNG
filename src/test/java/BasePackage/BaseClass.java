package BasePackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

    @BeforeSuite
    public void setupProjectConfig()
    {
        System.out.println("Configuring project dependencies...");
    }
    @AfterSuite
    public  void removeProjectConfig()
    {
        System.out.println("Removing configuration...");
    }
}
