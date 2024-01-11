package dataProvider;


import org.testng.annotations.DataProvider;

//Write a program to get the data from the separate class file
/*Benifits -
* One Test method can get the data from different class
* One data provider method in a separate class can share the data to multiple test methods in a multiple classes */
public class DataProviderInSeparateClass {

    @DataProvider(name = "PassNumbers")
    public Object[][] getNumberFromDataProvider()
    {
        return new Object[][]
        {
                {12,28},
                {02,26}
        };
    }
}
