/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.koro.mathutil.core.test;

import com.koro.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author korroo
 */
public class MathUtilityDDTTest {

    public static Object[] initData() {
        Object[][] dataSet = {{0, 1}, 
                              {1, 1}, 
                              {5, 120}
                            };
        return dataSet;
    }

    //data từ nơi khác đưa đến, mảng data đưa vào
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnOk(int n, long expectd) {
        assertEquals(expectd, MathUtility.getFactorial(n));
    }

}
