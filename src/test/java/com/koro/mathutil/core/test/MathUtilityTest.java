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
//3 Test case trên bad smells vì chỉ khác nhau phần data
//Trong nghề kiểm thử có 1 kĩ thuật là tách hẳn data kiểm thử ra
//1 chỗ cho dễ nhìn, dễ quan lí đc data thiếu đủ hay ko

//sau đó ta đưa bộ data này vào trong câu lệnh so sánh ASSERT()
//Qua các tham số (PARAM)
//Tức là assertequals (ễpcted, actual) là 2 tham số
//ứng vs bộ data đc tách ra
//          120    5!
//          720    6!
//          ...

//      Mảng [4][2] {0, 1} {1, 1}
//Code nhìn gọn, phát hiện đc thiếu đủ test data, test case
//Kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh -> đc gọi
//Là DDT - DATA DRIVEN TESTING - KIỂM THỬ THEO HƯỚNG TÁCH DATA RIÊNG LẺ