package com.cas.cheap5;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午12:04 2021/3/4
 * @version: V1.0
 * @review: intern()节省空间：如果大量对象只引用，重复的对象会被GC
 */
public class StringInter3 {

    private static int Max_COUNT = 1000 * 10000;
    static final String[] arr = new String[Max_COUNT];

    public static void main(String[] args) {
        Integer[] data = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        long start = System.currentTimeMillis();

        for (int i = 0; i < Max_COUNT; i ++) {
//            arr[i] = new String(String.valueOf(data[i%data.length]));// 这里会实打实的创建1000万个对象，在堆开辟空间
            arr[i] = new String(String.valueOf(data[i%data.length])).intern(); // 这里大部分对象都是相等的，都是引用的常量池的数据，所以可以被GC回收掉重复的对象
            // 上面这句话就是，创建一个String对象并没有用到，从常量池中找到对应的值后就被GC掉了，内存空间就下来了
        }

        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));

        try {
            Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
