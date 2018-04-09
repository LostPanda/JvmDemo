package com.kidhx.jvmdemo.gc.memanatool;

import java.util.ArrayList;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 16:35
 */
public class JConsoleMemoryObject {
    public static class OOMObject{
        public byte[] placeholder=new byte[64*1024];
    }

    public static void fillHeap(int num) throws InterruptedException{
        ArrayList<OOMObject> list = new ArrayList<OOMObject>();

        for (int i= 0; i < num; i++) {
            Thread.sleep(100);
            list.add(new OOMObject());
        }

        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
