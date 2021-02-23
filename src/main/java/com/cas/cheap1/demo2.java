package com.cas.cheap1;

import com.cas.cheap1.pojo.User;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 上午10:39 2021/2/4
 * @version: V1.0
 * @review:
 */
public class demo2 {

    public static void main(String[] args) {
        User user = new User();
        ClassLoader classLoader = user.getClass().getClassLoader();
        System.out.println(classLoader);
    }

}
