package dataProvider;

import org.testng.annotations.Test;

public class DataReceiverClass {
//Specify both dataprovider name as well as the data provider class to identify for the test method
    @Test(dataProvider = "PassNumbers",dataProviderClass = DataProviderInSeparateClass.class)
    public void addNumberReceived(int num1, int num2)
    {
        int sum = num1 + num2;
        System.out.println("Sum of "+num1+" and "+num2+ " is "+sum);
    }
}
