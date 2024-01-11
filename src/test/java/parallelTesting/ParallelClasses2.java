package parallelTesting;

import org.testng.annotations.Test;

public class ParallelClasses2 {


    @Test(priority = 0)
    public void testCase05(){
        System.out.println("Running test case five with thread, ID : "+Thread.currentThread().getId());
    }

    @Test
    public void testCase06(){
        System.out.println("Running test case six with thread, ID : "+Thread.currentThread().getId());
    }

    @Test
    public void testCase07(){
        System.out.println("Running test case seven with thread, ID : "+Thread.currentThread().getId());
    }

    @Test
    public void testCase08(){
        System.out.println("Running test case eight with thread, ID : "+Thread.currentThread().getId());
    }
}
