package com.cas.cheap4;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午1:14 2021/3/1
 * @version: V1.0
 * @review:
 *
 * 测试对象实例化的过程
 * 1⃣️加载类元信息 - 2⃣️为对象分配内存 - 3⃣️处理并发问题 - 4⃣️属性的默认初始化（零值初始化）
 * - 5⃣️设置对象头的信息 - 6⃣️属性的显式初始化、代码块中初始化、构造器中初始化
 *
 * 给对象的属性赋值的操作
 * 1⃣️属性的默认初始化 - 2⃣️显式初始化 / 3⃣️代码块中初始化 - 4⃣️构造器中初始化
 *
 */
public class Customer {
    int id = 1001;
    String name;
    Account acct;

    {
        name = "123";
    }

    public Customer() {
        acct = new Account();
    }
}

class Account {

}
