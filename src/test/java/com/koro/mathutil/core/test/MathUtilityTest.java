/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.koro.mathutil.core.test;

import com.koro.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author korroo
 */
public class MathUtilityTest {
    
    //Test case 1: verify get factorial (with n = )
    //Steps/Procedures
    //      1. Given n = 0
    //      2. Call/invoke getFactorial (n = 0)
    //Expected Result:
    //      The method must return 1 as the result of 0! = 1
    //Status: Passed | Failed chờ đến lúc runtime mới biết
    
    @Test
    public void verifyFactorialGivenRightArgumentReturns0Ok(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
         
    @Test
    public void verifyFactorialGivenRightArgumentReturns1Ok(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRightArgumentReturns5Ok(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
