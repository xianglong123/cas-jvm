package com.cas.cheap3;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午12:29 2021/2/25
 * @version: V1.0
 *
 * -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGCDetails -XX:+EliminateAllocations
 * @review: 标量替换案例
 */
public class ScalarReplace {

    static class User {
        private int id;
        private String  name;
    }

    public static void alloc() {
        User u = new User();
        u.id = 5;
        u.name = "xl";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i ++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start) + " ms");
    }




}
