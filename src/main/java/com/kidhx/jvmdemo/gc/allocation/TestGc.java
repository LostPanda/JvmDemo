package com.kidhx.jvmdemo.gc.allocation;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 15:03
 */
//vm args: -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
    //-XX:UseSerialGC(serial/serial old)
public class TestGc {
    public static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;

//        allocation1 = new byte[2 * _1MB];
//        allocation2 = new byte[2 * _1MB];
//        allocation3 = new byte[2 * _1MB];
//        allocation4 = new byte[4 * _1MB];

        //增加vm args: -XX:PretenureSizeThreshold=314528
        allocation4 = new byte[4 * _1MB];
    }
}
