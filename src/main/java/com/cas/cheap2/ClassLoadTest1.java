package com.cas.cheap2;

import sun.misc.Launcher;

import java.net.URL;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 上午11:24 2021/2/4
 * @version: V1.0
 * @review:
 */
public class ClassLoadTest1 {

    public static void main(String[] args) {
        System.out.println("启动类加载器");

        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        // 查看引导类加载器加载api的路径
        for (URL url: urLs) {
            System.out.println(url);
        }

        System.out.println("扩展类加载器");
        String property = System.getProperty("java.ext.dirs");
        for (String s : property.split(":")) {
            System.out.println(s);
        }


    }


}
