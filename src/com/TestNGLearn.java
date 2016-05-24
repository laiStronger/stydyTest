package com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

/**
 * testng µÄ²âÊÔ
 * @author Administrator
 *
 */
public class TestNGLearn {

    /**
     * Success test
     * @author Administrator
     */
    @Test
    public void testNgLearn1() {
        System.out.println("this is TestNG1 test case");
    }
    
    /**
     * Success test
     * @author Administrator
     */
    @Test
    public void testNgLearn2() {
    	System.out.println("this is TestNG2 test case");
    }
    
    /**
     * Success test
     * @author Administrator
     */
    @Test
    public void testNgLearn3() throws Exception {
    	System.out.println("this is TestNG3 test case");
    	//throw new Exception();
    }

}