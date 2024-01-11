package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Write a program using testng dataprovider to pass two numbers to the test method
public class DataProviderAnnotation {

    @Test(dataProvider = "PassTwoNumbers") //dataProvider annotation refer from where the method has to get the data
    public void addTwoNumbers(int num1,int num2)
    {
        int sum =num1+num2;
        System.out.println("Sum of given two numbers is " + sum );
    }

    @DataProvider(name="PassTwoNumbers") //This method should pass the data an object to the required test method.
    public Object[][] getDataFromDataProvider()
    {
        return new Object[][]
                {
                        {12,33},
                        {30,40}
                };
    }
}
