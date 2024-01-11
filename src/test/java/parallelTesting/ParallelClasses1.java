package parallelTesting;

import org.testng.annotations.Test;

public class ParallelClasses1 {


    @Test(priority = 0)
    public void testCase01(){
        System.out.println("Running test case one with thread, ID : "+Thread.currentThread().getId());
    }

    @Test
    public void testCase02(){
        System.out.println("Running test case two with thread, ID : "+Thread.currentThread().getId());
    }

    @Test
    public void testCase03(){
        System.out.println("Running test case three with thread, ID : "+Thread.currentThread().getId());
    }

    @Test
    public void testCase04(){
        System.out.println("Running test case four with thread, ID : "+Thread.currentThread().getId());
    }
}
