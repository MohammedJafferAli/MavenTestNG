package testNgAnnotations;

import org.testng.annotations.Test;

public class OnlyTest {

    @Test
    public void methodName(){
        System.out.println("I want to run only the test method using testng @Test annotation");
    }
}
