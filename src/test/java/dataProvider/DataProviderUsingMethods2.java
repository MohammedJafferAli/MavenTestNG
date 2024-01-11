package dataProvider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

//Idea here is to provide different set of data to different testcase(test method)
public class DataProviderUsingMethods2 {

    @DataProvider(name = "PassTwoNumbers")
    public Object[][] sendTwoNumbers(Method method)
    {
        if(method.getName().equalsIgnoreCase("addNumberReceived1"))
        {
            /*
            * The following data will be passed to the testcase1 in a separate file only when method name matches*/
            return new Object[][]
                    {
                            {10,30},
                            {40,40}
                    };
        }
        else
        {
            /*
             * The following data will be passed to the testcase2 from this file when method name doesn't match*/
            return new Object[][]
                    {
                            {10,10},
                            {20,30}
                    };
        }
    }
}
