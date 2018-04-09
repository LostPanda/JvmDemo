package com.kidhx.jvmdemo.oom;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 13:25
 */
//-Xmx20m -XX:MaxDirectMemorySize=10M
public class DirectMemoryOOM {
    public static final int _1MB =1024*1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field field = Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        while (true){
            unsafe.allocateMemory(_1MB);
        }
    }
}
