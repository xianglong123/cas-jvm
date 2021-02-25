package com.cas.cheap3;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午12:09 2021/2/25
 * @version: V1.0
 *
 * -Xmx256m -Xms256m -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 * @review: 栈上分配案例
 */
public class StackAllocation {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            alloc();
        }
        // 查看执行时间
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start) + " ms");

        // 为了方便查看堆内存中对象个数，线程sleep
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void alloc() {
        //未发生逃逸
        User user = new User();
    }

}

class User {

}
