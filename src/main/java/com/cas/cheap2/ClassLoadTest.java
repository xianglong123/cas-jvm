package com.cas.cheap2;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 上午11:17 2021/2/4
 * @version: V1.0
 * @review:
 */
public class ClassLoadTest {


    public static void main(String[] args) {

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        // sun.misc.Launcher$AppClassLoader@18b4aac2 ｜ 应用类加载器
        System.out.println(systemClassLoader);

        ClassLoader parent = systemClassLoader.getParent();
        // sun.misc.Launcher$ExtClassLoader@5cad8086 | 扩展类加载器 ｜ a/b/c 包含关系
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent();
        // null
        System.out.println(parent1);

        ClassLoader classLoader = String.class.getClassLoader();
        // null
        System.out.println(classLoader);

    }

}
