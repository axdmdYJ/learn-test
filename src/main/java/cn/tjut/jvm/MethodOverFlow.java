package cn.tjut.jvm;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

/**
     * 演示元空间内存溢出:java.lang.OutOfMemoryError: Metaspace
     * -XX:MaxMetaspaceSize=8m
     */
public class MethodOverFlow extends ClassLoader {//可以用来加载类的二进制字节码

        public static void main(String[] args) {
            int j = 0;
            try {
                MethodOverFlow test = new MethodOverFlow();
                for (int i = 0; i < 10000; i++,j++) {
                    //ClassWriter 作用是生产类的二进制字节码
                    ClassWriter cw = new ClassWriter(0);
                    //版本号，public，类名
                    cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                    //返回 byte[]
                    byte[] code = cw.toByteArray();
                    //执行类的加载
                    test.defineClass("Class" + i, code, 0, code.length);
                }
            } finally {
                System.out.println(j);
            }
        }
    }

