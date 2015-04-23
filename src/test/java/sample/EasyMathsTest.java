/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Szym
 */
public class EasyMathsTest {
    
        public EasyMathsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of equal method, of class EasyMaths.
     */
  
      
     @Test (expected=IllegalArgumentException.class)
    public void diffrentSize_ExpectException_scalarMultiplication() {
        System.out.println("diffrentSize");
      int[] array1 = new int[] { 4, 42 , 2};
        int[] array2 = new int[] { 40, 43};
        EasyMaths myEasyMathsObj = new EasyMaths();
            int result = myEasyMathsObj.scalarMultiplication(array1, array2);
 
     
    }
    
    
    
 
      @Test (expected=IllegalArgumentException.class)
    public void Equal_2NullArrays_ExpectException_scalarMultiplication() {
        System.out.println("Null");
        int[] array1 = null;
        int[] array2 = null;
        EasyMaths myEasyMathsObj = new EasyMaths();
            int result = myEasyMathsObj.scalarMultiplication(array1, array2);
 
     
    }

   @Test   
   public void scalarMultiplication_multiplySum_ExpectException() {
        System.out.println("sum");
        int[] array1 = new int[] { 2, 2};
        int[] array2 = new int[] { 1, 1};
     
        EasyMaths myEasyMathsObj = new EasyMaths();
            int result = myEasyMathsObj.scalarMultiplication(array1, array2);
assertEquals(4, result);
     
    }
    
    
    @Test (expected=IllegalArgumentException.class)
    public void Equal_2NullArrays_ExpectException() {
        System.out.println("equal");
        int[] array1 = null;
        int[] array2 = null;
        EasyMaths myEasyMathsObj = new EasyMaths();
        boolean result = myEasyMathsObj.equal(array1, array2);
 //       assertEquals(expResult, result); Don't needc an Assert as throws exception as soon as called
     
    }
  
  
    @Test
    public void IntegrationTest_compareArrays_ArraysHave0Match_You_have_0_Matching_nos() {
        System.out.println("compareArrays");
        int[] array1 = new int[] { 4, 42};
        int[] array2 = new int[] { 40, 43};
        EasyMaths myEasyMathsObj = new EasyMaths();
        assertEquals("You have 0 matching numbers.", myEasyMathsObj.compareArrays(array1, array2)); 
    }   

    
    @Test
    public void compareArrays_FakeEqualArraysHave0Match_You_have_0_Matching_nos() {
        System.out.println("compareArrays");
        int[] array1 = new int[] { 4, 42};
        int[] array2 = new int[] { 40, 43};
        TestableEasyMaths myFakeEasyMathsObj = new TestableEasyMaths();
        myFakeEasyMathsObj.setResult(false); // Goin to make the fake Equal method returns false ie 
// just get it to make happy noises for the test
        assertEquals("You have 0 matching numbers.", myFakeEasyMathsObj.compareArrays(array1, array2)); 
    }   
    
  

}


