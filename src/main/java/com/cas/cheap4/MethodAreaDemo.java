package com.cas.cheap4;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午4:05 2021/2/25
 * @version: V1.0
 *
 * 测试设置方法区大小参数的默认值
 * jdk7及之前：
 * -XX:PermSize=100m -XX:MaxPermSize=100m
 *
 * jdk8及以后
 * -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 *
 * @review:
 */
public class MethodAreaDemo {

    public static void main(String[] args) {
        System.out.println("start...");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
