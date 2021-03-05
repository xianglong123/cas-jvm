package com.cas.cheap5;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午10:16 2021/3/1
 * @version: V1.0
 * @review: 测试字符串常量池是不是在堆中，我们限制堆的大小，无线存放字符串
 *
 * jdk7:
 * -XX:PermSize=6m -XX:MaxPermSize=6m -Xms6m -Xmx6m
 *
 * jdk8:
 * -XX:MetaspaceSize=6m -XX:MaxMetaspaceSize=6m -Xms6m -Xmx6m
 *
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 */
public class StringTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while(true) {
            set.add(String.valueOf(i++).intern());
        }
    }

}
