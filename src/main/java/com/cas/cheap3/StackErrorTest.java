package com.cas.cheap3;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午2:44 2021/2/22
 * @version: V1.0
 * 修改java栈大小
 * 默认count:10823
 * -Xss256  count:1873
 * @review:
 */
public class StackErrorTest {

    private static int count = 0;

    public static void main(String[] args) {
        System.out.println(count);
        count ++;
        main(args);
    }

}
