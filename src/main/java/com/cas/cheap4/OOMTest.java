package com.cas.cheap4;


import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 上午11:00 2021/2/26
 * @version: V1.0
 * @review: 演示方法区OOM的情况
 * <p>
 * <p>
 * jdk7
 * -XX:PermSize=10m -XX:MaxPermSize=10m
 * <p>
 * jdk8
 * -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
 *
 */
public class OOMTest extends ClassLoader{

    public static void main(String[] args) {
        int j = 0;
        try {
            OOMTest test = new OOMTest();
            for (int i = 0; i < 10000; i++) {
                // 创建ClassWriter对象，用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                // 指明版本号，修饰符，类名，包名，父类，接口
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "class" + i, null, "java/lang/Object", null);
                // 返回byte[]
                byte[] code = classWriter.toByteArray();
                // class 对象
                test.defineClass("class" + i, code, 0, code.length);
                j++;
            }
        } finally {
            System.out.println(j);
        }


    }

}
