package com.cas.cheap5;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午5:21 2021/3/3
 * @version: V1.0
 * @review:
 */
public class StringIntern2 {

    public static void main(String[] args) {
        String s3 = new String("a") + new String("b");
//        String s3 = new String("ab");
        // 常量池
        s3.intern();
        String s4 = "ab";
        System.out.println(s3 == s4);
//        System.out.println(s3 == "ab");
    }

}
