/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.koro.mathutil.main;

import com.koro.mathutil.core.MathUtility;

/**
 *
 * @author korroo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test case #1
        int n = 0;
        long excepted = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected = " + excepted + "| actual = " + actual);

        // Test case #2
        n = 1;
        excepted = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected = " + excepted + "| actual = " + actual);

        // Test case #2
        System.out.println("5! -> expected = 120" + "| actual = " + MathUtility.getFactorial(5));
    }
    
}

//Mình là dev mình phải test code của mình ngon trước đã
//Muốn test code (DEV) hay test app (QC/Tester) thì cần phải chuẩn bị test case - tình huống kiểm thử
//1 test case có cấu trúc như sau:
//ID | Description | Steps/Procedures | Expected Result | Status (Passed/Failed)
//Dev em muốn kiểm thử coi hàm chính em viết getFactorial() đúng hay sai thì em phải thiết kế các test cases
//Test case #1: Verify getFactorial(n = 0)
//Steps-Procedure: Các bước run app để test
//1. Given n = 0
//2. Execute/Call/Invoke function getFactorial(0)
//Expected Result: the function must return 1 (standing for 0! = 1)
//Status: PASSED, or FAILED, ai biết, chờ run đã
//Test case #2: Verify getFactorial(n = 1)
//Steps-Procedure:
//1. Given n = 1
//2. Execute/Call/Invoke function getFactorial(1)
//Expected Result: the function must return 1 (standing for 1! = 1)
//Status: PASSES, or FAILED, ai biết, chờ run đã
//Test case #3: Verify getFactorial(n = 5)
//Steps-Procedure:
//1. Given n = 5
//2. Execute/Call/Invoke function getFactorial(5)
//Expected Result: the function must return 120 (standing for 5! = 120)
//Status: PASSES, or FAILED, ai biết, chờ run đã

