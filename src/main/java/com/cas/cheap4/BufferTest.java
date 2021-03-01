package com.cas.cheap4;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午1:57 2021/3/1
 * @version: V1.0
 * @review: 查看直接内存的占用和释放
 */
public class BufferTest {

    // 1GB
    private static final int BUFFER = 1024 * 1024 * 1024;

    public static void main(String[] args) {
        // 直接分配本地内存空间
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("直接内存分配完毕，请求指示！");

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("直接内存开始释放");
        byteBuffer = null;

        System.gc();
        scanner.next();
    }


}
