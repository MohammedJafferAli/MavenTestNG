package iTestResult;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/* ITestResult is special feature in testNG to get the status of individual testcases
* And that can be used for reporting purpose*/
public class ITestResultExample {

    @Test
    public void testCase001()
    {
        System.out.println("Executing testcase 001");
        Assert.assertTrue(true);//This wil make the test pass
    }

    @Test
    public void testCase002()
    {
        System.out.println("Executing testcase 002");
        Assert.assertTrue(false);//This wil make the test fail
    }
    
    //After execution of each testcase I want to get the status and create a report 
    @AfterMethod
    public void getStatus(ITestResult testResult)
    {
        if(testResult.getStatus() == ITestResult.SUCCESS)
        {
            System.out.println("Testcase "+testResult.getMethod().getMethodName()+" is Passed");
        } else if (testResult.getStatus()== ITestResult.FAILURE) {
            System.out.println("Testcase "+testResult.getMethod().getMethodName()+" is Failed");
        }
    }
}
