package com.cas.cheap5;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 上午11:39 2021/3/4
 * @version: V1.0
 * @review:
 */
public class StringExer1 {


    public static void main(String[] args) {
        String s = new String("a") + new String("b");
        // 在上一行代码执行完以后，字符串常量池中并没有"ab"
        String s2 = s.intern(); // jdk6中:在串池中创建一个字符串"ab"
                                // jdk8中：串池中没有创建字符串"ab"，而是创建一个引用，指向new String("ab"),返回当前的引用

        System.out.println(s == "ab"); // jdk6:true   jdk8:true
        System.out.println(s2 == "ab");// jdk6:false   jdk8:true

        // jdk8全是true是因为常量池里面的"ab"是指向 堆空间new String("ab")的引用。即时像"ab"这种字符串在jdk8中也是指向堆new String("ab"),所以s2 == "ab"

    }


}
