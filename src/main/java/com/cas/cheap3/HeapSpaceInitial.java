package com.cas.cheap3;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午5:33 2021/2/23
 * @version: V1.0
 * @review:
 */
public class HeapSpaceInitial {

    public static void main(String[] args) {

        // 返回java虚拟机中的堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        // 返回java虚拟机试图使用的最大堆内存量
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("-xms : " + initialMemory);
        System.out.println("-xmx : " + maxMemory);

    }

}
