package dataProvider;

import org.testng.annotations.Test;

public class DataReceiverClass2 {
//Specify both dataprovider name as well as the data provider class to identify for the test method
    @Test(dataProvider = "PassTwoNumbers",dataProviderClass = DataProviderUsingMethods2.class)
    public void addNumberReceived1(int num1, int num2)
    {
        System.out.println("Executing testcase 1...");
        int sum = num1 + num2;
        System.out.println("Sum of "+num1+" and "+num2+ " is "+sum);
        System.out.println("End of execution");
    }
    //Test 1 will get data from DataproviderMethod2 class and it matches with the conditions.
    //In simple words, if data provider class receives an exact testcase name then only it will return the if clause data otherwise return else block data

    @Test(dataProvider = "PassTwoNumbers",dataProviderClass = DataProviderUsingMethods2.class)
    public void addNumberReceived2(int num1, int num2)
    {
        System.out.println("Executing testcase 2...");
        int sum = num1 + num2;
        System.out.println("Sum of "+num1+" and "+num2+ " is "+sum);
        System.out.println("End of execution");
    }
}
