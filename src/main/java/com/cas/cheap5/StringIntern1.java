package com.cas.cheap5;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午5:21 2021/3/3
 * @version: V1.0
 * @review:
 */
public class StringIntern1 {

    public static void main(String[] args) {
        // StringIntern.java中练习的拓展：
        String s3 = new String("a") + new String("b");
        String s4 = "ab";
        String s5 = s3.intern();
        System.out.println(s3 == s4); // false 一个在堆一个在常量池
        System.out.println(s4 == s5); // true  两个都在常量池
    }

}
