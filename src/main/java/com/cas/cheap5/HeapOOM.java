package com.cas.cheap5;

import java.util.ArrayList;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午6:48 2021/3/4
 * @version: V1.0
 * 演示OOM异常，配合JP检测
 * @review: -Xmx8m -Xms8m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    byte[] buffer = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();

        int count = 0;
        try {
            while(true) {
                list.add(new HeapOOM());
                count ++;
            }
        } catch (Throwable e) {
            System.out.println("count = " + count);
            e.printStackTrace();
        }
    }

}
