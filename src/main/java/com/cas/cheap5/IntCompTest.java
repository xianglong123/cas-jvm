package com.cas.cheap5;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 下午7:36 2021/3/1
 * @version: V1.0
 * @review:
 * 测试解释器模式和JIT编译模式
 * -Xint : 5588ms
 * -Xcomp : 651ms
 * -Xmixed : 625ms
 *
 * 改变编译模式命令 java -Xint -version
 *
 */
public class IntCompTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        testPrimeNumber(1000000);
        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));

    }


    public static void testPrimeNumber(int count) {
        for (int i = 0; i < count; i++) {
            // 计算100以内的质数
            label:
            for (int j = 2; j <= 100; j++) {
                for (int k = 2; k <= Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        continue label;
                    }
                }
            }
        }
    }


}
