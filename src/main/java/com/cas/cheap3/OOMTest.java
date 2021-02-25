package com.cas.cheap3;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午6:24 2021/2/23
 * @version: V1.0
 * @review: -Xms600m -Xmx600m
 */
public class OOMTest {

    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();
        while(true) {
            try {
                Thread.sleep(20000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }

    }

}


class Picture {
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
