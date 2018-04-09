package com.kidhx.jvmdemo.oom;

import java.util.ArrayList;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 11:28
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        int i=0;

        while (true){
            list.add((i+1)+"");
        }
    }
}
