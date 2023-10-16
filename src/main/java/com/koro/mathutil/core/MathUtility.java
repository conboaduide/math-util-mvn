/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koro.mathutil.core;

/**
 *
 * @author korroo
 */
public class MathUtility {

    public static final double PI = 3.14;

    
    public static long getFactorial(int n) { //n!
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        // Dừng đệ quy 
        //5! = 1.2.3.4  5
        //5! = 4! x 5
        //4! = ... 
        //2! = 1! x 2 -> Đệ quy luôn có điểm dừng
        //n! = n x (n-1)! Đệ quy là gọi lại chính mình với quy mô nhỏ hơn
        return n * getFactorial(n - 1);
    }
    //Dùng đệ quy, kiểm thử hồi quy - REGRESSION TESTING
    //Trong thực tế làm dự án, code của ta sẽ liên tục đc sửa vì
    //Fix bug thì phải sửa code, sửa hàm
    //Thêm hàm, thêm tính năng
    //Tối ưu hàm cũ, làm hàm cũ gọn hơn dễ đọc hơn chạy nhanh hơn
    //hàm đang ngon - MÀU XANH, NẾU TA SỬA HÀM VÌ LÍ DO GÌ ĐÓ
    //LIỆU RẰNG HÀM CÒN XANH HAY KO, THÌ PHẢI TEST LẠI
    //NẾU TEST = TAY, BĂNG LOG, THÌ CỰC KÌ TỐN TGIAN, MẤT SỨC
    //NẾU CODE CỦA TA CÓ SẴN TEST SCRIPT - CODE KIỂM THỬ
    //TA CHỈ VC RUN LẠI CÁI TEST SCRIPT NÀY
    //NẾU HÀM SỬA NGON, NÓ PHẢI RA MÀU XANH
    //NẾU HÀM SỬA KO NGON, BỊ MÀU ĐỎ!!!!
    //NHỜ TEST SCRIPT TA VẺIFY LẠI 1 HÀM RẤT NHANH -> KIỂM THỬ LẠI
    //THỨ ĐÃ TỪNG KIỂM THỬ ĐỂ DẢM BẢO NÓ CÒN NGON SO VS TRC
    //KHI SỬA ĐC GỌI LÀ KIỂM THỬ HỒI QUY - REGRESSION TESTING
    //NHỜ CI, HỒI QUY LIÊN TỤC

    //Bài này mình thử hồi quy bằng cách sửa lại hàm theo thuật toán
    //Đệ quy - RECURSION
    
    
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        }
//        
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long result = 1; // biến tích lũy, gom dồn vệc nhân, biến con heo
//        //sống sót đến for,
//        // accumnlation
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
}
