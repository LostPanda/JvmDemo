package com.kidhx.jvmdemo.oom;

/**

 * @Author wb-hx347246
 * @Date 2018/4/8 11:31
 */
public class JDK17ConstantPoolChange {
    public static void main(String[] args) {
        String s = new String("计算机科学");
        String str1 = new StringBuilder().append("计算机").append("科学").toString();
        System.out.println(str1.intern() == str1);


        String str2 = new StringBuilder().append("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
